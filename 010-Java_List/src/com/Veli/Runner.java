package com.Veli;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dizi = new String[5];
		//bir koleksiyon tanýmlama islemidir.
		List<String> ogrenciler;
		//koleksiyonu initialize(baþlatma)
		ogrenciler = new ArrayList<String>();
		//ArrayList in belli bir geniþliði yoktur.
		//ekleme yaptýkça hacmi geniþler.
		//ekleme
		ogrenciler.add("Öðrenci-1");
		ogrenciler.add("Öðrenci-2");
		ogrenciler.add("Öðrenci-3");
		ogrenciler.add("Öðrenci-4");
		//Silme -1
		ogrenciler.remove("Öðrenci-1");
		//Silme -2
		ogrenciler.remove(0);
		//bir kaydý almak
		System.out.println(ogrenciler.get(0));
		
	}

}
