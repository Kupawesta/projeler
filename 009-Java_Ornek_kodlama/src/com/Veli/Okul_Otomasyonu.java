package com.Veli;

import java.util.Scanner;

public class Okul_Otomasyonu {
	String [] sinifListesi=null;
	int sinifsayisi=0;
 	public int Seciniz() {
		
		int secim=0;
		do {
		System.out.println("Se?iniz...: ");
		secim = tamsayiAl();
		}while (secim<0 || secim>8);
		return secim;
		
	}
 	public void Ekran() {
		System.out.println("************************");
		System.out.println("***OKUL OTOMASYONU******");
		System.out.println("************************");
		System.out.println();
		System.out.println("1- S?n?f Tan?mlama");
		System.out.println("2- ??renci Tan?mlama");
		System.out.println("3- ??renci Atama");
		System.out.println("4- S?n?f Listesi");
		System.out.println("5- Ders Tan?mlama");
		System.out.println("6- Not Ekleme");
		System.out.println("7- Not G?r?nt?leme");
		System.out.println("8- ??renci Arama");
		System.out.println("0- ? I K I ?");
		
	}
 	public int tamsayiAl() {
 		int sayi=0;
 		Scanner sc;
 		boolean error =false;
 		do {
 			try {
 				sc= new Scanner(System.in);
 				sayi=sc.nextInt();
 				error=false;
  			}catch (Exception e) {
			System.err.println("L?tfen Tamsay? Giriniz....");
			error=true;
			}
 		}while (error);
 		return sayi;
 	}
 	public void Run() {
 		
 		int secim;
 		do {
 			Ekran();
 			secim =Seciniz();
	 		switch (secim) {
			case 1:SinifTan?mlama();break;
			case 2:OgrenciTan?mlama();break;
			case 3:OgrenciAtama();break;
			case 4:SinifListesi();break;
			case 5:DersTanimlama();break;
			case 6:NotEkleme();break;
			case 7:NotGoruntuleme();break;
			case 8:OgrenciArama();break;
			default:System.err.println("Uygulama Kapat?ld?...");break;
			}
 		}while(secim!=0);
 	}
 	public void SinifTan?mlama() {
	 	System.out.println("S?n?f Ad?n? Giriniz...:");
	 	Scanner sc = new Scanner(System.in);
	 	String sinifadi= sc.nextLine();
	 	SinifEkle(sinifadi);	
	 	System.out.println("S?n?f Ba?ar? ile eklendi...");
 	}
 	public void OgrenciTan?mlama() {
 		
 	}
 	public void OgrenciAtama() {
 		
 	}
 	public void SinifListesi() {
		
	}
 	public void DersTanimlama() {
		
	}
 	public void NotEkleme() {
		
	}
 	public void NotGoruntuleme() {
		
	}
 	public void OgrenciArama() {
 		
 	}
 	public void SinifEkle(String sinifadi) {
 		if (sinifsayisi==0) {
 			sinifListesi = new String[1];
 			sinifsayisi++;
 			sinifListesi[0]=sinifadi;
 		}else {
 			String[] gecicidizi= new String[sinifsayisi];
 			gecicidizi=sinifListesi;
 			sinifsayisi++;
 			sinifListesi =new String [sinifsayisi];
 			for (int i=0;i<sinifsayisi;i++) {
 				if (i==sinifsayisi-1) {
 					sinifListesi[i]=sinifadi;
 				}else {
 					sinifListesi[i]=gecicidizi[i];
 				}
 			}
 		}
 	}
}//Class Sonu
