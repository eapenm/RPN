package main.java;

import java.util.Stack;

public class Exponent implements Operation {

	@Override
	public Stack execute(Stack stack) throws CalculatorException {
		if(stack.empty()){
			throw new CalculatorException("Stack is empty.Please check the input string");
		}
	double firstOperand =  (double) stack.pop();
		double secondOperand =  (double) stack.pop();
		double result = Math.pow(firstOperand, secondOperand);
		stack.push(result);
		
		//stack.push(Math.pow(stack.pop(), stack.pop()));
		
		return stack;
	}

}
