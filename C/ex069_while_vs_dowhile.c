#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "PORTUGUESE");

    int i, j = 1, soma = 0;
    int i2, j2 = 1, soma2 = 0;
    int i3, j3 = 1, soma3 = 0;
    char resp, resp2, resp3;

    printf("\n____________ DO WHILE\n\n");
    do{
        printf("Informe o %iº valor: ", j);
        scanf("%i", &i);
        soma += i;
        j++;
        printf("Deseja para? [S/N] ");
        scanf("%s", &resp);
        printf("\n");
    }while(resp == 'n');
    printf("A soma foi de: %i\n\n", soma);

    //Ele executa enquanto a condição é verdadeira!
    //...ou seja, quando a variável assume o valor na condição o laço continua!

    printf("\n\n____________ WHILE\n\n");
    resp2 = 'n';
    while (resp2 == 'n'){
        printf("informe o %iº valor: ", j2);
        scanf("%i", &i2);
        soma2 += i2;
        j2++;
        printf("Deseja para? [S/N] ");
        scanf("%s", &resp2);
        printf("\n");
    }
    printf("A soma foi de: %i\n\n", soma2);

    //Ele executa enquanto a condição é verdadeira!
    //...ou seja, quando a variável assume outro valor na condição ele para!

    /*-----------------------------------------------------------------------
                                Para o visualg:

    Há uma inversão no valor lógico entre esses dois controles de repetição!
    Enquanto condição (verdadeira) faça (instruções)
    Repita (instruções) até condição (falsa)

    */
    printf("\n\n____________ FOR\n\n");
    for(resp3='n';resp3!='s';){
        printf("Informe o %iº valor: ", j3);
        scanf("%i", &i3);
        soma3 += i3;
        printf("Deseja para? [S/N] ");
        scanf("%s", &resp3);
        j3++;
        printf("\n");
    }
    printf("A soma foi de: %i", soma3);
    printf("\n\n____________________________________\n\n");

    return 0;
}
