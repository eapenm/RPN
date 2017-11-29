package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Addition;
import main.java.CalculatorException;
import main.java.Operation;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	
	Stack<Double> stackTest = new Stack<Double>();
	Operation addition;

	@Before
	public void setUp() throws Exception {
		addition = new Addition();
		stackTest.push((double) 2);
		stackTest.push((double) 3);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		addition.execute(stackTest);
		assertEquals((Double) 5.0, (Double) stackTest.pop());
		
	}

}
