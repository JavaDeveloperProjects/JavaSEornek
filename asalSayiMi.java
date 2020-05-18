package omerExample;

import java.util.Scanner;

public class asalSayiMi {

	public static void main(String[] args) {
		
		int sayi;
		Scanner input=new Scanner(System.in);
		System.out.println("Sayiyi gir:");
		sayi=input.nextInt();
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(sayi);i++) {
			if(sayi%i==0) {
				flag=false;
			}
		}
		
		if(flag==false || sayi==1)
			System.out.println("Girilen sayi asal deðildir.");
		else
			System.out.println("Girilen sayi asal sayidýr");

	}

}
