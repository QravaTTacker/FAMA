#include <stdio.h>

int main(){

    //OBS: Quando o salto é depois (c++), será realizada +1 decremento ou incremento!!!

    printf("_______________________\n\n");

        int c1 = 10;
        while(c1 > 0)
            printf("C1 cont = %d\n", c1--);

    //Nesse primeiro caso, temos dois comandos, por isso o uso das chaves {}

    printf("_______________________\n\n");

        int c2 = 11;
        while(--c2)
            printf("C2 cont = %d\n", c2);

    /*

    Nessa estrutura indica que:

    O valor de c2 será inicializado com o valor de n, mas só exibe o (n - 1);
    O valor de n irá para quando chegar em 0;

    (i--) para i > 0 (positivo);
    (i++) para i < 0 (negatigo);

    para i = 0 o laço não é executado.

    */

    printf("_______________________\n\n");

        int c3 = 10;
        while(--c3 >= 2);
            printf("C3 cont = %d\n", c3);

    printf("_______________________\n\n");

    return 0;
}
