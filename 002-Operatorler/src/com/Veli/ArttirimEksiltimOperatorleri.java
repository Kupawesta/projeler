package com.Veli;

public class ArttirimEksiltimOperatorleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 5;
		sayi = sayi +1;
		System.out.println("sayi...: "+sayi);
		//++ iþlem operatörü bir sayýnýn deðerini 1 arttýrmak için kullanýlýr.
		sayi++;
		System.out.println("sayi...: "+sayi);
		//-- iþlem operatörü bir sayýnýn deðerini 1 eksiltmek için kullanýlýr.
		sayi--;
		System.out.println("sayi...: "+sayi);
		//Bundan sonraki satýrlar örnek çözümüdür.
		
		int s1=8, s2=5;
		/*
		 * Kural 1 : arttýrma veya eksiltme iþlemi iþlemin olduðu anda olmaz
		 * bir sonraki kullanýmda olur. (ancak prefix ise durum deðiþir.)
		 *Prefix / suffix
		 * eðer önde ise -> iþlem hemen uygulanýr.
		 * eðer sonda ise -> iþlem sonraki kullanýmda uygulanýr.
		 = 8   +  6   +   5  -  4    +  9
		 */
		int toplam =s1++ + ++s2 + --s2 - --s2 + s1++;
		System.out.println(toplam);
	}

}
