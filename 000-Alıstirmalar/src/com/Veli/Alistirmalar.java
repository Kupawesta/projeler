package com.Veli;

public class Alistirmalar {

	public static void main(String[] args) {
		
		int TelIthalFiyat = 10000;
		System.out.println("Telefon �thal Fiyat� : " + TelIthalFiyat);
		
		int GumrukVerisiTutar� = TelIthalFiyat*5/100;
		System.out.println("G�mr�k Vergisi : " + GumrukVerisiTutar�);
		
		int AraFiyat = TelIthalFiyat + GumrukVerisiTutar�;
		System.out.println("G�mr�k Vergili F�yat� : " + AraFiyat);
		
		int KdvTutar� = TelIthalFiyat*10/100;
		System.out.println("KDV Tutar� : " + KdvTutar�);
		
		AraFiyat = AraFiyat + KdvTutar�;
		System.out.println("KDV li Fiyat� : " + AraFiyat);
	
		int KarPayi = TelIthalFiyat*20/100;
		System.out.println("Kar Pay� Tutar� : " + KarPayi);
		
		AraFiyat = AraFiyat + KarPayi;
		System.out.println("Kar Pay� eklenmi� tutar : " + AraFiyat);
		
		int IndirimTutar� = TelIthalFiyat*15/100;
		System.out.println("�ndirim Tutar� : " + IndirimTutar�);
		
		int SonFiyat = AraFiyat - IndirimTutar�;
		System.out.println("Telefon Sat�� Fiyat� : " + SonFiyat);

	}

}
