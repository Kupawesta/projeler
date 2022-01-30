package com.Veli;

import java.util.Scanner;

public class Ornek_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1-5 arasýnda sayý talep edelim.
		 * kullanýcý bu aralýkta sayý girmedikçe tekrar etsin.
		 * girilen deðere göre iþlem yapýlacak.
		 * 1- toplama 2- çýkarma,-3-çarpma, 4-bölme,5- çýkýþ.
		 */
		System.out.println("********   ÝÞLEMLER   **********");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1.TOPLAMA");
		System.out.println("2.ÇIKARMA");
		System.out.println("3.ÇARPMA");
		System.out.println("4.BÖLME");
		System.out.println("5. Ç I K I Þ");
		System.out.println();
		int sayi,sayi2,sonuc,secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Seçiniz....:");
			secim = sc.nextInt();
		}
		while (secim<1 || secim>5);
		
		switch (secim) {
		case 1:
				System.out.println("Birinci sayýyý Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("Ýkinci sayýyý GÝriniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi + sayi2;
				System.out.println("Sonuç...: "+ sonuc);
				System.out.println("Toplama Yapýldý.");
				break;
		case 2:
				System.out.println("Birinci sayýyý Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("Ýkinci sayýyý GÝriniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi - sayi2;
				System.out.println("Sonuç...: "+ sonuc);
				System.out.println("Çýkarma Yapýldý.");
				break;
		case 3:
				System.out.println("Birinci sayýyý Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("Ýkinci sayýyý GÝriniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi * sayi2;
				System.out.println("Sonuç...: "+ sonuc);
				System.out.println("Çarpma Yapýldý.");
				break;
		case 4:
				System.out.println("Birinci sayýyý Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("Ýkinci sayýyý GÝriniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi / sayi2;
				System.out.println("Sonuç...: "+ sonuc);
				System.out.println("Bölme Yapýldý.");
				break;
		case 5:System.out.println("Çýkýþ Yapýldý.");break;
		}
	}
}


