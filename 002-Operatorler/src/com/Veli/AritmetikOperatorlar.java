package com.Veli;

import java.util.Scanner;

public class AritmetikOperatorlar {

	public static void main(String[] args) {
		// Operatörler 
		// 1. Aritmetik Operatörler
		int sayi1,sayi2;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sayi... : ");
		sayi1 = sc.nextInt();
		System.out.println("2. sayi... : ");
		sayi2 = sc.nextInt();
		//Klasik kopyalamadan farklý olarak ctrl+insert / shift+insert kullanýlabilir.
		//ctrl+Alt+aþaðý tuþu satýrý aþaðýya kopyalar.
		/*
		 * toplama +
		 * çýkarma -
		 * bölme /
		 * çarpma *
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
