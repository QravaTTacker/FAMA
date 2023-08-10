package calcular.expression.operadores;

import calcular.expression.Expression;

/** Representação da herança entre Classes do projeto calcular:
*
*                        /-----(Operator)---\
*                       /     /        \     \
*             (Addition)     /         |      \  
*                           /          |       (Division)
*                (Subtraction)         \   
*                                  (Multiplication)  
*               
*/

/**
 * É filha de Expression e mãe de quatro classes filhas:
 * <p>
 * 1) Addition
 * <p>
 * 2) Subtraction
 * <p>
 * 3) Multiplication
 * <p>
 * 4) Division
 * 
 * <p>
 * Todo operador possui outras duas instancias ao seu lado que são expressões:
 * {@link #right} e {@link #left}.
 * 
 * @author FAMA 3º Período de TADS
 * @version 1.0
 */
abstract public class Operator extends Expression {

	/**
	 * Expressão à direita.
	 */
	protected Expression right;

	/**
	 * Expressão à esquerda.
	 */
	protected Expression left;

	/**
	 * Método construtor responsável por definir uma expressão e indicar os termos
	 * da direta e esquerda.
	 * 
	 * @param right expressão à direta.
	 * @param left  expressão à esquerda.
	 */
	public Operator(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Retorna o simbolo de toda a expressão.
	 * 
	 * @return simbolo.
	 */
	abstract protected char getSymbol();

}
