package omerExample;

import java.util.Scanner;

public class palindromikSayilar {

	public static void main(String[] args) {
		
		int sayi,sayi2,temp,temp1=0,result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Say� giriniz:");
		sayi=input.nextInt();
		temp=sayi;
		sayi2=String.valueOf(sayi).length();
		
		for(int i=0;i<sayi2;i++) {
			temp1=temp%10;
			temp=temp/10;
			result=(int) Math.pow(10, sayi2-(i+1))*temp1+result;
		}
		if(result==sayi)
			System.out.println(sayi+" palindromik bir say�d�r.");
		else
			System.out.println(sayi+" palindromik bir say� de�ildir.");

	}

}
