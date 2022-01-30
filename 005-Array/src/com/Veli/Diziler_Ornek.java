package com.Veli;

import java.util.Scanner;

public class Diziler_Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ogrenci_sayisi = 0;
		String [] siniflistesi=null;
		
		int secim=0;
		do {
			System.out.println("*******************************");
			System.out.println("****Öðrenci Takip SÝstemi******");
			System.out.println("*******************************");
			System.out.println();
			System.out.println("1. Sýnýf Oluþtur");
			System.out.println("2- Sýnýf Listesi");
			System.out.println("3- Not Gir");
			System.out.println("4- Sýnýf Not Ortalamalarý");
			System.out.println("0- Çýkýþ");
			System.out.println();
			do {
				System.out.println("Seçiniz....: ");
				secim =sc.nextInt();
				}while (secim<0 || secim>4);
				
					switch (secim) {
					case 1: 
						boolean state =false;
						
						if (ogrenci_sayisi==0) {
							state=true;
							
						}else {
							System.out.println("DÝKKAT!! Daha önce sýnýf uluþturukmuþtur.");
							System.out.println("Tekrar oluþturmak istiyor musunuz...: [E/H]");
							sc = new Scanner(System.in);
							String devam = sc.nextLine();
							if(devam.equals("E"))
								state = true;							
						}
						if (state) {
							System.out.print("Sýnýftaki öðrenci sayýsýný giriniz...: ");
							ogrenci_sayisi = sc.nextInt();
							siniflistesi = new String[ogrenci_sayisi][3];
							for (int i=0;i<ogrenci_sayisi;i++) {
								System.out.print((i+1)+". Öðrencinin Adý ve Soyadýný Giriniz...: ");
								sc = new Scanner(System.in);
								siniflistesi[i][0] = sc.nextLine();
								siniflistesi[i][1] = "0";
								siniflistesi[i][2] = "0";							
							}
							System.out.println("Öðrenci Giriþleri Tamamlandý...");
						}
							
					
						break;
					case 2:
						System.out.println("********************");
						System.out.println("***Sýnýf Listesi****");
						System.out.println("********************");
						System.out.println();
						System.out.println("S.No.  |  Öðrencinin Adý Soyadý");
						for (int i=0;i<ogrenci_sayisi;i++) {
							System.out.print("   "+(i+1)+"          ");
							System.out.println(siniflistesi[i][0]);
							System.out.println();
						}
						break;
					case 3:
						System.out.println("***Not Giriþi****");
						System.out.println();
						for (int i=0;i<ogrenci_sayisi;i++) {
							sc = new Scanner(System.in);
							System.out.println((i+1)+". Öðrenci "+siniflistesi[i][0]);
							System.out.println("Vize Notu..: ");
							siniflistesi[i][1] = sc.nextLine();
							System.out.println("Fianl Notu..: ");
							siniflistesi[i][2] = sc.nextLine();
						}
						
						break;
					case 4: 
						System.out.println("******Öðrenci Not Ortalamasý******");
						System.out.println();
						for(int i=0;i<ogrenci_sayisi;i++) {
							System.out.println("Ad Soyad...: "+siniflistesi[i][0]);
							System.out.println("Vize Notu..: "+siniflistesi[i][1]);
							System.out.println("Final Notu.: "+siniflistesi[i][2]);
							/*
							 * DÝKKAT!!
							 * birbirine benzeyen türlerin deðiþimine tür dönüþümü denir.
							 * (parse) terimsel ifadesi kullanýlýr.
							 */
							double vizenotu = Double.parseDouble(siniflistesi[i][1]);
							double finalnotu = Double.parseDouble(siniflistesi[i][2]);
							double ortalama = vizenotu*0.35+finalnotu*0.65;
							System.out.println("Ortalama Not...: "+ortalama);
							System.out.println("*****************************");
							
						}
						break;
					default: System.out.println("ÇIKIÞ YAPILDI");break;
			}
		}while (secim!=0);
		
		
	}//Main Sonu

}//Class Sonu
