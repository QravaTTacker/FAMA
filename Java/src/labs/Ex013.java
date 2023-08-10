package labs;

import java.util.Random;

public class Ex013 {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        String red = "\033[31;1m", green = "\033[32;1m", sem = "\033[m", des = "\033[4m";
        int i, var = 0;

        // Se ele for diferente de 10 e menor que 100 ele sairá do loop indicando que
        // não achou o número esperado
        for (i = 0; var != 10 && i <= 100; i++) {
            var = random.nextInt(10) + 1;
            System.out.format("var[%d] = %d\n", i, var);
        }
        String result = i > 100
                ? String.format("Parece que %srandom.nextInt(10)%s %sNÃO%s vai até o 10%n", des, sem, red, sem)
                : String.format("Encontramos o valor 10 na posição %svar[%d]%s", green, i - 1, sem);
        System.out.println(result);
    }
}
