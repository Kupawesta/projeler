package com.Veli;

import java.util.Scanner;

public class AritmetikOperatorlar {

	public static void main(String[] args) {
		// Operat�rler 
		// 1. Aritmetik Operat�rler
		int sayi1,sayi2;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sayi... : ");
		sayi1 = sc.nextInt();
		System.out.println("2. sayi... : ");
		sayi2 = sc.nextInt();
		//Klasik kopyalamadan farkl� olarak ctrl+insert / shift+insert kullan�labilir.
		//ctrl+Alt+a�a�� tu�u sat�r� a�a��ya kopyalar.
		/*
		 * toplama +
		 * ��karma -
		 * b�lme /
		 * �arpma *
		 * mod alma %
		 */
		int toplam =sayi1+sayi2;
		System.out.println("toplam ...= "+toplam);
		int cikarma =sayi1-sayi2;
		System.out.println("toplam ...= "+cikarma);
		int carpma =sayi1*sayi2;
		System.out.println("toplam ...= "+carpma);
		int bolme =sayi1/sayi2;
		System.out.println("toplam ...= "+bolme);
		int mod_alma =sayi1%sayi2;
		System.out.println("toplam ...= "+mod_alma);
		

	}

}
