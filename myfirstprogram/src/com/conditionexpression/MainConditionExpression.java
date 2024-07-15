package com.conditionexpression;

public class MainConditionExpression {
	
	public static void main(String[] args) {
		int variable1=10;
		int variable2=20;
		int variable3=300;
		
		ConditionExpression conditionExpression= new ConditionExpression(variable1<variable2);
		conditionExpression.testIf();
		
		ConditionExpression conditionExpression1= new ConditionExpression((variable1<variable2) && (variable1<variable3));
		conditionExpression1.testIf();
		
		ConditionExpression conditionExpression2= new ConditionExpression();
	char result=conditionExpression2.testElseif(35);
	System.out.println(result);
	
	conditionExpression2.testSwitch(result);
		
	}

}
