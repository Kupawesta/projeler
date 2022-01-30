package com.Veli;

public class StirngVeriTuru {

	public static void main(String[] args) {
		// String -> References data type türüdür.
		// Karakter sizi þeklinde ifade edilebilir.
		//char[] value
		//DÝKKAT: String methodlarý ile iþlem yaptýðýnýzda String ifadenin deðeri deðiþmez.
		String ifade = "Bugün hava güzel.";
		//diziler her zaman 0 indexden baþlar.
		//charAT -> index deðeri verilen karakteri verir.
		System.out.println(ifade.charAt(4));
		//....................
		//concat -> String bir ifadeye kelme yapmak için kullanýlýr.
		System.out.println(ifade.concat("Bu ne olaki??"));
		System.out.println(ifade+ "yeni içerik");
		//contains metodu stirng in içindeki aranýlan deðerin olup olmadýðýný gösterir.
		System.out.println(ifade.contains("hava"));
		//equals -> iki string ifadenin eþitliðini sorgular.
		String kullanici_adi = "Admin";
		System.out.println(kullanici_adi.equals("Admin"));
		System.out.println(kullanici_adi.equals("administrator"));
		//...................................
		//index.Of -> Bir string ifadede aranýlan ifade ya da karakterin index olarak konumuna döner.
		//Eðer aranýlan deðer yok ise -1 deðeri döner.
		System.out.println(ifade.indexOf("ü"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("ÞÞÞ"));
		//...........................................
		//replace-> bir string ifade içindeki deðiþtirilmesi istenilen deðerleri yeni deðerine dönüþtürür.
		String resim_url = "Yeni evim ve iþyeri fotosu.jpg";
		String yeni_ifade = resim_url
					.replace(" ","-")
					.replace("þ","s");
		System.out.println(yeni_ifade);
		
	}

}
