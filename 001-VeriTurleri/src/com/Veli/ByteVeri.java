package com.Veli;
/*
 * 1 Byte 8 bit içerir.
 * alabileceði sayý aralýðý +127/-128
 */
public class ByteVeri{

	public static void main(String[] args) {
		
		byte bytesayi = 3;
		System.out.println(bytesayi);
		
		byte maximumByteDegeri = Byte.MAX_VALUE;
		System.out.println(maximumByteDegeri);
		
		byte minimumByteDegeri = Byte.MIN_VALUE;
		System.out.println(minimumByteDegeri);

		//overflow eðer tanýmlama doðru olursa overflow olur tanýmlama doðru olmazsa hata verir.
				
		byte maximumdegerdenfazlaolurmu = (byte)(maximumByteDegeri + 1);
		//çýkacak deðeri byte dan büyük olsa bile byte a dönüþtürmeye yarar.
		System.out.println(maximumdegerdenfazlaolurmu);
		
	}

}
