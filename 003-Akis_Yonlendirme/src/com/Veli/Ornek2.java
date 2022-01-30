package com.Veli;

import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3 sayýmýz olsun bu sayýlarý kullanýcýdan girdi olarak alalým.
 * bu sayýlardan en büyük ve en küçük olaný bukunuz.
 */
		int s1,s2,s3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz...: ");
		s1= sc.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz...: ");
		s2= sc.nextInt();
		System.out.println("Üçüncü Sayýyý Giriniz...: ");
		s3= sc.nextInt();
		int buyuksayi, kucuksayi;
		buyuksayi=0;
		kucuksayi=0;				
		if (s1>s2 && s1>s3) {
			buyuksayi=s1;
		}else if (s2>s1 && s2>s3) {
			buyuksayi=s2;
		}else if (s3>s1 && s3>s2) {
			buyuksayi=s3;
		}
		System.out.println("Büyük sayý...: "+ buyuksayi);
		
		if (s1<s2 && s1<s3) {
			kucuksayi=s1;
		}else if (s2<s1 && s2<s3) {
			kucuksayi=s2;
		}else if (s3<s1 && s3<s2) {
			kucuksayi=s3;
		}
		System.out.println("Kucuk sayý...: "+ kucuksayi);
	}

}
