package com.Veli;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if ve switch
		//Belli aral�klar i�in if kullan�l�r.Swictch case kullan�lmaz.
		//Nokta at��� de�er kontrol� yapmak i�in Switch .. case kullan�l�r.
		// Switch .. case ile yap�labilen her kurgu if else ile yap�labilir. ancak if else  ile yap�lan her kurgu switch .. case ile yap�lamaz.
		// �ki durum i�inde kullan�lan bir kurguda , switch case if else den daha h�zl� �al���r.
		System.out.println("********   ��LEMLER   **********");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1.TOPLAMA");
		System.out.println("2.�IKARMA");
		System.out.println("3.�ARPMA");
		System.out.println("4.B�LME");
		System.out.println("5.MOD ALMA");
		System.out.println("0. � I K I �");
		System.out.println();
		System.out.println("Se�iniz....:");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
		/*
		 * switch kontrol edebilece�i de�er talep eder.
		 * De�er, case ile konttrol edilir. asla ayn� anda iki case e�it olamaz.
		 * NOT!! if i�inde ayn� ko�ul tekrar yaz�labilir, ancak ilk ko�ul �al���r.
		 * break eklenmeli yoksa sonraki sat�rlar �al��maya devam eder.
		 * case i�in s�n�rlar, : ile ba�lar break; aras�d�r. {} kullan�lmaz.
		 */
		
		switch (secim) {
		case 1:
			System.out.println("Toplama Yap�ld�.");
			System.out.println("Yeni bir kod");
			int sayi =5;
			int sayi2=456;
			int toplam = sayi +sayi2;
			System.out.println("toplam de�er...: "+ toplam);
			break;
		case 2:System.out.println("��karma Yap�ld�.");break;
		case 3:System.out.println("�arpma Yap�ld�.");break;
		case 4:System.out.println("B�lme Yap�ld�.");break;
		case 5:System.out.println("Mod alma Yap�ld�.");break;
		case 0:System.out.println("��k�� Yap�ld�.");break;
		default:System.out.println("L�tfen ge�eri bir se�im yap�n�z..");break;
		}

	}

}
