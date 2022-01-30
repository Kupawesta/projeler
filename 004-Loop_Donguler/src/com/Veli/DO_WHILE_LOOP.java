package com.Veli;

public class DO_WHILE_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Do...While () Döngüsü While döngüsü ile ayný çalýþýr.
		 * tek bir fark vardýr.
		 * do while döngüsü koþula bakmaksýzýn 1 kere mutlaka çalýþýr.
		 */
		boolean secim =false;
		while (secim) {
			System.out.println("While Çalýþtý");
		}
		do {
			System.out.println("Do...While Çalýþtý");
			
		}while (secim);
		
	}

}
