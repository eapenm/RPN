package main.java;

import java.util.Stack;

public class Subtraction implements Operation {

	@Override
	public Stack execute(Stack stack) {
		double firstOperand =  (double) stack.pop();
		double secondOperand =  (double) stack.pop();
		double result = firstOperand - secondOperand;
		stack.push(result);
		
		return stack;
	}

}
