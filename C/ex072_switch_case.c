#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
        switch é uma estrutura semelhante ao comando if,
        ou seja, trabalha com condições. Cada else if é
        alterado para case ():

                Estutura do switch:

                switch (variável){
                    case(condição 1/valor 1):
                        instruções
                    break;
                    case(condição 2/valor 2):
                        instruções
                    break;
                    default:
                }

        --> a instrução default será executada se:
        a) Nenhum dos casos forem satisfatório
        b) Não tiver a instrução "break" em algum dos casos
    */

    int op;
    printf("Esolha: ");
    scanf("%i", &op);
    switch(op){
        case 1:
            printf("\nop = 1");
            break;
        case 2:
            printf("\nop = 2");
            break;
        default:
            printf("\nop = x");

    }
    printf("\n");
    printf("\n");

    /*

    Quando não colocamos um break e nenhuma instrução, o caso "case" de baixo se comporta como
    uma condição composta, ou seja, um intervalo de valores:

    */

    printf("Esolha: ");
    scanf("%i", &op);
    switch(op){
        case 1:
            printf("\nop = 1");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
            printf("\nop = 2 a 5");
            break;
        default:
            printf("\nop = x");

    }
    printf("\n");
    printf("\n");

    /*

    Todavia, se colocarmos um valor/instrução no caso, a situação muda, ao digitar
    o valor do primeiro "case" teremos a execução de todos os outros casos abaixo,
    porém se digitar o valor do último caso, teremos apenas uma execução:

    */

    printf("Esolha: ");
    scanf("%i", &op);
    printf("\n");
    switch(op){
        case 1: printf("Caso 1 ");
        case 2: printf("Caso 2 ");
        case 3: printf("Caso 3 ");
            break;
        case 4:
            printf("op = 4");
            break;
        default:
            printf("op = x");

    }
    printf("\n");

    return 0;
}
