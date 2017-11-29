package main.java;

import java.util.Stack;

public class Percent implements Operation {

	@Override
	public Stack execute(Stack stack) throws CalculatorException {
		if(stack.empty()){
			throw new CalculatorException("Stack is empty.Please check the input string");
		}
		double firstOperand =  (double) stack.pop();
		double result = firstOperand / 100;
		stack.push(result);
		
		return stack;
	}

}
