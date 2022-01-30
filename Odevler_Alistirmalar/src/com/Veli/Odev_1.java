package com.Veli;

import java.util.Scanner;

public class Odev_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ýstenilen karenin uzunluðunu giriniz..:");
		Scanner sc = new Scanner(System.in);
		int uzunluk = sc.nextInt();
		for (int i=0; i<uzunluk;i++) {
			for(int j=0;j<uzunluk;j++) {
				if (i==0 || i==(uzunluk-1) || j==0 || j==(uzunluk-1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}//Main sonu

}//Class sonu
