package com.Veli;

import java.util.Scanner;

public class Diziler_Alistirma3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ad�n�z� Giriniz...: ");
		String ad = sc.next();
		// Kullan�c�n�n ad�n� tersten yazd�ran program
		//String ifade i�inde index i verilen karakteri bulan method.
		char karakter = ad.charAt(1);
		System.out.println("Ad�n Tersten yaz�m�...: ");
		for (int i=ad.length()-1;i>=0;i--) {
			System.out.println(ad.charAt(i));
		}
		
		//Soru-> a�a��daki gibi bir metni analiz ederek i�lem yapan profram kodunu yaz�n�z.
		// 6 ile 9 say�s�n�n toplam� nedir?
		// 2 den 5 i ��kar�rsak ka� kal�r?
		// �eklinde kullan�c� taraf�ndan girilen metni analiz ederk i�lem sonucunu bulan kod.
		// sadece rakam girilecek 0-10
		// parametreler + - * / 

	}

}
