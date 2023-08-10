package produto;

import java.util.Random;
// import java.io.IOException -> lançamento de exceção própria

public class Main {

    /*
     * Função estática para o método main
     * Recebe, como parâmetro, um vetor do tipo float
     * Retorna um vetor que indica a posição do menor e maior valor do vetor passado
     * no parâmetro
     * 
     * indexPos[0] --> menor valor do vetor
     * indexPos[1] --> maior valor do vetor
     * 
     */
    static int[] indexPos(float[] vetor) {

        // Cria as variáveis de comparação e são atribuídas já com a primeira posição
        float menor = vetor[0], maior = vetor[0];

        // Cria as variáveis de posição já o o primeiro índice do vetor
        int posMenor = 0, posMaior = 0;

        // For que vai da 2ª posição até a a ultima
        for (int i = 1; i < vetor.length; i++) {

            // Se o valor atual é MENOR que o anterior, as variáveis de menor e posMenor são
            // atualizadas
            if (menor > vetor[i]) {
                menor = vetor[i];
                posMenor = i;
            }

            // Se o valor atual é MAIOR que o anterior, as variáveis de maior e posMaior são
            // atualizadas
            if (maior < vetor[i]) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        // Declara o vetor com as respectivas posições do menor valor e maior valor
        int[] pos = { posMenor, posMaior };

        // retorna o vetor gerado acima
        return pos;
    }

    public static void main(String[] args) throws Exception {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Instância para criar um regador numérico
        Random random = new Random();

        // Instância para criar um vetor do objeto 'Produto'
        Produto[] vetProdutos = new Produto[10];

        // Variável auxiliar para receber o retorno da função indexPos(float[])
        int retorno = 0;

        // Declaração de um vetor de 5 posições com o menor valor possível
        float[] maiores = { -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE };

        // Declaração de um vetor de 5 posições com o maior valor possível
        float[] menores = { Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE };

        // Lista para armazenar o nome dos produtos de maior preço
        String[] prodMaiores = new String[5];

        // Lista para armazenar o nome dos produtos de menor preço
        String[] prodMenores = new String[5];

        // Declara códigos ANSI de cores
        String[] cores = { "\033[31;1m", "\033[32;1m", "\033[m" };

        System.out.println("-".repeat(25));
        for (int i = 0; i < vetProdutos.length; i++) {

            // Cria um produto
            Produto produto = new Produto(String.format("%2dº Produto", i + 1),
                    random.nextFloat(1.0f, 15.0f));

            // Armazena o produto criado em um vetor
            vetProdutos[i] = produto;

            // Mostra os dados do produto criado (nome e valor)
            System.out.format("%s -> %s%5.2f%s\n",
                    vetProdutos[i].getName(),
                    String.format("\033[3%d;1m", (i % 2) + 4),
                    vetProdutos[i].getValor(),
                    cores[2]);

            /*
             * Retorna a posição do MENOR número:
             * Isso permite comparar o menor número da lista de maiores com o valor atual
             * 
             */
            retorno = indexPos(maiores)[0];

            // Se o menor valor do vetor de maiores é menor que o valor atual, o vetor é
            // atualizado como o atual dado
            if (maiores[retorno] < vetProdutos[i].getValor()) {
                maiores[retorno] = vetProdutos[i].getValor();
                prodMaiores[retorno] = vetProdutos[i].getName();
            }

            /*
             * Retorna a posição do MAIOR número:
             * Isso permite comparar o maior número da lista de menores com o valor atual
             * 
             */
            retorno = indexPos(menores)[1];

            // Se o maior valor do vetor de menores é maior que o valor atual, o vetor é
            // atualizado como o atual dado
            if (menores[retorno] > vetProdutos[i].getValor()) {
                menores[retorno] = vetProdutos[i].getValor();
                prodMenores[retorno] = vetProdutos[i].getName();
            }
        }
        System.out.println("-".repeat(25));

        // Mostra os maiores valores
        System.out.format("\n%sMaiores%s Valores: \n", cores[1], cores[2]);
        for (int i = 0; i < maiores.length; i++) {

            System.out.format("%s -> %s%5.2f%s\n",
                    prodMaiores[i],
                    cores[1],
                    maiores[i],
                    cores[2]);
        }

        // Mostra os menores valores
        System.out.format("\n%sMenores%s Valores: \n", cores[0], cores[2]);
        for (int i = 0; i < menores.length; i++) {

            System.out.format("%s -> %s%5.2f%s\n",
                    prodMenores[i],
                    cores[0],
                    menores[i],
                    cores[2]);
        }
        System.out.println("-".repeat(25));
    }
}
