package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Addition;
import main.java.CalculatorException;
import main.java.Multiply;
import main.java.Operation;

import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {

	Stack<Double> stackTest = new Stack<Double>();
	Operation multiply;

	@Before
	public void setUp() throws Exception {
		multiply = new Multiply();
		stackTest.push((double) 2);
		stackTest.push((double) 3);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		multiply.execute(stackTest);
		assertEquals((Double) 6.0, (Double) stackTest.pop());
		
	}

}
