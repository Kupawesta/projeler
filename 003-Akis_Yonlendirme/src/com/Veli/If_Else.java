package com.Veli;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ýf....else if... else
		//parantezin içi doðru ise uygula.
		String ad="admin";
		String sfr="1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanýcý adý...:");
		String k_ad=sc.nextLine();
		System.out.println("Kullanýcý þifresi...:");
		String k_sfr= sc.nextLine();
		
		if (ad.equals(k_ad)&&sfr.equals(k_sfr)) {
			System.out.println("Giriþ Yapýldý.");
		}else {
			System.out.println("Kullanýcý adý ya da þifre hatalýdýr..");
		}
	}

}
