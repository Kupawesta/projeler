package com.Veli;

import java.util.Scanner;

public class Mantik_Operatorleri_Ve {

	public static void main(String[] args) {
		/*
		 * VE Operat�r� && d�r.
		 */
		String kullaniciadi="Veli";
		String sifre= "M12";
		Scanner sc = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("*****LOGIN PAGE ****");
		System.out.println("********************");
		System.out.println();
		System.out.println("Kullan�c� Ad�...: ");
		String giris_adi =sc.nextLine();
		System.out.println("��fre...... : ");
		String giris_sifre = sc.nextLine();
		boolean ka = kullaniciadi.equals(giris_adi);
		boolean sf = sifre.equals(giris_sifre);
		boolean sonuc = ka && sf; //Kullan�c� ad� ve �ifrenin ayn� anda do�ru olmas�n� irdeler.ikiside do�ru olursa ancak o zaman true d�ner.	
		// Bu �ekilde de yaz�labilir. sonuc = kullaniciadi==giris_adi && sifre == siris_sifre
		System.out.println("Giri� Yap�ld� M�?..." + sonuc);
		/*
		 * UYARI : console ekran�ndan al�nan String ifadelerinin kar��la�t�r�lmas� == ile yap�l�rsa sonu� hatal� ��kar 
		 * yerine "equals" kullan�lacak
		 */
		System.out.println("�yelik Ekran�");
		System.out.println("email...: ");
		String ad = sc.nextLine();
		System.out.println("�ifre...: ");
		String pss = sc.nextLine();
		System.out.println("�ifre Do�rula....: ");
		String pss2 =sc.nextLine();
		/*
		 * Kurallar
		 * 1. Kullan�c� ad� 3 karakterden fazla olmal�
		 * 2.email olmal�
		 * 3. �ifre en az 8 karakter olmal�
		 * 4. �ifreler ayn� olmal�
		 */
		boolean kullanici_karakter_uzunlugu = ad.length()>2;
		boolean kullanici_email_mi = ad.contains("@");
		boolean sifre_uzunlugu = pss.length()>7;
		boolean sifre_dogrulama = pss.equals(pss2);
		
		boolean uyelik = kullanici_email_mi && kullanici_karakter_uzunlugu && sifre_uzunlugu && sifre_dogrulama ;
		System.out.println("�yelik oldu mu?... "+uyelik);
	}

}
