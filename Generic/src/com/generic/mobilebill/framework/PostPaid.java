package com.generic.mobilebill.framework;

public class PostPaid implements MobileBill<PostPaid>,Payable {

	
	
		private Integer noDays;
		
		public void setnoInteger(Integer noDays) {
			this.noDays=noDays;
		}

		public Integer getNoDays() {
			return noDays;
		}
		
	

		@Override
		public Float generateBill(PostPaid noDays) {
			// TODO Auto-generated method stub
			return noDays.getNoDays * 10.0f;
		}
		
}
