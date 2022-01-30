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
		
		System.out.println("int minimum deðer: " + minimumIntDegeri);
		System.out.println("int maximum deðer " + maximumIntDegeri);
		
		//overflow
		int maximumdegerdenfazlaolurmu = maximumIntDegeri + 1;
		System.out.println(maximumdegerdenfazlaolurmu);
		/*bunun sonucunda iþlem hata vermez loop a döner ve maximum deðerden 
		 * minimum deðere gider =   -  2_147_483_648 
		 * Bunun anlamý kullanacaðýn veri türü ve atayacaðýn deðer senin sorumluluðunda
		 */
	}

}
