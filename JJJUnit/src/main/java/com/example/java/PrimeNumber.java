package com.example.java;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);*/
 	int n=3;
	int c=0;
	for(int i=1;i<=n;i++) {
		
		
		if(n%i==0) {
			if(i==7 && i==n)
			c++;
			System.out.println(c);
		}
		
		}
	if(c==2) {
		System.out.println("entered number is prime"+c);
	}
	else {
		System.out.println("entered number is not prime"+c);
	}
	}
}

