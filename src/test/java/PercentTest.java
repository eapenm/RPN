package test.java;

import static org.junit.Assert.*;

import java.util.Stack;

import main.java.Addition;
import main.java.CalculatorException;
import main.java.Operation;
import main.java.Percent;

import org.junit.Before;
import org.junit.Test;

public class PercentTest {

	Stack<Double> stackTest = new Stack<Double>();
	Operation percent;

	@Before
	public void setUp() throws Exception {
		percent = new Percent();
		stackTest.push((double) 2);
		stackTest.push((double) 50);
		
	}

	@Test
	public void testExecuteTrue() throws CalculatorException {
		percent.execute(stackTest);
		assertEquals((Double) 0.5, (Double) stackTest.pop());
		
	}

}
