package com.Veli;

import java.util.Scanner;

public class Diziler_Alistirma_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ****
 * ****
 * ****
 * ****
 * Ekrana Yazd�r
 */
	// 1. Y�ntem
		System.out.println("* * * *");
		System.out.println("* * * *");
		System.out.println("* * * *");
		System.out.println("* * * *");
		System.out.println("---------");
		
		//2. Y�ntem
		for(int i=0;i<4;i++)
			System.out.println("* * * *");
		System.out.println();
		System.out.println("---------");
		
		//3. Y�ntem
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) 
				System.out.print("* ");
			System.out.println();
						
		}
		System.out.println("---------");
		//4. Y�ntem
		for (int i=0;i<4*4;i++) {
			System.out.print("* ");
			if ((i+1)%4==0)
				System.out.println();
		}
			
		//Kullan�c�n�n istedi�i kadar y�ld�z yazd�r...	Kare olsun.
			
		System.out.println("Ka� Y�ld�z Olsun..: ");	
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		for (int i=0;i<sayi;i++) {
			for (int j=0;j<sayi;j++)
				System.out.print("* ");
			System.out.println();
		}
			
		/*
		 * * * * *
		 * *     *
		 * *     *
		 * * * * *
		 * istenilen uzunlukta i�i bo� kare yap	
		 */
		System.out.println("--------------");
		System.out.println("Ka� tane y�ld�z olsun...: ");
		int sayi2 = sc.nextInt();
	
				
			
				
			}
		
	}


