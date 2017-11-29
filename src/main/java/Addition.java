package main.java;

import java.util.Stack;

public class Addition implements Operation {
	/*
	 * static{ OperationFactory.registerProduct("+", new Addition()); }
	 */

	@Override
	public Stack execute(Stack stack) throws CalculatorException {
		// OperationFactory.registerProduct("+", new Addition());
		if (stack.empty()) {
			throw new CalculatorException(
					"Stack is empty.Please check the input string");
		}
		double firstOperand = (double) stack.pop();
		double secondOperand = (double) stack.pop();
		double result = firstOperand + secondOperand;
		stack.push(result);
		return stack;
	}

}
