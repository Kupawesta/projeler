package com.Veli;

import java.util.Scanner;

public class IliskiselOperatorler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * iliþki operatörleri iki deðiþkenin birbirine göre durumunu irdeler.
		 * sonuç olarak da true /false deðeri döndürür.
		 * > büyüktür.   < küçüktür.   >= büyük ve eþittir.  <= küçük ve eþittir. 
		 * == eþittir
		 * !deðillemek=> != eþit deðildir demek 
		 */
		int sayi2,sayi1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayi...: ");
		sayi1=sc.nextInt();
		System.out.println("2. Sayi...: ");
		sayi2=sc.nextInt();
		boolean durum;
			durum=sayi1>sayi2;
			System.out.println("s1 sayi s2 den büyük müdür?...:" +durum);
		
	}

}
