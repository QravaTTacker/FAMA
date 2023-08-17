package calcular.expression.operadores;

import calcular.expression.Expression;

/**
 * Classe filha de Operator, que aceita duas expressões: Uma à esquerda e outra
 * à direta.
 */
public class Addition extends Operator {

	/**
	 * Método construtor que faz chamada ao método da classe mãe.
	 * 
	 * @param esquerda
	 * @param direita
	 */
	public Addition(Expression esquerda, Expression direita) {
		super(esquerda, direita);
	}

	/**
	 * Método da classe mãe, responsável por retornar o símbolo do operador.
	 * 
	 * @return simbolo do operador.
	 */
	@Override
	public char getSymbol() {
		return '+';
	}

	/**
	 * Método da classe mãe da sua própria mãe, responsável por realizar a adição
	 * entre a expressão da esquerda com a direita.
	 * 
	 * @return soma dos valores.
	 */
	@Override
	public double calculate() {
		return super.left.calculate() + super.right.calculate();
	}

	/**
	 * Método da classe mãe da sua própria mãe, responsável por retornar a expressão
	 * em notação algébrica.
	 * 
	 * @return expressão algébrica.
	 */
	@Override
	public String toString() {
		return "(" + super.left.toString() + " + " + super.right.toString() + ")";
	}

	/**
	 * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
	 * externos.
	 * 
	 * @return Objeto String com a expressão algébrica formatada.
	 */
	@Override
	public String expression() {
		return this.toString().substring(1, this.toString().length() - 1);
	}

	/**
	 * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
	 * externos e com exibição do resultado.
	 * 
	 * @return Objeto String com a expressão algébrica formatada.
	 */
	@Override
	public String fullExpression() {
		return String.format("%s = %.2f",
				this.expression(),
				this.calculate());
	}

}
