package com.Veli;

public class Odev_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = {1,2,5,5,6,6,7,2,1,3};
		int rakam_sayisi = dizi.length;
		for (int i=0;i<rakam_sayisi;i++) {
			int sayac=1;
			for (int j=1;j<rakam_sayisi;j++) {
				
				if (i<j &&(dizi[i]==dizi[j])) {
					sayac++;			
				}
			}
			if (sayac>1) {
				System.out.println(dizi[i]+" sayýsý dizide "+ sayac+" kere tekrar ediyor.");
			}
		}
		
	
	}//main sonu

}//class sonu
