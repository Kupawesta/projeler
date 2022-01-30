package com.Veli;

import java.util.Scanner;

public class Odev_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ýþlemi giriniz..:");
		Scanner sc = new Scanner(System.in);
		String soru = sc.nextLine();
		String[] soru_parcalari = soru.split(" ");
		int secim_konumu =0;
		String islem =" ";
		int dizi_araligi = soru_parcalari.length;
		//islemi bulduðumuz bölüm
		for (int i=0;i<dizi_araligi;i++) {
			if (soru_parcalari[i].contains("çarp") || soru_parcalari[i].contains("böl") || soru_parcalari[i].contains("topla") ||soru_parcalari[i].contains("çýkar")) {
				secim_konumu=i;
				islem = soru_parcalari[i];
			}
		
		}
		//sayýlarý bulduðumuz bölüm
		int [] sayi = {0,0};
		int kacinci_sayi=0;
		/*
		for (int i=0;i<soru_parcalari.length;i++) {
			if (Integer.valueOf(soru_parcalari[i])>=0 || Integer.valueOf(soru_parcalari[i])<0) {
				sayi[kacinci_sayi]=Integer.parseInt(soru_parcalari[i]);
				kacinci_sayi++;
			}
		}
		*/	
		for (int i=0;i<soru_parcalari.length;i++) {
			if(soru_parcalari[i].matches("\\d+")) {
				sayi[kacinci_sayi]=Integer.parseInt(soru_parcalari[i]);
				kacinci_sayi++;
			}
		}
		System.out.println(kacinci_sayi);
		int sonuc=0;
		switch (islem) {
		case "topla":
			sonuc = sayi[0]+sayi[1];
			break;
		case "çikar":
			sonuc = sayi[0]-sayi[1];
			break;
		case "çarp":
			sonuc = sayi[0]*sayi[1];
			break;
		case "böl":
			sonuc = sayi[0]/sayi[1];
			break;
		default: break;
		}
		System.out.println("Sonuç ....: "+sonuc);
		
		//içinde gecen topla vs. gibi kelimeleri bularak iþlem deðiþkenine ata.
		//ilsem deðiþkenin de switch case kullan
		//rakamlarý nasýl çekeceðini bul.
	}

}
