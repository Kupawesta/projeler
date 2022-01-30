package com.Veli;

public class Alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytedeger= Byte.MAX_VALUE - 20;
		System.out.println(bytedeger);
		
		long longdeger = Long.MAX_VALUE - 20000;
		System.out.println(longdeger);
		
		int intdeger = Integer.MAX_VALUE - 10000;
		System.out.println(intdeger);
		
		long toplamdeger = (long) bytedeger + (long) longdeger + (long)intdeger;
		System.out.println("Toplam deger : " + toplamdeger);
		
	}

}
