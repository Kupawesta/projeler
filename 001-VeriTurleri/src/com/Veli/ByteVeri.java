package com.Veli;
/*
 * 1 Byte 8 bit i�erir.
 * alabilece�i say� aral��� +127/-128
 */
public class ByteVeri{

	public static void main(String[] args) {
		
		byte bytesayi = 3;
		System.out.println(bytesayi);
		
		byte maximumByteDegeri = Byte.MAX_VALUE;
		System.out.println(maximumByteDegeri);
		
		byte minimumByteDegeri = Byte.MIN_VALUE;
		System.out.println(minimumByteDegeri);

		//overflow e�er tan�mlama do�ru olursa overflow olur tan�mlama do�ru olmazsa hata verir.
				
		byte maximumdegerdenfazlaolurmu = (byte)(maximumByteDegeri + 1);
		//��kacak de�eri byte dan b�y�k olsa bile byte a d�n��t�rmeye yarar.
		System.out.println(maximumdegerdenfazlaolurmu);
		
	}

}
