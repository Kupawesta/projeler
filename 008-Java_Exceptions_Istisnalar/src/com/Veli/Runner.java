package com.Veli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean error=false;
		do {
			try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Sayýyý giriniz...: ");
			int s1 = sc.nextInt();
			System.out.println("2. Sayýyý giriniz...: ");
			int s2 = sc.nextInt();
			int bolme = s1/s2;
			System.out.println("toplam...: "+bolme);
			error=false;
		}catch (InputMismatchException exception) {
			System.err.println("Tip Uyuþmazlýðý lütfen sayýsal bir deðer girerek tekrar deneyin..: ");
			//System.out.println(exception.toString());
			error=true;
		}catch (ArithmeticException exception) {
			System.err.println("Beklenmeyen iþlem hatasý lütfen sayýsal bir deðer girerek tekrar deneyin..: ");
			//System.out.println(exception.toString());
			error=true;
		}catch (Exception exception) {
			System.err.println("Beklenmeyen bir hata oluþtu. Lütfen iletiþime geçin. Tel:0507 264 33 78");
			error=true;
		}finally {
			//Sistem hata verdiðinde çalýþmasý 
			System.out.println("Her zaman çalýþýr.");
		}
		
		}while(error);
	}//main sonu
// finally bloðu hata olsa da olmasa da çalýþmasý istenilen blok
}//class sonu
