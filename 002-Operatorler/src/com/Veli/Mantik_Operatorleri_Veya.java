package com.Veli;

import java.util.Scanner;

public class Mantik_Operatorleri_Veya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kontrol edilmesi istenilen durumlardan herhangi birinin do�ru olmas� durumu 
		 * Veya Operat�r� ... || d�r.
		 */
		//�nternet Sitesi giri�leri kural� sadece kad�nlar yada 20 ya� ile 40 ya� aras�nda olanlar
		//ya da 100 ya� �zeri olanlar
		Scanner sc = new Scanner(System.in);
		System.out.println("Site Giri�i");
		System.out.println("Cinsiyet (E/K)");
		String cinsiyet = sc.nextLine();
		System.out.println("ya�....: ");
		int yas = sc.nextInt();
		boolean kural1 = cinsiyet.equals("K")||cinsiyet.equals("k")||cinsiyet.equals("Kad�n")||cinsiyet.equals("kad�n");
		//Dikkat!! 4 Ayr� giri� durumu i�in Y�ntem 1
		kural1 = cinsiyet.equals("k")||
				cinsiyet.equals("K")||
				cinsiyet.equals("Kad�n")||
				cinsiyet.equals("kad�n");
		//Y�ntem 2 
		//Not Lowercase-> bir ifadede b�t�n karakterleri k���k harfe �evirir.
		kural1 = cinsiyet.toLowerCase().equals("k")||
				cinsiyet.toLowerCase().equals("kad�n");
		
		boolean kural2 = yas>=20 &&yas<=40;
		boolean kural3 = yas>100;
		boolean giris_onay = kural1 || kural2 || kural3 ;
		System.out.println("Giri� Durumu..: "+giris_onay);
	}

}
