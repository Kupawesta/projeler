package com.Veli;

import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3 say�m�z olsun bu say�lar� kullan�c�dan girdi olarak alal�m.
 * bu say�lardan en b�y�k ve en k���k olan� bukunuz.
 */
		int s1,s2,s3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Birinci Say�y� Giriniz...: ");
		s1= sc.nextInt();
		System.out.println("�kinci Say�y� Giriniz...: ");
		s2= sc.nextInt();
		System.out.println("���nc� Say�y� Giriniz...: ");
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
		System.out.println("B�y�k say�...: "+ buyuksayi);
		
		if (s1<s2 && s1<s3) {
			kucuksayi=s1;
		}else if (s2<s1 && s2<s3) {
			kucuksayi=s2;
		}else if (s3<s1 && s3<s2) {
			kucuksayi=s3;
		}
		System.out.println("Kucuk say�...: "+ kucuksayi);
	}

}
