package com.Veli;

public class Alistirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double telefonithalfiyatı = 10000;
		double telefonfiyatı = 0;
		
		double gumrukvergisi = telefonithalfiyatı * 0.05;
		System.out.println("Gümrük Vergisi : " +gumrukvergisi);
		
		telefonfiyatı = telefonithalfiyatı + gumrukvergisi;
		System.out.println("Telefon Fiyatı : " +telefonfiyatı);
		
		double kdvmiktari = telefonfiyatı * 0.1;
		System.out.println("Kdv Miktarı : " +kdvmiktari);
		
		telefonfiyatı = telefonfiyatı + kdvmiktari;
		System.out.println("Telefon Fiyatı : " +telefonfiyatı);
		
		double karpayi = telefonfiyatı * 0.2;
		System.out.println("Kar payı  : " +karpayi);
	
		telefonfiyatı = telefonfiyatı + karpayi;
		System.out.println("Telefon Fiyatı : " +telefonfiyatı);
	
		double indirimtutari = telefonfiyatı *0.15;
		System.out.println("İndirim Tutarı : " +indirimtutari);
	
		telefonfiyatı = telefonfiyatı - indirimtutari;
		System.out.println("Telefon Fiyatı : " +telefonfiyatı);
		
	}

}
