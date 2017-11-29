# RPNCalculator
**************************************************
* Basic Reverse Polish Notation (RPN) Calculator *
**************************************************

Command-line based RPN Calculator

Introduction:
*************

RPN Calculator waits for user input and expects to receive strings containing whitespace separated lists of numbers and operators.

Numbers are pushed in to the stack. Operators operate on numbers that are on the stack.

The RPN notation is also known as postfix expression. The capabilities of the Calculator are as follows:
1. Supports operations for sum, difference, division, multiplication.
2. Supports floating point operations.
3. Use '^' for exponent operator. values entered as "X Y ^" are calculated as X to the power of Y.
4. Use '%' for the percent operation. values entered as "X %" are calculated as X/100.
5. Use ‘!’ for Factorial (unary operation).

After processing an input string, the calculator displays the results.

Requirements:
************
  Implemented and tested using Java 7

  Project dependencies and compiling managed by Maven

Compile, Test, Run, Packaging ,Packaging using the dependency using Maven:
*************************************************************************

Compile: mvn compile

Test: mvn test

Run: mvn exec:java

Packaging: mvn package, compiled jar in target/ folder

Packaging with the dependecncy jars :mvn assembly:assembly -DdescriptorId=jar-with-dependencies


How to run the Executable:
**************************

java -jar RPNCalculator.jar





