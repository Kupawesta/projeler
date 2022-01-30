package com.Veli;

import java.util.Scanner;

public class Odev_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eþkenar üçgenin boyutunu giriniz..:");
		Scanner sc = new Scanner(System.in);
		int uzunluk = sc.nextInt();
		int bosluk = uzunluk;
		int sira=1;
		for (int i=0; i<uzunluk;i++) {
			for (int  k=0;k<bosluk;k++)
				System.out.print(" ");
			for (int j=0;j<sira;j++)
				System.out.print(sira+" ");
			sira++;
			bosluk--;
			System.out.println();
		}
		
	}//Main sonu

}//Class sonu
