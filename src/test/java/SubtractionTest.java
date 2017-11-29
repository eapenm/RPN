package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Operation;
import main.java.Subtraction;
import main.java.CalculatorException;




import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {

	Stack<Double> stackTest = new Stack<Double>();
	Operation subtraction;

	@Before
	public void setUp() throws Exception {
		subtraction = new Subtraction();
		stackTest.push((double) 1);
		stackTest.push((double) 2);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		subtraction.execute(stackTest);
		assertEquals((Double) 1.0, (Double) stackTest.pop());
		
	}

}
