package com.Veli;

import java.util.Scanner;

public class alistirmalar3 {

	public static void main(String[] args) {
		//Kodlamalar Main methodunun g�vdesinde olur.
		int sayi;
		//IO-> Input/Output
		//ctrl+space -> intelisence a�mak iin kullan�l�r.
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir say� giriniz..:");
		sayi =sc.nextInt();		
		System.out.println("say� ...: "+sayi);
		double dsayi;
		System.out.println("Double bir sayi giriniz...:");
		dsayi = sc.nextDouble();
		System.out.println("Double sayi...:"+dsayi);
		// sistemden veri �ekerken t�r de�i�imi olursa scanner � yenilemek gerekiyor.
		sc = new Scanner(System.in);
		String ifade;
		System.out.println("bir ifade giriniz...= ");
		ifade = sc.nextLine();
		System.out.println("�fade...: "+ifade);
		

	}//Main Sonu

}//Class Sonu
