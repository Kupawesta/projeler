package com.Veli;

import java.util.Scanner;

public class Diziler_Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * Bunu kullan?c?dan de?er alarak yazd?r.
		 */
		
		System.out.println("Bir De?er Giriniz : ");
		Scanner sc = new Scanner(System.in);
		int deger = sc.nextInt();
		for (int i=1;i<=deger;i++) {
			for (int j=1;j<=i;j++)
			System.out.print(j+" ");
			System.out.println();
		}
		
		//       1
		//     2   2
		//  3    3    3
		// kullan?c?n?n girdi?i say? adedince e?kenar ??gen yap?lacak.
	}

}
