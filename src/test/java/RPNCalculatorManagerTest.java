package test.java;

import static org.junit.Assert.assertEquals;
import main.java.CalculatorException;
import main.java.RPNCalculatorManager;

import org.junit.Test;

public class RPNCalculatorManagerTest {
	RPNCalculatorManager rpn = new RPNCalculatorManager();

	@Test
	public void testCalculateMinus() throws Exception {

		String expr = "1 2 -";
		assertEquals((Double) 1.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculatePlus() throws Exception {
		String expr = "1 2 +";
		assertEquals((Double) 3.0, (Double) rpn.evaluateRpn(expr));

	}

	@Test
	public void testCalculatePlusMinus() throws Exception {
		String expr = "1 2 3 + -";
		assertEquals((Double) 4.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateMultiply() throws Exception {
		String expr = "2 2 *";
		assertEquals((Double) 4.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculatePlusMultMinus() throws Exception {
		Double expected = -14.0;
		String expr = "5 1 2 + 4 * + 3 -";
		assertEquals(expected, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateDivide() throws Exception {
		String expr = "20 4 /";
		assertEquals((Double) 5.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateExponent() throws Exception {
		String expr = "2 3 ^ ";
		assertEquals((Double) 9.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateDivideMultiply() throws Exception {
		String expr = "6 2 * 3 /";
		assertEquals((Double) 4.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateExponentPlus() throws Exception {
		String expr = "2 3 ^ 4 5 + + ";
		assertEquals((Double) 18.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculatePercent() throws Exception {
		String expr = "50 % 2 * ";
		assertEquals((Double) 1.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateFactorial() throws Exception {
		String expr = "3 ! 4 5 * +";
		assertEquals((Double) 26.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateFactorialDivide() throws Exception {
		String expr = "12 3 / !";
		assertEquals((Double) 24.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test
	public void testCalculateFactorialMultiplePlus() throws Exception {
		String expr = "3 ! 4 5 * +";
		assertEquals((Double) 26.0, (Double) rpn.evaluateRpn(expr));
	}

	@Test(expected = CalculatorException.class)
	public void testNullInput() throws Exception {
		rpn.evaluateRpn(null);
	}

	@Test(expected = CalculatorException.class)
	public void testOnlyOperators() throws Exception {
		rpn.evaluateRpn("+ +");
	}

	@Test(expected = CalculatorException.class)
	public void testInvalidCharacters() throws Exception {
		rpn.evaluateRpn("5 c +");
	}

	@Test(expected = CalculatorException.class)
	public void testDivideByZero() throws Exception {
		rpn.evaluateRpn("9 0 /");
	}

	@Test(expected = CalculatorException.class)
	public void testNoSpaces() throws Exception {
		rpn.evaluateRpn("22+");
	}
}
