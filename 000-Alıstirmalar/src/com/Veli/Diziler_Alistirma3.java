package com.Veli;

import java.util.Scanner;

public class Diziler_Alistirma3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adýnýzý Giriniz...: ");
		String ad = sc.next();
		// Kullanýcýnýn adýný tersten yazdýran program
		//String ifade içinde index i verilen karakteri bulan method.
		char karakter = ad.charAt(1);
		System.out.println("Adýn Tersten yazýmý...: ");
		for (int i=ad.length()-1;i>=0;i--) {
			System.out.println(ad.charAt(i));
		}
		
		//Soru-> aþaðýdaki gibi bir metni analiz ederek iþlem yapan profram kodunu yazýnýz.
		// 6 ile 9 sayýsýnýn toplamý nedir?
		// 2 den 5 i çýkarýrsak kaç kalýr?
		// þeklinde kullanýcý tarafýndan girilen metni analiz ederk iþlem sonucunu bulan kod.
		// sadece rakam girilecek 0-10
		// parametreler + - * / 

	}

}
