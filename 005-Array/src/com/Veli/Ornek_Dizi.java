package com.Veli;

import java.util.Random;
import java.util.Scanner;

public class Ornek_Dizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Ka� adet say� �retilecek...: ");
		int adet = sc.nextInt();
		int[] sayi_dizisi = new int[adet];
		Random rd = new Random();
		for(int i=0;i<adet;i++) {
			sayi_dizisi[i] =rd.nextInt(10000);
			System.out.println((i+1) +". say�...: "+sayi_dizisi[i]);
		}
		//hangisi en b�y�k
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
			System.out.println("En B�y�k say�...:"+buyuksayi);
			System.out.println("En K���k say�...:"+kucuksayi);
		}
	}

}
