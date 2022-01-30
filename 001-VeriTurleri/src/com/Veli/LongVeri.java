package com.Veli;

public class LongVeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// deðerinin sonuma l yada L konularak kullanýlýr  ama L tercih eddilmeli l ile karýþmamasý için 
				// L konulmazsa, deðer integer olarak algýlanýr java tarafýndan.
				long longVeri= 12343454233L;
				
				
				long myMinimumValue = -9223372036854775808L ;
				long myMaxmumValue = 9223372036854775807L ;
				
				
				//long ->Wrapper class: tüm primitive türler var.
						//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
						
				long MinimumValue = Long.MIN_VALUE ;
				long MaxmumValue = Long.MAX_VALUE ;
				
				
				System.out.println("minimum long deðeri" + myMinimumValue);
				System.out.println("maximum long deðeri" + myMaxmumValue);
				// yazýlýmcý olarak kullandýðýnýz veri tüpi sizin sorumlulugunuzda
				
	}

}
