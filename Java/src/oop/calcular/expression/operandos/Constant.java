package calcular.expression.operandos;

/**
 * Classe filha de Operand, responsável por definir uma constante.
 * 
 * <p>
 * <b>Métodos:</b>
 * <p>
 * {@link #Constant(double)}
 */
public class Constant extends Operand {

	/**
	 * Método construtor que faz a chamada ao construtor da classe mãe (Operand).
	 * 
	 * @param value
	 */
	public Constant(double value) {
		super(value);
	}

	/**
	 * Método capaz de retornar o valor de uma constante.
	 * 
	 * @return Objeto String com a expressão formatada.
	 */
	@Override
	public String expression() {
		return Double.toString(super.value);
	}

	/**
	 * Método capaz de retornar o valor de uma constante e um identificador.
	 * 
	 * @return Objeto String com a expressão formatada.
	 */
	@Override
	public String fullExpression() {
		return this.expression() + " -> const";
	}

}
