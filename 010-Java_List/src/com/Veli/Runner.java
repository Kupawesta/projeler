package com.Veli;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dizi = new String[5];
		//bir koleksiyon tan�mlama islemidir.
		List<String> ogrenciler;
		//koleksiyonu initialize(ba�latma)
		ogrenciler = new ArrayList<String>();
		//ArrayList in belli bir geni�li�i yoktur.
		//ekleme yapt�k�a hacmi geni�ler.
		//ekleme
		ogrenciler.add("��renci-1");
		ogrenciler.add("��renci-2");
		ogrenciler.add("��renci-3");
		ogrenciler.add("��renci-4");
		//Silme -1
		ogrenciler.remove("��renci-1");
		//Silme -2
		ogrenciler.remove(0);
		//bir kayd� almak
		System.out.println(ogrenciler.get(0));
		
	}

}
