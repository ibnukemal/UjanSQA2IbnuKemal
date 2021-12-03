package com.ujiansqa.no_4;
import java.util.Scanner;

public class no4_ibnu_kemal {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) : ");
		double sisa = in.nextDouble();
		System.out.println("Masukkan konsumsi BBM kendaraan(km/liter) : ");
		double jarakPerLiter = in.nextDouble();
		double sisaJarak = hitungSisaJarak(sisa, jarakPerLiter);
		System.out.println("Kendaraan anda dapat menempuh jarak " +sisaJarak+ " Kilometer dengan sisa BBM yang ada di tangki");
		
		}
		static double hitungSisaJarak(double sisa, double jarakPerLiter) {
			double sisaJarak = sisa * jarakPerLiter;
			return sisaJarak;
		}
}
