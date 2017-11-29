package main.java;

import java.util.Stack;

public class Factorial implements Operation {

	@Override
	public Stack execute(Stack stack) throws CalculatorException {
		if(stack.empty()){
			throw new CalculatorException("Stack is empty.Please check the input string");
		}
		double firstOperand =  (double) stack.pop();
		double result = factorial(firstOperand);
		stack.push(result);
		
		return stack;
	}
	
    private  static double factorial(double n){    
    	  if (n == 0)    
    		    return 1;    
    		  else    
    		    return(n * factorial(n-1));    
    		 } 


}
