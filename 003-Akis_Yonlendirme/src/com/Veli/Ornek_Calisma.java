package com.Veli;

import java.util.Scanner;

public class Ornek_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1-5 aras�nda say� talep edelim.
		 * kullan�c� bu aral�kta say� girmedik�e tekrar etsin.
		 * girilen de�ere g�re i�lem yap�lacak.
		 * 1- toplama 2- ��karma,-3-�arpma, 4-b�lme,5- ��k��.
		 */
		System.out.println("********   ��LEMLER   **********");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1.TOPLAMA");
		System.out.println("2.�IKARMA");
		System.out.println("3.�ARPMA");
		System.out.println("4.B�LME");
		System.out.println("5. � I K I �");
		System.out.println();
		int sayi,sayi2,sonuc,secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Se�iniz....:");
			secim = sc.nextInt();
		}
		while (secim<1 || secim>5);
		
		switch (secim) {
		case 1:
				System.out.println("Birinci say�y� Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("�kinci say�y� G�riniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi + sayi2;
				System.out.println("Sonu�...: "+ sonuc);
				System.out.println("Toplama Yap�ld�.");
				break;
		case 2:
				System.out.println("Birinci say�y� Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("�kinci say�y� G�riniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi - sayi2;
				System.out.println("Sonu�...: "+ sonuc);
				System.out.println("��karma Yap�ld�.");
				break;
		case 3:
				System.out.println("Birinci say�y� Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("�kinci say�y� G�riniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi * sayi2;
				System.out.println("Sonu�...: "+ sonuc);
				System.out.println("�arpma Yap�ld�.");
				break;
		case 4:
				System.out.println("Birinci say�y� Giriniz...: ");
				sayi = sc.nextInt();
				System.out.println("�kinci say�y� G�riniz...: ");
				sayi2 =sc.nextInt();
				sonuc = sayi / sayi2;
				System.out.println("Sonu�...: "+ sonuc);
				System.out.println("B�lme Yap�ld�.");
				break;
		case 5:System.out.println("��k�� Yap�ld�.");break;
		}
	}
}


