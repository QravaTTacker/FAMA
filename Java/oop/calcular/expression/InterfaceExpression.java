package calcular.expression;

/**
 * Interface para implementar a assinatura dos métodos da classe Expression.
 * 
 * @author FAMA 3º Período de TADS
 * @version 1.0
 */
public interface InterfaceExpression {

    /**
     * Realiza o cálculo ou retorna o valor.
     * 
     * @return double, sendo o resultado da operação filha.
     */
    double calculate();

    /**
     * Realiza a demostração da parte textual da expressão.
     * 
     * @return Objeto String com a expressão algébrica.
     */
    @Override
    String toString();

    /**
     * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
     * externos.
     * 
     * @return Objeto String com a expressão algébrica formatada.
     */
    String expression();

    /**
     * O mesmo que {@link #toString()}, mas com eliminação dos parênteses
     * externos e com exibição do resultado.
     * 
     * @return Objeto String com a expressão algébrica formatada.
     */
    String fullExpression();

}
