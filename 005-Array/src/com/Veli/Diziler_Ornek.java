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
			System.out.println("****��renci Takip S�stemi******");
			System.out.println("*******************************");
			System.out.println();
			System.out.println("1. S�n�f Olu�tur");
			System.out.println("2- S�n�f Listesi");
			System.out.println("3- Not Gir");
			System.out.println("4- S�n�f Not Ortalamalar�");
			System.out.println("0- ��k��");
			System.out.println();
			do {
				System.out.println("Se�iniz....: ");
				secim =sc.nextInt();
				}while (secim<0 || secim>4);
				
					switch (secim) {
					case 1: 
						boolean state =false;
						
						if (ogrenci_sayisi==0) {
							state=true;
							
						}else {
							System.out.println("D�KKAT!! Daha �nce s�n�f ulu�turukmu�tur.");
							System.out.println("Tekrar olu�turmak istiyor musunuz...: [E/H]");
							sc = new Scanner(System.in);
							String devam = sc.nextLine();
							if(devam.equals("E"))
								state = true;							
						}
						if (state) {
							System.out.print("S�n�ftaki ��renci say�s�n� giriniz...: ");
							ogrenci_sayisi = sc.nextInt();
							siniflistesi = new String[ogrenci_sayisi][3];
							for (int i=0;i<ogrenci_sayisi;i++) {
								System.out.print((i+1)+". ��rencinin Ad� ve Soyad�n� Giriniz...: ");
								sc = new Scanner(System.in);
								siniflistesi[i][0] = sc.nextLine();
								siniflistesi[i][1] = "0";
								siniflistesi[i][2] = "0";							
							}
							System.out.println("��renci Giri�leri Tamamland�...");
						}
							
					
						break;
					case 2:
						System.out.println("********************");
						System.out.println("***S�n�f Listesi****");
						System.out.println("********************");
						System.out.println();
						System.out.println("S.No.  |  ��rencinin Ad� Soyad�");
						for (int i=0;i<ogrenci_sayisi;i++) {
							System.out.print("   "+(i+1)+"          ");
							System.out.println(siniflistesi[i][0]);
							System.out.println();
						}
						break;
					case 3:
						System.out.println("***Not Giri�i****");
						System.out.println();
						for (int i=0;i<ogrenci_sayisi;i++) {
							sc = new Scanner(System.in);
							System.out.println((i+1)+". ��renci "+siniflistesi[i][0]);
							System.out.println("Vize Notu..: ");
							siniflistesi[i][1] = sc.nextLine();
							System.out.println("Fianl Notu..: ");
							siniflistesi[i][2] = sc.nextLine();
						}
						
						break;
					case 4: 
						System.out.println("******��renci Not Ortalamas�******");
						System.out.println();
						for(int i=0;i<ogrenci_sayisi;i++) {
							System.out.println("Ad Soyad...: "+siniflistesi[i][0]);
							System.out.println("Vize Notu..: "+siniflistesi[i][1]);
							System.out.println("Final Notu.: "+siniflistesi[i][2]);
							/*
							 * D�KKAT!!
							 * birbirine benzeyen t�rlerin de�i�imine t�r d�n���m� denir.
							 * (parse) terimsel ifadesi kullan�l�r.
							 */
							double vizenotu = Double.parseDouble(siniflistesi[i][1]);
							double finalnotu = Double.parseDouble(siniflistesi[i][2]);
							double ortalama = vizenotu*0.35+finalnotu*0.65;
							System.out.println("Ortalama Not...: "+ortalama);
							System.out.println("*****************************");
							
						}
						break;
					default: System.out.println("�IKI� YAPILDI");break;
			}
		}while (secim!=0);
		
		
	}//Main Sonu

}//Class Sonu
