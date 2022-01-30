package com.Veli;

import java.util.Scanner;

public class Mantik_Operatorleri_Ve {

	public static void main(String[] args) {
		/*
		 * VE Operatörü && dür.
		 */
		String kullaniciadi="Veli";
		String sifre= "M12";
		Scanner sc = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("*****LOGIN PAGE ****");
		System.out.println("********************");
		System.out.println();
		System.out.println("Kullanýcý Adý...: ");
		String giris_adi =sc.nextLine();
		System.out.println("ÞÝfre...... : ");
		String giris_sifre = sc.nextLine();
		boolean ka = kullaniciadi.equals(giris_adi);
		boolean sf = sifre.equals(giris_sifre);
		boolean sonuc = ka && sf; //Kullanýcý adý ve þifrenin ayný anda doðru olmasýný irdeler.ikiside doðru olursa ancak o zaman true döner.	
		// Bu þekilde de yazýlabilir. sonuc = kullaniciadi==giris_adi && sifre == siris_sifre
		System.out.println("Giriþ Yapýldý Mý?..." + sonuc);
		/*
		 * UYARI : console ekranýndan alýnan String ifadelerinin karþýlaþtýrýlmasý == ile yapýlýrsa sonuç hatalý çýkar 
		 * yerine "equals" kullanýlacak
		 */
		System.out.println("Üyelik Ekraný");
		System.out.println("email...: ");
		String ad = sc.nextLine();
		System.out.println("Þifre...: ");
		String pss = sc.nextLine();
		System.out.println("Þifre Doðrula....: ");
		String pss2 =sc.nextLine();
		/*
		 * Kurallar
		 * 1. Kullanýcý adý 3 karakterden fazla olmalý
		 * 2.email olmalý
		 * 3. þifre en az 8 karakter olmalý
		 * 4. þifreler ayný olmalý
		 */
		boolean kullanici_karakter_uzunlugu = ad.length()>2;
		boolean kullanici_email_mi = ad.contains("@");
		boolean sifre_uzunlugu = pss.length()>7;
		boolean sifre_dogrulama = pss.equals(pss2);
		
		boolean uyelik = kullanici_email_mi && kullanici_karakter_uzunlugu && sifre_uzunlugu && sifre_dogrulama ;
		System.out.println("Üyelik oldu mu?... "+uyelik);
	}

}
