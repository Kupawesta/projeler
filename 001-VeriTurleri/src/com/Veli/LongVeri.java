package com.Veli;

public class LongVeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// de�erinin sonuma l yada L konularak kullan�l�r  ama L tercih eddilmeli l ile kar��mamas� i�in 
				// L konulmazsa, de�er integer olarak alg�lan�r java taraf�ndan.
				long longVeri= 12343454233L;
				
				
				long myMinimumValue = -9223372036854775808L ;
				long myMaxmumValue = 9223372036854775807L ;
				
				
				//long ->Wrapper class: t�m primitive t�rler var.
						//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
						
				long MinimumValue = Long.MIN_VALUE ;
				long MaxmumValue = Long.MAX_VALUE ;
				
				
				System.out.println("minimum long de�eri" + myMinimumValue);
				System.out.println("maximum long de�eri" + myMaxmumValue);
				// yaz�l�mc� olarak kulland���n�z veri t�pi sizin sorumlulugunuzda
				
	}

}
