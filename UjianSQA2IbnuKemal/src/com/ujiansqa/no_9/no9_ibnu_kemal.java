package com.ujiansqa.no_9;

import java.util.Scanner;

public class no9_ibnu_kemal {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan Jumlah Nilai = ");
		int nilai = in.nextInt();
		System.out.println("Nilainya adalah " +nilai);
		System.out.println("Masukkan Nilai Array = ");
		int arr = in.nextInt();
		System.out.println("Nilainya adalah " +nilai);
		
		}
	
	public int jumlahArray(int[] nilai) {
		 int sum = 0;
		 for (int i = 0; i<nilai.length; i++) {
		  sum += nilai[i];
		 }
		 return sum;
		}
		public boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x<arr.length; x++) {
		  if (arr[x] == nilai)
		   return true;
		 }
		 return false;
		}

}
