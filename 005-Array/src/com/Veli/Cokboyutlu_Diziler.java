package com.Veli;

public class Cokboyutlu_Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] Siniflistesi = new String[5][4];
		//B�rinci ��renci Bilgileri
		Siniflistesi[0][0]= "OKL001";
		Siniflistesi[0][1]= "Ahmet BA�";
		Siniflistesi[0][2]= "46";
		Siniflistesi[0][3]= "63";
		//�kinci ��renci
		Siniflistesi[1][0]= "OKL002";
		Siniflistesi[1][1]= "Bahar G�DER";
		Siniflistesi[1][2]= "25";
		Siniflistesi[1][3]= "19";
		//Ekrana Yazd�rmak
		System.out.println(Siniflistesi[1][1]);
		//s�n�ftaki ��rencilerin t�m bilgilerini s�rayla yazd�rmak
		for (int i=0;i<5;i++) {
			System.out.println("��rencinin Okul Numaras�..:"+Siniflistesi[i][0]);
			System.out.println("��rencinin Ad� Soyad�.....:"+Siniflistesi[i][1]);
			System.out.println("��rencinin Vize Notu......:"+Siniflistesi[i][2]);
			System.out.println("��rencinin Final Notu.....:"+Siniflistesi[i][3]);
			System.out.println("------------------------------------");
		}
	}//Main Sonu

}//Class Sonu
