package main.java;

import java.util.Stack;

public interface Operation {
	Stack execute(Stack stack) throws CalculatorException;

}
