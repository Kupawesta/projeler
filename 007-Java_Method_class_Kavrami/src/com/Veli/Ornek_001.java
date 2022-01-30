package com.Veli;

import java.util.Scanner;

public class Ornek_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullanýcýdan iki sayý alan aldýðý sayýlarý bir methoda gönderen ve sonucunu ekrana yazdýran methodlar bütününü kodlayýnýz.
		System.out.println("Ýki sayýnýn Toplamý...: "+Toplama(sayi_al(),sayi_al() ));
		
	}
	public static int sayi_al () {
		System.out.println("Sayýyý giriniz...: ");
		Scanner sc = new Scanner(System.in);
		int sayi= sc.nextInt();
		return sayi;
	
	}
	
	public static int Toplama (int sayi1,int sayi2) {
		int toplam =sayi1+sayi2; 
		return toplam;
	}
}
