package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Addition;
import main.java.CalculatorException;
import main.java.Exponent;
import main.java.Operation;

import org.junit.Before;
import org.junit.Test;

public class ExponentTest {

	Stack<Double> stackTest = new Stack<Double>();
	Operation exponent;

	@Before
	public void setUp() throws Exception {
		exponent = new Exponent();
		stackTest.push((double) 2);
		stackTest.push((double) 3);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		exponent.execute(stackTest);
		assertEquals((Double) 9.0, (Double) stackTest.pop());
		
	}
}
