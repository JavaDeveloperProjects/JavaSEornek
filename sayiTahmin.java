package omerExample;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand=new Random();
		int tahmin;
		int sayi=rand.nextInt(10);
		System.out.println("Tahmininizi giriniz:(0-10 arası bir rakam)");
		tahmin=input.nextInt();
		if(sayi==tahmin) {
			System.out.println("Tahmininiz doğru sayı:"+sayi);
		}
		else
			System.out.println("Yanlış tahmin ettiniz sayi:"+sayi);
		
		

	}

}
