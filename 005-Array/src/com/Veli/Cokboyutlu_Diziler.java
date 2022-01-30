package com.Veli;

public class Cokboyutlu_Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] Siniflistesi = new String[5][4];
		//BÝrinci Öðrenci Bilgileri
		Siniflistesi[0][0]= "OKL001";
		Siniflistesi[0][1]= "Ahmet BAÞ";
		Siniflistesi[0][2]= "46";
		Siniflistesi[0][3]= "63";
		//Ýkinci Öðrenci
		Siniflistesi[1][0]= "OKL002";
		Siniflistesi[1][1]= "Bahar GÝDER";
		Siniflistesi[1][2]= "25";
		Siniflistesi[1][3]= "19";
		//Ekrana Yazdýrmak
		System.out.println(Siniflistesi[1][1]);
		//sýnýftaki öðrencilerin tüm bilgilerini sýrayla yazdýrmak
		for (int i=0;i<5;i++) {
			System.out.println("Öðrencinin Okul Numarasý..:"+Siniflistesi[i][0]);
			System.out.println("Öðrencinin Adý Soyadý.....:"+Siniflistesi[i][1]);
			System.out.println("Öðrencinin Vize Notu......:"+Siniflistesi[i][2]);
			System.out.println("Öðrencinin Final Notu.....:"+Siniflistesi[i][3]);
			System.out.println("------------------------------------");
		}
	}//Main Sonu

}//Class Sonu
