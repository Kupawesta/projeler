package com.Veli;

public class Alistirmalar {

	public static void main(String[] args) {
		
		int TelIthalFiyat = 10000;
		System.out.println("Telefon Ýthal Fiyatý : " + TelIthalFiyat);
		
		int GumrukVerisiTutarý = TelIthalFiyat*5/100;
		System.out.println("Gümrük Vergisi : " + GumrukVerisiTutarý);
		
		int AraFiyat = TelIthalFiyat + GumrukVerisiTutarý;
		System.out.println("Gümrük Vergili FÝyatý : " + AraFiyat);
		
		int KdvTutarý = TelIthalFiyat*10/100;
		System.out.println("KDV Tutarý : " + KdvTutarý);
		
		AraFiyat = AraFiyat + KdvTutarý;
		System.out.println("KDV li Fiyatý : " + AraFiyat);
	
		int KarPayi = TelIthalFiyat*20/100;
		System.out.println("Kar Payý Tutarý : " + KarPayi);
		
		AraFiyat = AraFiyat + KarPayi;
		System.out.println("Kar Payý eklenmiþ tutar : " + AraFiyat);
		
		int IndirimTutarý = TelIthalFiyat*15/100;
		System.out.println("Ýndirim Tutarý : " + IndirimTutarý);
		
		int SonFiyat = AraFiyat - IndirimTutarý;
		System.out.println("Telefon Satýþ Fiyatý : " + SonFiyat);

	}

}
