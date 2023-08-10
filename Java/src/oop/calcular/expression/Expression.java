package calcular.expression;

/** Representação da herança entre Classes do projeto calcular:
*
*				          (Expression) <- (Interface)
*                        /            \
*              (Operand)               \
*             /          \              \---\
*    (Variable)          (Constant)          \
*									          \
*                                     /-----(Operator)---\
*			        		         /     /        \     \
*                          (Addition)     /         |      \
*                                        /          |       (Division)
*                             (Subtraction)         \   
*                                               (Multiplication)
*
*/

/**
 * Abstract não serve para instanciação.
 * 
 * É mãe de todas as classes.
 * 
 * @author FAMA 3º Período de TADS
 * @version 1.0
 */
abstract public class Expression implements InterfaceExpression {

	/**
	 * Realiza o cálculo ou retorna o valor.
	 * 
	 * @return double, sendo o resultado da operação filha.
	 */
	@Override
	abstract public double calculate();

	/**
	 * Realiza a demostração da parte textual da expressão.
	 * 
	 * @return Objeto String com a expressão algébrica.
	 */
	@Override
	abstract public String toString();

	/**
	 * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
	 * externos.
	 * 
	 * @return Objeto String com a expressão algébrica formatada.
	 */
	@Override
	abstract public String expression();

	/**
	 * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
	 * externos e com exibição do resultado.
	 * 
	 * @return Objeto String com a expressão algébrica formatada.
	 */
	@Override
	abstract public String fullExpression();

}
