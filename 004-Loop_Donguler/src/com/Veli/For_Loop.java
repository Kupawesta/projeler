package com.Veli;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * For döngüsüne sokulmak istenilen kodlar "{ }" içinde yazýlýr. süslü parantez önünde ; kullanýlmaz ...
		 * For döngüsünün yapýsý/grameri/Syntax ý (sayaç;koþul;iþlem)dir.
		 */
		for(int i=0;i<10;i++) {
		System.out.println("Veli CANLI");
		System.out.println("bunu da yazdýracak");
		}
		System.out.println("Program Sonlandý");
		/*
		 * Döngüde süslü parantez olmazsa döngü ilk noktalý virgüle kadar olan kýsmý döndürür. gerisini döndürmez
		 */
		for (int i =0;i<3;i++)
			System.out.println("2.loop gövdesi");
			System.out.println("bunu da yazdýracak");
		System.out.println("program sonlandý");
	}

}
