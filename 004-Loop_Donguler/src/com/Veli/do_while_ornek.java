package com.Veli;

import java.util.Random;
import java.util.Scanner;

public class do_while_ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int sayi = rd.nextInt(8);
		boolean buldu_mu;
		int tahminsayisi=0;
		
		do {
			System.out.println("0 ile 8 arasýnda bir sayý giriniz...");
			int tahmin = sc.nextInt();
			buldu_mu = sayi==tahmin;
			tahminsayisi++;
		}while (!buldu_mu);
		System.out.println("Aferin sana "+tahminsayisi+ ". tahminde buldun");
		
		
	}

}
