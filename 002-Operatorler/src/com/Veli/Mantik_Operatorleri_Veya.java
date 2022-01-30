package com.Veli;

import java.util.Scanner;

public class Mantik_Operatorleri_Veya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kontrol edilmesi istenilen durumlardan herhangi birinin doðru olmasý durumu 
		 * Veya Operatörü ... || dür.
		 */
		//Ýnternet Sitesi giriþleri kuralý sadece kadýnlar yada 20 yaþ ile 40 yaþ arasýnda olanlar
		//ya da 100 yaþ üzeri olanlar
		Scanner sc = new Scanner(System.in);
		System.out.println("Site Giriþi");
		System.out.println("Cinsiyet (E/K)");
		String cinsiyet = sc.nextLine();
		System.out.println("yaþ....: ");
		int yas = sc.nextInt();
		boolean kural1 = cinsiyet.equals("K")||cinsiyet.equals("k")||cinsiyet.equals("Kadýn")||cinsiyet.equals("kadýn");
		//Dikkat!! 4 Ayrý giriþ durumu için Yöntem 1
		kural1 = cinsiyet.equals("k")||
				cinsiyet.equals("K")||
				cinsiyet.equals("Kadýn")||
				cinsiyet.equals("kadýn");
		//Yöntem 2 
		//Not Lowercase-> bir ifadede bütün karakterleri küçük harfe çevirir.
		kural1 = cinsiyet.toLowerCase().equals("k")||
				cinsiyet.toLowerCase().equals("kadýn");
		
		boolean kural2 = yas>=20 &&yas<=40;
		boolean kural3 = yas>100;
		boolean giris_onay = kural1 || kural2 || kural3 ;
		System.out.println("Giriþ Durumu..: "+giris_onay);
	}

}
