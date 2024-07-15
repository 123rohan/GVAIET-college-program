package com.generic.classes;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumBox<T extends Number> {

	
	private T[] tArray;
	
	public void setTArray(T...tArray) {
		this.tArray=tArray;
	}
	
	
	public Stream<T> getStream(){
		return Arrays.stream(tArray);
	}
}
