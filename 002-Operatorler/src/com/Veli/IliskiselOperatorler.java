package com.Veli;

import java.util.Scanner;

public class IliskiselOperatorler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ili�ki operat�rleri iki de�i�kenin birbirine g�re durumunu irdeler.
		 * sonu� olarak da true /false de�eri d�nd�r�r.
		 * > b�y�kt�r.   < k���kt�r.   >= b�y�k ve e�ittir.  <= k���k ve e�ittir. 
		 * == e�ittir
		 * !de�illemek=> != e�it de�ildir demek 
		 */
		int sayi2,sayi1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayi...: ");
		sayi1=sc.nextInt();
		System.out.println("2. Sayi...: ");
		sayi2=sc.nextInt();
		boolean durum;
			durum=sayi1>sayi2;
			System.out.println("s1 sayi s2 den b�y�k m�d�r?...:" +durum);
		
	}

}
