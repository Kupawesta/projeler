package com.Veli;

import java.util.Scanner;

public class Ornek_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullan�c�dan iki say� alan ald��� say�lar� bir methoda g�nderen ve sonucunu ekrana yazd�ran methodlar b�t�n�n� kodlay�n�z.
		System.out.println("�ki say�n�n Toplam�...: "+Toplama(sayi_al(),sayi_al() ));
		
	}
	public static int sayi_al () {
		System.out.println("Say�y� giriniz...: ");
		Scanner sc = new Scanner(System.in);
		int sayi= sc.nextInt();
		return sayi;
	
	}
	
	public static int Toplama (int sayi1,int sayi2) {
		int toplam =sayi1+sayi2; 
		return toplam;
	}
}
