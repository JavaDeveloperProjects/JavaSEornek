package omerExample;

import java.util.Scanner;

public class fibonacciSerisi {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Kaçýncý fibonacci sayýsýný görmek istersiniz:");
		int sayi=input.nextInt();
		int f1=1,f2=1;
		int fib=0;
		if(sayi==1 || sayi==2) {
			System.out.println(sayi+".fibonacci sayýsý:"+f1);
		}
		int temp=2;
		while(temp!=sayi) {
			fib=f1+f2;
			f1=f2;f2=fib;
			temp++;
		}
		System.out.println(sayi+".fibonacci sayýsý:"+fib);

	}

}
