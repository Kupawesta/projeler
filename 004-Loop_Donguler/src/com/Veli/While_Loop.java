package com.Veli;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While d�ng�s� daha �ok belli kriterleri sa�lama durumlar�nd kullan�l�r.
		 * D�KKAT!! t�m d�ng�ler bir birleri yerine kullan�labilir.
		 * While parantezinin i�indeki durum do�ru oldu�u m�ddet�e devam eder.
		 * e�er parantezin i�i mutlak true ise d�ng� sonsuza gider.
		 */
		boolean kosul= false;
		
		while (kosul) {
			//g�vde , kodlar buraya yaz�l�r.
					
		}
		//..................................
		String secim = "E";
		Scanner sc = new Scanner(System.in);
		while (secim.equals("E"))
			{
			System.out.println("1. say�y� giriniz..: ");
			int s1 = sc.nextInt();
			System.out.println("2. say�y� giriniz..: ");
			int s2 = sc.nextInt();
			
			int toplam =s1+s2;
			System.out.println("Toplam ..: "+toplam);
			sc = new Scanner(System.in);
			System.out.println("Devam Etmek �stiyor Musun (E/H) ");
			secim = sc.nextLine();
			}
		//*******************************
		int faktoriyel=1;
		System.out.println("Bir say� giriniz..: ");
		sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		int sayac=sayi;
		while (sayac>0) {
			faktoriyel*=sayac;
			sayac--;
		}
		System.out.println("Faktoriyel..: "+faktoriyel);
	}

}
