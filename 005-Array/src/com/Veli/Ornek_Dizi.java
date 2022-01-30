package com.Veli;

import java.util.Random;
import java.util.Scanner;

public class Ornek_Dizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Kaç adet sayý üretilecek...: ");
		int adet = sc.nextInt();
		int[] sayi_dizisi = new int[adet];
		Random rd = new Random();
		for(int i=0;i<adet;i++) {
			sayi_dizisi[i] =rd.nextInt(10000);
			System.out.println((i+1) +". sayý...: "+sayi_dizisi[i]);
		}
		//hangisi en büyük
		int buyuksayi=0, kucuksayi=0;
		for (int i=0;i<adet;i++) {
			int sayi = sayi_dizisi[i];
			if (i==0) {
				buyuksayi=sayi;
				kucuksayi=sayi;
			}else {
				if(buyuksayi<sayi)
					buyuksayi=sayi;
				if(kucuksayi>sayi)
					kucuksayi=sayi;
								
			}
			System.out.println("En Büyük sayý...:"+buyuksayi);
			System.out.println("En Küçük sayý...:"+kucuksayi);
		}
	}

}
