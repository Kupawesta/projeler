package com.Veli;

public class DoubleVeri {
/*
 * ondalýklý sayýlarda varsayýlan deðer double dýr.
 * precision (doðru sonuca yakýnlýk)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doublesayi1 = 1;
		double doublesayi2 = 1.0;
		double doublesayi3 = 1.0D;
		double doublesayi4 = 1.0d;
		
		System.out.println(doublesayi1 +" " + doublesayi2 +" "  + doublesayi3 + " " +doublesayi4);
		
		double maximumdoubledeger = Double.MAX_VALUE;
		double minimumdoubledeger = Double.MIN_VALUE;
		
		System.out.println("Maksimum double degeri " + maximumdoubledeger);
		System.out.println("Minimum double degeri " + minimumdoubledeger);
	}

}
