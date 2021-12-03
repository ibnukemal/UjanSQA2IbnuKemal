package com.ujiansqa.no_3;

import java.util.Scanner;

public class No3_IbnuKemal {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Masukkan Jarak (kilometer) : ");
		
		double jarak = in.nextDouble();
		System.out.println("Masukkan Waktu (Jam) : ");
		double waktu = in.nextDouble();
		double kecepatan = hitungKecepatan(jarak, waktu);
		System.out.println("Kecepatan rata-rata : " +kecepatan);
		}
	
		static double hitungKecepatan( double jarak, double waktu) {
			double kecepatan = jarak/waktu;
			return kecepatan;
		
		}
}
