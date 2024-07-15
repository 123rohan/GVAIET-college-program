package com.conditionexpression;

public class ConditionExpression {
		private boolean expression;
		public ConditionExpression()
		{}
		public ConditionExpression(boolean expression)
		{
			this.expression=expression;
		}
		public void setExpression(boolean expression)
		{
			this.expression=expression;
			
		}
		public boolean getExpression()
		{
			return this.expression;
		}
		public void testIf()
		{
			if(expression)
			{
				System.out.println("if block");
				
			}
			else
			{
				System.out.println("else block");
			}
		}
		
		public char testElseif(int marks)
		{
			if(marks>=90)
				return 'A';
			
			else if(marks>=80)
				return 'B';
			
			else if(marks>=70)
				return 'C';
			
			else if(marks>=60)
				return 'D';
		
			else if(marks>=50)
				return 'E';
			else
				return 'F';
		}
//		
//		public char testSwitch(char charater)
//		{
//			switch(charater)
//		case 1:
//		}
		public void testSwitch(char result) {
			// TODO Auto-generated method stub
			
		}
}


//