package com.Veli;

import java.util.Scanner;

public class if_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vize_notu,final_notu,ortalama;
		String ortalama_notu,aciklama;
		aciklama="Not Ortalamasý...: ";
		ortalama_notu="FF";
		Scanner sc = new Scanner(System.in);
		System.out.println("Vize notu...:");
		vize_notu= sc.nextDouble();
		System.out.println("Fianl Notu....:");
		final_notu= sc.nextDouble();
		ortalama = vize_notu*0.35 +final_notu*0.65;
		// 0-10 FF , 11-20 FD , 21-30 DD , 31-40 DC , 41-50 CC ,.....90-100 AA
		System.out.println("Ortalama...:" + ortalama);
		if(ortalama>=0 && ortalama<=20) {
			ortalama_notu="FF";
		}else if (ortalama>=21 && ortalama<=30){
			ortalama_notu="FD";
		}else if (ortalama>=31 && ortalama<=40){
			ortalama_notu="DD";
		}else if (ortalama>=41 && ortalama<=50){
			ortalama_notu="DC";
		}else if (ortalama>=51 && ortalama<=60){
			ortalama_notu="CC";
		}else if (ortalama>=61 && ortalama<=70){
			ortalama_notu="CB";
		}else if (ortalama>=71 && ortalama<=80){
			ortalama_notu="BB";
		}else if (ortalama>=81 && ortalama<=90){
			ortalama_notu="BA";
		}else if (ortalama>=91 && ortalama<=100){
			ortalama_notu="AA";
		}
		System.out.println(aciklama + ortalama_notu);
		//NOT: Koþul için gövde yazýlmaz ise yani {} ler kullanýlmaz ise ; e kadar olan kýsým çalýþýr.
		if (ortalama<=20) ortalama_notu="FF";
		else if (ortalama<=30) ortalama_notu="FD";
		else if (ortalama<=40) ortalama_notu="DD";
		else if (ortalama<=50) ortalama_notu="DC";
		else if (ortalama<=60) ortalama_notu="CC";
		else if (ortalama<=70) ortalama_notu="CB";
		else if (ortalama<=80) ortalama_notu="BB";
		else if (ortalama<=90) ortalama_notu="BA";
		else if (ortalama<=100) ortalama_notu="AA";
		System.out.println(aciklama + ortalama_notu);
	}

}
