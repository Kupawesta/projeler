package com.Veli;

import java.util.Scanner;

public class For_Loop_Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1- 20 ile 100 arasýndaki sayýlarý ekrana yazdýran program
		 * 2- 40ile 18 rasýndaki sayýlarý azaltarak yazdýran program
		 * 3- 100 ile 200 arasýndaki 5 in katý olan sayýarý listeleyin.
		 * 4- 1 ile 40 arasýndaki tek sayýlarý kulan kodu yazýnýz.
		 * 5- 1 ile 50 arasýndaki çift sayýlarýn toplamýný yazdýran program
		 * 6- kullanýcýdan aldýðýnýz deðerin faktoriyel hesaplamasýný bulunuz.
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
		
		System.out.println("Bir sayý giriniz!...");
		int sayi = sc.nextInt();
		int toplam =1;
		for (int i=1;i <=sayi ;i++){
			toplam = toplam *i;
			}
		System.out.println(toplam);
		
	
	}

}
