package com.Veli;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While döngüsü daha çok belli kriterleri saðlama durumlarýnd kullanýlýr.
		 * DÝKKAT!! tüm döngüler bir birleri yerine kullanýlabilir.
		 * While parantezinin içindeki durum doðru olduðu müddetçe devam eder.
		 * eðer parantezin içi mutlak true ise döngü sonsuza gider.
		 */
		boolean kosul= false;
		
		while (kosul) {
			//gövde , kodlar buraya yazýlýr.
					
		}
		//..................................
		String secim = "E";
		Scanner sc = new Scanner(System.in);
		while (secim.equals("E"))
			{
			System.out.println("1. sayýyý giriniz..: ");
			int s1 = sc.nextInt();
			System.out.println("2. sayýyý giriniz..: ");
			int s2 = sc.nextInt();
			
			int toplam =s1+s2;
			System.out.println("Toplam ..: "+toplam);
			sc = new Scanner(System.in);
			System.out.println("Devam Etmek Ýstiyor Musun (E/H) ");
			secim = sc.nextLine();
			}
		//*******************************
		int faktoriyel=1;
		System.out.println("Bir sayý giriniz..: ");
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
