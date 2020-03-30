package com.qa.main;

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
	
	// initially i tried creating a list of type integer and used a value of 50 as my limit in the loop however for large numbers
	//i was getting negatives as the int reached its limit 
	 
	 
	 
	 
	
		
	
	
	
	public static void main(String[] args) {
		
		Fib test = new Fib();
		test.Fib1(50);
		
	}
	

}
