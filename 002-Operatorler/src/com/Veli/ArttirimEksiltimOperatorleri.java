package com.Veli;

public class ArttirimEksiltimOperatorleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 5;
		sayi = sayi +1;
		System.out.println("sayi...: "+sayi);
		//++ i�lem operat�r� bir say�n�n de�erini 1 artt�rmak i�in kullan�l�r.
		sayi++;
		System.out.println("sayi...: "+sayi);
		//-- i�lem operat�r� bir say�n�n de�erini 1 eksiltmek i�in kullan�l�r.
		sayi--;
		System.out.println("sayi...: "+sayi);
		//Bundan sonraki sat�rlar �rnek ��z�m�d�r.
		
		int s1=8, s2=5;
		/*
		 * Kural 1 : artt�rma veya eksiltme i�lemi i�lemin oldu�u anda olmaz
		 * bir sonraki kullan�mda olur. (ancak prefix ise durum de�i�ir.)
		 *Prefix / suffix
		 * e�er �nde ise -> i�lem hemen uygulan�r.
		 * e�er sonda ise -> i�lem sonraki kullan�mda uygulan�r.
		 = 8   +  6   +   5  -  4    +  9
		 */
		int toplam =s1++ + ++s2 + --s2 - --s2 + s1++;
		System.out.println(toplam);
	}

}
