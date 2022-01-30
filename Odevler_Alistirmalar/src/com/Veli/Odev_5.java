package com.Veli;

import java.util.Scanner;

public class Odev_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * . . . . .
		 * . . . . .
		 * . . * . . 
		 * . . . . .
		 * . . . . .
		 * Yön Tuþlarý
		 *      8
		 *  4       6
		 *      2
		 *      yýldýz her tuþa basýldýðýnda hareket edecek þekilde asla durmayacak, sýnýr sonuna geldi ise
		 *      baþa dönecek. 
		 */
		int x=2, y=2;
		int i,j;
		String[][] nesne= new String[5][5];
		for (i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				if ((i==x)&&(j==y)) {
					nesne[i][y] = "* ";
				}else {
				nesne[i][j]=". ";
				}
			}
		}
		//Dizinin Ekrana Yazdýrýlmasý
		for (i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				System.out.print(nesne[i][j]);
			}
			System.out.println();
		}
		
		
		while (true) {
			System.out.println();
			System.out.println("Yukarý gitmek için 2'ye...");
			System.out.println("Aþaðý gitmek için 8'e...");
			System.out.println("Saða gitmek için 6'ya...");
			System.out.println("Sola gitmek için 4'e... basýnýz.");
			
			Scanner sc = new Scanner(System.in);
			int secim = sc.nextInt();
			
			switch (secim) {
			case 2:
				nesne[x][y]=". ";
				x+=1;
				
				if (x>4) {x=0;}
				//döngü start
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						if ((i==x)&&(j==y)) {
							nesne[i][y] = "* ";
						}else {
						nesne[i][j]=". ";
						}
					}
				}
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						System.out.print(nesne[i][j]);
					}
					System.out.println();
				}
				//döngü end
				break;
			case 4:
				nesne[x][y]=". ";
				y-=1;
				
				if (y<0) {y=4;}
				//döngü start
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						if ((i==x)&&(j==y)) {
							nesne[i][y] = "* ";
						}else {
						nesne[i][j]=". ";
						}
					}
				}
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						System.out.print(nesne[i][j]);
					}
					System.out.println();
				}
				//döngü end
				break;
			case 6:
				nesne[x][y]=". ";
				y+=1;
				
				if (y>4) {y=0;}
				//döngü start
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						if ((i==x)&&(j==y)) {
							nesne[i][y] = "* ";
						}else {
						nesne[i][j]=". ";
						}
					}
				}
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						System.out.print(nesne[i][j]);
					}
					System.out.println();
				}
				//döngü end
				break;
			case 8:
				nesne[x][y]=". ";
				x-=1;
				
				if (x<0) {x=4;}
				//döngü start
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						if ((i==x)&&(j==y)) {
							nesne[i][y] = "* ";
						}else {
						nesne[i][j]=". ";
						}
					}
				}
				for (i=0;i<5;i++) {
					for (j=0;j<5;j++) {
						System.out.print(nesne[i][j]);
					}
					System.out.println();
				}
				//döngü end
				break;
			}
		}
		
		
	}//main

}//class
