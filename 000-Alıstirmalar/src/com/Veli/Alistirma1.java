package com.Veli;

public class Alistirma1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double telefonithalfiyat� = 10000;
		double telefonfiyat� = 0;
		
		double gumrukvergisi = telefonithalfiyat� * 0.05;
		System.out.println("G�mr�k Vergisi : " +gumrukvergisi);
		
		telefonfiyat� = telefonithalfiyat� + gumrukvergisi;
		System.out.println("Telefon Fiyat� : " +telefonfiyat�);
		
		double kdvmiktari = telefonfiyat� * 0.1;
		System.out.println("Kdv Miktar� : " +kdvmiktari);
		
		telefonfiyat� = telefonfiyat� + kdvmiktari;
		System.out.println("Telefon Fiyat� : " +telefonfiyat�);
		
		double karpayi = telefonfiyat� * 0.2;
		System.out.println("Kar pay�  : " +karpayi);
	
		telefonfiyat� = telefonfiyat� + karpayi;
		System.out.println("Telefon Fiyat� : " +telefonfiyat�);
	
		double indirimtutari = telefonfiyat� *0.15;
		System.out.println("�ndirim Tutar� : " +indirimtutari);
	
		telefonfiyat� = telefonfiyat� - indirimtutari;
		System.out.println("Telefon Fiyat� : " +telefonfiyat�);
		
	}

}
