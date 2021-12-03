package com.ujiansqa.no_1;

import java.util.Scanner;


public class no1_ibnu_kemal {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
		}

		static void cetakFibonacci(int batas) {
			int b = 0;
			int a = 1;
			int nilai = 1;
			for(int x = 1; x <= batas; x++) {
				System.out.print(nilai);
				nilai = a + b;
				b = a;
				a = nilai;
				
			}
			
			
		}

}
