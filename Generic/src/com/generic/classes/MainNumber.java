package com.generic.classes;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class MainNumber {

	
	public static void main(String[] args) {
		NumBox<Integer> intBox=new NumBox<>();
		
		intBox.setTArray(20,34,54,6);
		
		intBox
		  .getStream()
		  .sorted()
		  .forEach(System.out::println);
		
		NumBox<Float> floatBox = new NumBox<>();
		Float[] floatArrayFloats= {12.1f,13.34f,190.56f};
		floatBox.setTArray(floatArrayFloats);
		
		Optional<Float> max=floatBox.getStream().max(Float::compare);
		
	}
}
