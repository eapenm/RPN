package main.java;

import java.util.HashMap;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class OperationFactory {
	static Map<String, Operation> operations;
	static {
		operations = new HashMap();
		operations.put("-", new Subtraction());
		operations.put("+", new Addition());
		operations.put("*", new Multiply());
		operations.put("/", new Divide());
		operations.put("^", new Exponent());
		operations.put("%", new Percent());
		operations.put("!", new Factorial());
	}

	/*
	 * public static void registerProduct (String operationType, Operation
	 * operationClass) { operations.put(operationType, operationClass); }
	 */

	public static Operation getToken(String token) {
		// System.out.println(operations.get(token));
		if (StringUtils.isNumeric(token)) {
			return null;
		} else {
			return operations.get(token);
		}
	}

}
