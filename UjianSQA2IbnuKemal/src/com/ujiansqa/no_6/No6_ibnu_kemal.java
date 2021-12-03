package com.ujiansqa.no_6;

import java.util.Scanner;

class BebasException extends Exception {
public BebasException(String s) {
super(s);
}
}
public class No6_ibnu_kemal {
	public static void main(String[] args) throws BebasException {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan Jenis Kelamin : ");
		String jk = in.nextLine();
		System.out.println("Masukkan Status : ");
		String status = in.nextLine();
		if(jk == "Pria") {
			if(status == "Single") {
				System.out.println("Pria belum menikah, pajak 10%");
			} else if (status == "Menikah") {
				System.out.println("Pria sudah menikah, pajak 5%");
			} else {
				throw new BebasException("Throw Custom Message Error");
			}
		} else if(jk == "Wanita") {
			if(status == "Single") {
				System.out.println("Wanita belum menikah, pajak 7%");
			} else if (status=="Menikah"){
				System.out.println("Wanita sudah menikah, pajak 3%");
			} else {
				throw new BebasException("Throw Custom Message Error");
			}
		} else {
			throw new BebasException("Throw Custom Message Error");
		}
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin
		//tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut
		// catch
		try {
		throw new BebasException("Throw Custom Message Error");
		} catch (BebasException bebas) {
		// TODO: handle exception
		System.out.println("Bebas Exception");
		System.out.println(bebas.getMessage());
		}
		}

}
