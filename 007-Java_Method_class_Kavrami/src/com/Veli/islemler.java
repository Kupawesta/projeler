package com.Veli;

import java.util.Scanner;

public class islemler {
	public static void uygulama() {
		boolean cikis =false;
		do {
		EkranaYaz();
		switch (Secim_Mothodu()) {
		case 1:
			Toplama();
			break;
		case 2:
			Carpma();
			break;
		default: 
			cikis =true;
			System.out.println("�IKTI");break;
		}
		}while (!cikis);
	}
	public static void Toplama() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1. Say�y� giriniz...: ");
		double sayi1 = sc.nextDouble();
		System.out.print("2. Say�y� giriniz...: ");
		double sayi2 = sc.nextDouble();
		double toplam = sayi1+sayi2;
		System.out.println("Toplam...: "+toplam);
	}
	public static void Carpma() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1. Say�y� giriniz...: ");
		double sayi1 = sc.nextDouble();
		System.out.print("2. Say�y� giriniz...: ");
		double sayi2 = sc.nextDouble();
		double carpim = sayi1*sayi2;
		System.out.println("Toplam...: "+carpim);
	}
	// Bu method, i�indeki kodlar� �al��t�r�r. Geriye de�er �evirmez.
	public static void EkranaYaz () {
		System.out.println();
		System.out.println("***************************");
		System.out.println("************MERHABA********");
		System.out.println("***************************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- �arpma");
		System.out.println("0- �IKI�");
		System.out.println("");
	}
	public static int Secim_Mothodu() {
		int secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Se�iniz..: ");
			secim = sc.nextInt();
			}while (secim<0 || secim>2);
		return secim;
	}
	
	/*
	 * Method tan�mlama
	 * eri�im belirteci -> opsiyoneldir. olmasa da olur
	 * Keyword ler (static,final) -> opsiyeneldir.
	 * geri D�n�� t�r� -> zorunludur. (void yada di�er bir de�i�kent�r�)
	 * Method Ad� -> sorunludur. her method i�in bir isim vermelisiniz.
	 * Arg�man Parantezleri -> Zorunludur, i�ine de�er girmek opsiyoneldir.
	 * Method G�vdesi S�sl� parantezleri -> Zorunludur. kodlar buraya yaz�l�r.
	 */
	void ornek_1() {
		
	}
	public static final double ornek_2 (String ifade, int[] dizi) {
		return 0;
	}

}
