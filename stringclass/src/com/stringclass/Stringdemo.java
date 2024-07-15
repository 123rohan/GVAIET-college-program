package com.stringclass;



public class Stringdemo {
		
	public static void main(String[] args) {
		
		
		String name="Rohan";
		String name1="Rohan";
		
		String name2= new String("Rohan");
		
		if (name==name1) {
			System.out.println("name & name1 "+true);
		}
		
		
		if (name==name2) {
			System.out.println("name & name2 "+true);
		}
		else {
			System.out.println("name & name2 "+false);
		}
		
		
		
		StringBuffer stringBuffer=new StringBuffer("chakradhar");
		System.out.println(stringBuffer.capacity());
		
		
		StringBuilder stringBuilder=new StringBuilder("ramu");
		System.out.println("ramu "+stringBuilder.capacity());
		System.out.println("ramu "+stringBuilder.reverse());
		
		System.out.println("ramu "+stringBuilder.length());
		
		
		System.out.println(stringBuilder.append(" babu bhaiya"));
		System.out.println(stringBuilder.insert(4, "fggfdg "));
		
		
		
		
		String str1="shelu";
		String str2="shels";
		if (str1.equals(str2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println(str1.compareToIgnoreCase(str2));
		}
		
		
		
		
		
		
	}
}
