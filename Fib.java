package com.qa.main;
import java.util.ArrayList;
import java.util.List;

public class Fib {
	
	public void Fib1(int n) {
	
	 long a=0;
	 long b=1;
	 long c;
	 
	for (int i=0;i<=n;i++) {
		if (i==0) {
			System.out.print(a+" ");
		} else if (i==1) {
			System.out.print(b+" ");
		}else {
			c=a+b;
			a=b;
			b=c;
			System.out.print(b+" ");
		}
	}
	}
	
	 
	 
	 
	 
	 
	
		
	
	
	
	public static void main(String[] args) {
		
		Fib test = new Fib();
		test.Fib1(50);
		
	}
	

}
