package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Addition;
import main.java.CalculatorException;
import main.java.Divide;
import main.java.Operation;

import org.junit.Before;
import org.junit.Test;

public class DivideTest {

	Stack<Double> stackTest = new Stack<Double>();
	Operation divide;

	@Before
	public void setUp() throws Exception {
		divide = new Divide();
		stackTest.push((double) 10);
		stackTest.push((double) 2);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		divide.execute(stackTest);
		assertEquals((Double) 5.0, (Double) stackTest.pop());
		
	}
}
