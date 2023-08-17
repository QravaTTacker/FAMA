package calcular;

import calcular.expression.operadores.*;
import calcular.expression.operandos.*;
import calcular.expression.Expression;

public class Main {

	private final static Variable x = new Variable("x", 5.5);
	private final static Variable y = new Variable("y", 8.3);
	private final static Variable z = new Variable("z", 3.7);
	private final static Variable k = new Variable("k", 9.45);
	private final static Variable r = new Variable("r", 12.67);
	private final static Variable o = new Variable("o", 10.0);
	private final static Variable pi = new Variable("pi", 3.14);

	private final static Variable A = new Variable("A", 10);
	private final static Variable B = new Variable("B", 20);
	private final static Variable C = new Variable("C", 30);
	private final static Variable D = new Variable("D", 40);

	private final static Variable massa = new Variable("massa", 65.5);
	private final static Variable altura = new Variable("altura", 175);

	
	/** 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		showVariables();

		exemplo1();
		exemplo2();
		exemplo3();
		exemplo4();
		exemplo5();
		exemplo6();
		exemplo7();
		exemplo8();
		exemplo9();
		exemplo10();

	}

	private static void showVariables() {
		System.out.println("-".repeat(20));
		System.out.println(x.fullExpression());
		System.out.println(y.fullExpression());
		System.out.println(z.fullExpression());
		System.out.println(k.fullExpression());
		System.out.println(r.fullExpression());
		System.out.println(o.fullExpression());
		System.out.println(pi.fullExpression());
		System.out.println(A.fullExpression());
		System.out.println(B.fullExpression());
		System.out.println(C.fullExpression());
		System.out.println(D.fullExpression());
		System.out.println(massa.expression());
		System.out.println(altura.expression());
		System.out.println("-".repeat(20));
	}

	// ((5×x)+2)-y)
	private static void exemplo1() {
		Expression termo = new Subtraction(
				new Addition(
						new Multiplication(
								new Constant(5),
								x),
						new Constant(2)),
				y);
		System.out.println("1) " + termo.fullExpression());
	}

	// ((2+9.8)÷y)
	private static void exemplo2() {
		Expression termo = new Division(
				new Addition(
						new Constant(2),
						new Constant(9.8)),
				y);
		System.out.println("2) " + termo.fullExpression());
	}

	// ((2-massa)×(altura-3))
	private static void exemplo3() {
		Expression termo = new Multiplication(
				new Subtraction(
						new Constant(2),
						massa),
				new Subtraction(
						altura,
						new Constant(3)));
		System.out.println("3) " + termo.fullExpression());
	}

	// (1.1+(2×k))-O)
	private static void exemplo4() {
		Expression termo = new Subtraction(
				new Addition(
						new Constant(1.1),
						new Multiplication(
								new Constant(2),
								k)),
				o);
		System.out.println("4) " + termo.fullExpression());
	}

	// (π÷(r×r))
	private static void exemplo5() {
		Expression termo = new Division(
				pi,
				new Multiplication(
						r,
						r));
		System.out.println("5) " + termo.fullExpression());
	}

	// (massa×(altura×altura))
	private static void exemplo6() {
		Expression termo = new Multiplication(
				massa,
				new Multiplication(
						altura,
						altura));
		System.out.println("6) " + termo.fullExpression());
	}

	// ((4÷k)×x)×(1.5-y))
	private static void exemplo7() {
		Expression termo = new Multiplication(
				new Multiplication(
						new Division(
								new Constant(4),
								k),
						x),
				new Subtraction(
						new Constant(1.5),
						y));

		System.out.println("7) " + termo.fullExpression());
	}

	// ((x×y)÷z)
	private static void exemplo8() {
		Expression termo = new Division(
				new Multiplication(
						x,
						y),
				z);
		System.out.println("8) " + termo.fullExpression());
	}

	// ((A-B)×(C-D))
	private static void exemplo9() {
		Expression termo = new Multiplication(
				new Subtraction(A, B),
				new Subtraction(C, D));
		System.out.println("9) " + termo.fullExpression());
	}

	// ((1-x)×y)+(π-((2-x)×(((π×π)÷z)-y))))
	private static void exemplo10() {
		Expression termo = new Addition(
				new Multiplication(
						new Subtraction(
								new Constant(1),
								x),
						y),
				new Subtraction(
						pi,
						new Multiplication(
								new Subtraction(
										new Constant(2),
										x),
								new Subtraction(
										new Division(
												new Multiplication(pi, pi),
												z),
										y))));
		System.out.println("10) " + termo.fullExpression());
	}

}
