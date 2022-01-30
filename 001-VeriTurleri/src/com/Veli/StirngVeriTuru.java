package com.Veli;

public class StirngVeriTuru {

	public static void main(String[] args) {
		// String -> References data type t�r�d�r.
		// Karakter sizi �eklinde ifade edilebilir.
		//char[] value
		//D�KKAT: String methodlar� ile i�lem yapt���n�zda String ifadenin de�eri de�i�mez.
		String ifade = "Bug�n hava g�zel.";
		//diziler her zaman 0 indexden ba�lar.
		//charAT -> index de�eri verilen karakteri verir.
		System.out.println(ifade.charAt(4));
		//....................
		//concat -> String bir ifadeye kelme yapmak i�in kullan�l�r.
		System.out.println(ifade.concat("Bu ne olaki??"));
		System.out.println(ifade+ "yeni i�erik");
		//contains metodu stirng in i�indeki aran�lan de�erin olup olmad���n� g�sterir.
		System.out.println(ifade.contains("hava"));
		//equals -> iki string ifadenin e�itli�ini sorgular.
		String kullanici_adi = "Admin";
		System.out.println(kullanici_adi.equals("Admin"));
		System.out.println(kullanici_adi.equals("administrator"));
		//...................................
		//index.Of -> Bir string ifadede aran�lan ifade ya da karakterin index olarak konumuna d�ner.
		//E�er aran�lan de�er yok ise -1 de�eri d�ner.
		System.out.println(ifade.indexOf("�"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("���"));
		//...........................................
		//replace-> bir string ifade i�indeki de�i�tirilmesi istenilen de�erleri yeni de�erine d�n��t�r�r.
		String resim_url = "Yeni evim ve i�yeri fotosu.jpg";
		String yeni_ifade = resim_url
					.replace(" ","-")
					.replace("�","s");
		System.out.println(yeni_ifade);
		
	}

}
