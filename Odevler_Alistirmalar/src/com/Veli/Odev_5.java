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
		 * Y�n Tu�lar�
		 *      8
		 *  4       6
		 *      2
		 *      y�ld�z her tu�a bas�ld���nda hareket edecek �ekilde asla durmayacak, s�n�r sonuna geldi ise
		 *      ba�a d�necek. 
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
		//Dizinin Ekrana Yazd�r�lmas�
		for (i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				System.out.print(nesne[i][j]);
			}
			System.out.println();
		}
		
		
		while (true) {
			System.out.println();
			System.out.println("Yukar� gitmek i�in 2'ye...");
			System.out.println("A�a�� gitmek i�in 8'e...");
			System.out.println("Sa�a gitmek i�in 6'ya...");
			System.out.println("Sola gitmek i�in 4'e... bas�n�z.");
			
			Scanner sc = new Scanner(System.in);
			int secim = sc.nextInt();
			
			switch (secim) {
			case 2:
				nesne[x][y]=". ";
				x+=1;
				
				if (x>4) {x=0;}
				//d�ng� start
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
				//d�ng� end
				break;
			case 4:
				nesne[x][y]=". ";
				y-=1;
				
				if (y<0) {y=4;}
				//d�ng� start
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
				//d�ng� end
				break;
			case 6:
				nesne[x][y]=". ";
				y+=1;
				
				if (y>4) {y=0;}
				//d�ng� start
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
				//d�ng� end
				break;
			case 8:
				nesne[x][y]=". ";
				x-=1;
				
				if (x<0) {x=4;}
				//d�ng� start
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
				//d�ng� end
				break;
			}
		}
		
		
	}//main

}//class
