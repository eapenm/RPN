package main.java;

import java.util.Stack;

public class Divide implements Operation {

	@Override
	public Stack execute(Stack stack) throws CalculatorException {
		if(stack.empty()){
			throw new CalculatorException("Stack is empty.Please check the input string");
		}
		
		
		double firstOperand =  (double) stack.pop();
		if(firstOperand == 0){
			throw new CalculatorException("Divide by Zero exception");
		}
		double secondOperand =  (double) stack.pop();
		double result = secondOperand / firstOperand;
		stack.push(result);
		
		return stack;
	}

}
