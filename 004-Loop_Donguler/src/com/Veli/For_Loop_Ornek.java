package com.Veli;

import java.util.Scanner;

public class For_Loop_Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- 20 ile 100 aras�ndaki say�lar� ekrana yazd�ran program
		 * 2- 40ile 18 ras�ndaki say�lar� azaltarak yazd�ran program
		 * 3- 100 ile 200 aras�ndaki 5 in kat� olan say�ar� listeleyin.
		 * 4- 1 ile 40 aras�ndaki tek say�lar� kulan kodu yaz�n�z.
		 * 5- 1 ile 50 aras�ndaki �ift say�lar�n toplam�n� yazd�ran program
		 * 6- kullan�c�dan ald���n�z de�erin faktoriyel hesaplamas�n� bulunuz.
		 */
		for (int i=20;i<=100;i++){
			System.out.println("i="+i);
			}
		
		for (int i=40;i>=18;i--) {
			System.out.println(i);
			}
		
		for (int i =100; i <=200; i+=5) {
			System.out.println(i);
		}
			
		for (int i = 1; i <=40; i+=2) {
			System.out.println(i);
		}
		int sonuc=0;
		for (int i =0; i <=50; i+=2) {
		
		sonuc = sonuc +i;
		}
		System.out.println(sonuc);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz!...");
		int sayi = sc.nextInt();
		int toplam =1;
		for (int i=1;i <=sayi ;i++){
			toplam = toplam *i;
			}
		System.out.println(toplam);
		
	
	}

}
