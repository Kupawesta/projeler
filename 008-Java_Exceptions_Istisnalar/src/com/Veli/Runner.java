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
			System.out.println("1. Say�y� giriniz...: ");
			int s1 = sc.nextInt();
			System.out.println("2. Say�y� giriniz...: ");
			int s2 = sc.nextInt();
			int bolme = s1/s2;
			System.out.println("toplam...: "+bolme);
			error=false;
		}catch (InputMismatchException exception) {
			System.err.println("Tip Uyu�mazl��� l�tfen say�sal bir de�er girerek tekrar deneyin..: ");
			//System.out.println(exception.toString());
			error=true;
		}catch (ArithmeticException exception) {
			System.err.println("Beklenmeyen i�lem hatas� l�tfen say�sal bir de�er girerek tekrar deneyin..: ");
			//System.out.println(exception.toString());
			error=true;
		}catch (Exception exception) {
			System.err.println("Beklenmeyen bir hata olu�tu. L�tfen ileti�ime ge�in. Tel:0507 264 33 78");
			error=true;
		}finally {
			//Sistem hata verdi�inde �al��mas� 
			System.out.println("Her zaman �al���r.");
		}
		
		}while(error);
	}//main sonu
// finally blo�u hata olsa da olmasa da �al��mas� istenilen blok
}//class sonu
