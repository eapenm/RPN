package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.lang3.StringUtils;

public class RPNCalculatorManager {
	Stack<Double> stack = new Stack<Double>();

	public double evaluateRpn(String inputString)throws CalculatorException {
        if (inputString == null) {
            throw new CalculatorException("Please provide some input.");
        }
		String[] tokens = inputString.split(" ");
		
		for (String token : tokens) {
			Operation operation = checkToken(token);
			if(operation != null){
			operation.execute(stack);
			}
		}
		return stack.pop();

	}

	private Operation checkToken(String token) throws CalculatorException {
		Operation opr = OperationFactory.getToken(token);
		if (opr == null) {
			if(!StringUtils.isNumeric(token)){
				throw new CalculatorException("Please verify the  input string.");
			}
			stack.push(Double.parseDouble(token));
		}
		return opr;

	}
}
