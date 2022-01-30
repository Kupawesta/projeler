package com.Veli;

public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Arrays -> Diziler
 * Çoklu Deðer yakalamak ve saklamak için kullanýlýr.
 * {3,6,8,5,4,7,1,2,3,2326,45564,65489} dizinin tutulma mantýðý
 * 
 */
		int sayi = 45;
		int[] sayi_dizisi={0,50,30,1564,20};//aralýk verilmeyen dizi null deðeri alýr ama iþlem görmez.
		//sayý dizisinin boyutlarýný belirleyerek default deðer atýyoruz.
		int[] sayi_dizisi2 = new int[5];//{0,0,0,0,0} default deðerleri.
		//String in default deðeri null dýr.
		
		
		//Dizinin içinden deðer okumak
		// Çok Önemli!!!
		//Diziler baþlangýç olarak 0 indis deðeri ile baþlar.
		//Diziye deðer Atamak
		sayi_dizisi[3]= 45;
		System.out.println("3. Ýndex deðeri için...: "+ sayi_dizisi[3]);
		
		//Dizilerin Çeþitleri
		String[] ifadedizisi;
		Double[] ondalikdizisi;
		boolean[] secimdizisi;
		Diziler[] class_dizisi;//clasýn adý diziler olduðu için diziler diye bir deðiþken türü var.
		
		
		
	}//Main sonu

}//Class Sonu
