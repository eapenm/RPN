package main.java;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class MainRPNCalculator {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			RPNCalculatorManager rpnCalculator = new RPNCalculatorManager();

			while (true) {

				System.out
						.print("Enter expression to evaluate (delimited with space) or 'q' to quit : ");
				String inputString = br.readLine();

				if ("q".equals(inputString)) {
					System.out.println("Exit!");
					System.exit(0);
				} else {
					try {
						Double result = rpnCalculator.evaluateRpn(inputString);
						System.out.println("Result:" + result);
						} catch (CalculatorException e) {
						System.out.println(e.getMessage());
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
