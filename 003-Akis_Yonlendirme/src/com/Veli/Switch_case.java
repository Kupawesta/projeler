package com.Veli;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if ve switch
		//Belli aralýklar için if kullanýlýr.Swictch case kullanýlmaz.
		//Nokta atýþý deðer kontrolü yapmak için Switch .. case kullanýlýr.
		// Switch .. case ile yapýlabilen her kurgu if else ile yapýlabilir. ancak if else  ile yapýlan her kurgu switch .. case ile yapýlamaz.
		// Ýki durum içinde kullanýlan bir kurguda , switch case if else den daha hýzlý çalýþýr.
		System.out.println("********   ÝÞLEMLER   **********");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1.TOPLAMA");
		System.out.println("2.ÇIKARMA");
		System.out.println("3.ÇARPMA");
		System.out.println("4.BÖLME");
		System.out.println("5.MOD ALMA");
		System.out.println("0. Ç I K I Þ");
		System.out.println();
		System.out.println("Seçiniz....:");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		/*
		 * switch kontrol edebileceði deðer talep eder.
		 * Deðer, case ile konttrol edilir. asla ayný anda iki case eþit olamaz.
		 * NOT!! if içinde ayný koþul tekrar yazýlabilir, ancak ilk koþul çalýþýr.
		 * break eklenmeli yoksa sonraki satýrlar çalýþmaya devam eder.
		 * case için sýnýrlar, : ile baþlar break; arasýdýr. {} kullanýlmaz.
		 */
		
		switch (secim) {
		case 1:
			System.out.println("Toplama Yapýldý.");
			System.out.println("Yeni bir kod");
			int sayi =5;
			int sayi2=456;
			int toplam = sayi +sayi2;
			System.out.println("toplam deðer...: "+ toplam);
			break;
		case 2:System.out.println("Çýkarma Yapýldý.");break;
		case 3:System.out.println("Çarpma Yapýldý.");break;
		case 4:System.out.println("Bölme Yapýldý.");break;
		case 5:System.out.println("Mod alma Yapýldý.");break;
		case 0:System.out.println("Çýkýþ Yapýldý.");break;
		default:System.out.println("Lütfen geçeri bir seçim yapýnýz..");break;
		}

	}

}
