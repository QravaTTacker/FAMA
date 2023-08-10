package calcular.expression.operandos;

import calcular.expression.Expression;

/** Representação da herança entre Classes do projeto calcular:
*
*                       (Operand)
*                      /         \
*             (Variable)          (Constant)
*
*/

/**
 * É filha de Expression e mãe de duas classes filhas:
 * <p>
 * 1) Variable
 * <p>
 * 2) Constant
 * 
 * <p>
 * Todo operando possui uma informação, que é o seu {@link #value}.
 * 
 * @author FAMA 3º Período de TADS
 * @version 1.0
 */
abstract public class Operand extends Expression {

	/**
	 * Informação contida no operando.
	 */
	protected double value;

	/**
	 * Método construtor responsável por criar um operando com um valor.
	 * 
	 * @param value valor do operando.
	 */
	public Operand(double value) {
		this.value = value;
	}

	/**
	 * Método herdado da classe mãe (Expression), responsável por retornar o valor
	 * do operando (Numérico).
	 * 
	 * @return valor do operando.
	 */
	@Override
	public double calculate() {
		return this.value;
	}

	/**
	 * Método herdado da classe mãe (Expression), responsável por retornar o valor
	 * do operando (Literal).
	 * 
	 * @return valor do operando formatado.
	 */
	@Override
	public String toString() {
		return String.format("%,.2f", this.value);
	}

}
