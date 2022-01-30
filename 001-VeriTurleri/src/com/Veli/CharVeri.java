package com.Veli;
/*
 * char deðiþkeni tek týrnak içine yazýlýr ve tek bir karakter tutar.
 * 16 bit büyüklüðünde deðer saklar
 * uluslararasý standart olan unicode tablosu içerisindeki tüm karakterleri içerir.
 * Unicode tablosunda 65535 adet deðer olduðu için 8 bit deðil 16 bit deðer aralýðýndýr.
 * www.unicode-table.com/en/ tablo adresi
 */
public class CharVeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chardeger = 'A';
		System.out.println(chardeger);
		
		int charsayisaldeger = chardeger;
		System.out.println("char sayýsal deðeri : " + charsayisaldeger);
		
		// burasý önemli A harfinin deðerini +1 ekleyerek B harfinin deðerine dönüþtürebilmemiz için önüne char yazmalýyýz yoksa deðeri integer olarak a karþýlýðý olan sayý kabul eder.
		
		charsayisaldeger = (char)(chardeger+1);
		System.out.println(charsayisaldeger);
		
		
	}

}
