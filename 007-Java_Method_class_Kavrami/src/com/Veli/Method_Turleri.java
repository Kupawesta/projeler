package com.Veli;

public class Method_Turleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t =toplam(36,99);
		System.out.println("Toplam..:"+t);
		kaydet("Veli", "CANLI", "0507 264 33 78", 1989, true);
	}// main sonu
	
	//  Method T�rleri
	// 1- Void Methodu
	void method_1() {
		
	}
	//2- De�er d�nd�ren method
	int method_2() {
		int sayi=5;
		return sayi;
	}
	//3- Bu method, d��ardan de�er alabilen bir method t�r�d�r.
	//ald��� de�erleri g�vdesi i�inde kullanabilir.
	static int toplam(int sayi1,int sayi2) {
		int t =sayi1+sayi2;
		return t;
	}
	static boolean kaydet (String ad,String soyad,String telefon,int dogumyili,boolean aktif) {
		System.out.println(ad+" isimli ki�i kay�t edildi.");
		return true;
	}
	
}//class sonu
