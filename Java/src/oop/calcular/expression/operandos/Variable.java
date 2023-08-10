package calcular.expression.operandos;

/**
 * Classe filha de Operand, responsável por definir uma variável.
 * <p>
 * <b>Métodos:</b>
 * <p>
 * {@link #Variable(String, double)}
 * <p>
 * {@link #setValue(double)}
 * <p>
 * {@link #toString()}
 */
public class Variable extends Operand {

	/**
	 * Nome da variável.
	 */
	private String name;

	/**
	 * Método construtor que faz a chamada ao construtor da classe mãe (Operand).
	 * 
	 * @param name
	 * @param value
	 */
	public Variable(String name, double value) {
		super(value);
		this.name = name;
	}

	/**
	 * Método responsável por modificar o valor da variável, sendo este, o atributo
	 * da classe mãe (super).
	 * 
	 * @param value
	 */
	public void setValue(double value) {
		super.value = value;
	}

	/**
	 * Sob-escreve o método da classe mãe (Operand) para exibir o nome da
	 * variável em vez do valor convertido para literal.
	 * 
	 * @return Identificador da variável
	 */
	@Override
	public String toString() {
		return this.name;
	}

	/**
	 * Sob-escreve o método da classe mãe (Operand). Não muito efetivo para
	 * variável, por isso ele faz a sobrecarga do método {@link #get()}.
	 * 
	 * @return Identificador e valor da variável
	 */
	@Override
	public String expression() {
		return this.get();
	}

	/**
	 * Sob-escreve o método da classe mãe (Operand). Não muito efetivo para
	 * variável, por isso ele faz a sobrecarga do método {@link #get()}.
	 * 
	 * @return Identificador e valor da variável
	 */
	@Override
	public String fullExpression() {
		return this.get();
	}

	/**
	 * Retorna o nome da variável e seu valor.
	 * 
	 * @return "name = value"
	 */
	public String get() {
		return this.name + " = " + super.calculate();
	}

}
