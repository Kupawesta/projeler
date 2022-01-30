package com.Veli;

import java.util.Scanner;

public class alistirmalar3 {

	public static void main(String[] args) {
		//Kodlamalar Main methodunun gövdesinde olur.
		int sayi;
		//IO-> Input/Output
		//ctrl+space -> intelisence açmak iin kullanýlýr.
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayý giriniz..:");
		sayi =sc.nextInt();		
		System.out.println("sayý ...: "+sayi);
		double dsayi;
		System.out.println("Double bir sayi giriniz...:");
		dsayi = sc.nextDouble();
		System.out.println("Double sayi...:"+dsayi);
		// sistemden veri çekerken tür deðiþimi olursa scanner ý yenilemek gerekiyor.
		sc = new Scanner(System.in);
		String ifade;
		System.out.println("bir ifade giriniz...= ");
		ifade = sc.nextLine();
		System.out.println("Ýfade...: "+ifade);
		

	}//Main Sonu

}//Class Sonu
