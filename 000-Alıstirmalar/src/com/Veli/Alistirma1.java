package com.Veli;

public class Alistirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double telefonithalfiyatý = 10000;
		double telefonfiyatý = 0;
		
		double gumrukvergisi = telefonithalfiyatý * 0.05;
		System.out.println("Gümrük Vergisi : " +gumrukvergisi);
		
		telefonfiyatý = telefonithalfiyatý + gumrukvergisi;
		System.out.println("Telefon Fiyatý : " +telefonfiyatý);
		
		double kdvmiktari = telefonfiyatý * 0.1;
		System.out.println("Kdv Miktarý : " +kdvmiktari);
		
		telefonfiyatý = telefonfiyatý + kdvmiktari;
		System.out.println("Telefon Fiyatý : " +telefonfiyatý);
		
		double karpayi = telefonfiyatý * 0.2;
		System.out.println("Kar payý  : " +karpayi);
	
		telefonfiyatý = telefonfiyatý + karpayi;
		System.out.println("Telefon Fiyatý : " +telefonfiyatý);
	
		double indirimtutari = telefonfiyatý *0.15;
		System.out.println("Ýndirim Tutarý : " +indirimtutari);
	
		telefonfiyatý = telefonfiyatý - indirimtutari;
		System.out.println("Telefon Fiyatý : " +telefonfiyatý);
		
	}

}
