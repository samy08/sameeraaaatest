package com.example.java;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);*/
	
	for(int i=1;i<=100;i++) {
		int c=0;
		for(int j=i;i>=1;j--) {
			if(i%j==0)
			c++;
		}
		if(c==2)
			System.out.println("hellooooo is prime number "+" "+i);
	}
}
}

