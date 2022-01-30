package com.Veli;
// int 32 bit yer kaplar = +-2*32

public class IntVeri {

	public static void main(String[] args) {
		
		int intsayi = 5;
		System.out.println(intsayi);
		
		//Wrapper class
		
		int minimumIntDegeri = Integer.MIN_VALUE; 
		// -2_147_483_648
		int maximumIntDegeri = Integer.MAX_VALUE;
		// 2_147_483_648
		
		System.out.println("int minimum de�er: " + minimumIntDegeri);
		System.out.println("int maximum de�er " + maximumIntDegeri);
		
		//overflow
		int maximumdegerdenfazlaolurmu = maximumIntDegeri + 1;
		System.out.println(maximumdegerdenfazlaolurmu);
		/*bunun sonucunda i�lem hata vermez loop a d�ner ve maximum de�erden 
		 * minimum de�ere gider =   -  2_147_483_648 
		 * Bunun anlam� kullanaca��n veri t�r� ve atayaca��n de�er senin sorumlulu�unda
		 */
	}

}
