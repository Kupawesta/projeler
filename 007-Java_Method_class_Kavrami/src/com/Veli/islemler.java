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
			System.out.println("ÇIKTI");break;
		}
		}while (!cikis);
	}
	public static void Toplama() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1. Sayýyý giriniz...: ");
		double sayi1 = sc.nextDouble();
		System.out.print("2. Sayýyý giriniz...: ");
		double sayi2 = sc.nextDouble();
		double toplam = sayi1+sayi2;
		System.out.println("Toplam...: "+toplam);
	}
	public static void Carpma() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1. Sayýyý giriniz...: ");
		double sayi1 = sc.nextDouble();
		System.out.print("2. Sayýyý giriniz...: ");
		double sayi2 = sc.nextDouble();
		double carpim = sayi1*sayi2;
		System.out.println("Toplam...: "+carpim);
	}
	// Bu method, içindeki kodlarý çalýþtýrýr. Geriye deðer çevirmez.
	public static void EkranaYaz () {
		System.out.println();
		System.out.println("***************************");
		System.out.println("************MERHABA********");
		System.out.println("***************************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- Çarpma");
		System.out.println("0- ÇIKIÞ");
		System.out.println("");
	}
	public static int Secim_Mothodu() {
		int secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Seçiniz..: ");
			secim = sc.nextInt();
			}while (secim<0 || secim>2);
		return secim;
	}
	
	/*
	 * Method tanýmlama
	 * eriþim belirteci -> opsiyoneldir. olmasa da olur
	 * Keyword ler (static,final) -> opsiyeneldir.
	 * geri Dönüþ türü -> zorunludur. (void yada diðer bir deðiþkentürü)
	 * Method Adý -> sorunludur. her method için bir isim vermelisiniz.
	 * Argüman Parantezleri -> Zorunludur, içine deðer girmek opsiyoneldir.
	 * Method Gövdesi Süslü parantezleri -> Zorunludur. kodlar buraya yazýlýr.
	 */
	void ornek_1() {
		
	}
	public static final double ornek_2 (String ifade, int[] dizi) {
		return 0;
	}

}
