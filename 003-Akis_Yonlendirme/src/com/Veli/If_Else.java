package com.Veli;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �f....else if... else
		//parantezin i�i do�ru ise uygula.
		String ad="admin";
		String sfr="1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullan�c� ad�...:");
		String k_ad=sc.nextLine();
		System.out.println("Kullan�c� �ifresi...:");
		String k_sfr= sc.nextLine();
		
		if (ad.equals(k_ad)&&sfr.equals(k_sfr)) {
			System.out.println("Giri� Yap�ld�.");
		}else {
			System.out.println("Kullan�c� ad� ya da �ifre hatal�d�r..");
		}
	}

}
