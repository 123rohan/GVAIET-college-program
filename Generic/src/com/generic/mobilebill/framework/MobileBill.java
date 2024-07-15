package com.generic.mobilebill.framework;


//@FunctionalInterface
public interface MobileBill<T extends Payable> {
	
	public Float generateBill(T noDays);
	

}
