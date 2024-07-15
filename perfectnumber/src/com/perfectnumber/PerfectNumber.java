package com.perfectnumber;

public class PerfectNumber {

	public static void main(String[] args) {
		
		
		
		int i=1,sum=0;
		
		int no=6;
		while (i<no) {
			if (no%i==0) {
				sum +=i;
				//System.out.println(sum);
				
			}
			i++;
			
			
			
		}
		if (sum==no) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}
}
