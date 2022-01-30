package com.Veli;
/*
 * char de�i�keni tek t�rnak i�ine yaz�l�r ve tek bir karakter tutar.
 * 16 bit b�y�kl���nde de�er saklar
 * uluslararas� standart olan unicode tablosu i�erisindeki t�m karakterleri i�erir.
 * Unicode tablosunda 65535 adet de�er oldu�u i�in 8 bit de�il 16 bit de�er aral���nd�r.
 * www.unicode-table.com/en/ tablo adresi
 */
public class CharVeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chardeger = 'A';
		System.out.println(chardeger);
		
		int charsayisaldeger = chardeger;
		System.out.println("char say�sal de�eri : " + charsayisaldeger);
		
		// buras� �nemli A harfinin de�erini +1 ekleyerek B harfinin de�erine d�n��t�rebilmemiz i�in �n�ne char yazmal�y�z yoksa de�eri integer olarak a kar��l��� olan say� kabul eder.
		
		charsayisaldeger = (char)(chardeger+1);
		System.out.println(charsayisaldeger);
		
		
	}

}
