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
        printf("Informe o %i� valor: ", j);
        scanf("%i", &i);
        soma += i;
        j++;
        printf("Deseja para? [S/N] ");
        scanf("%s", &resp);
        printf("\n");
    }while(resp == 'n');
    printf("A soma foi de: %i\n\n", soma);

    //Ele executa enquanto a condi��o � verdadeira!
    //...ou seja, quando a vari�vel assume o valor na condi��o o la�o continua!

    printf("\n\n____________ WHILE\n\n");
    resp2 = 'n';
    while (resp2 == 'n'){
        printf("informe o %i� valor: ", j2);
        scanf("%i", &i2);
        soma2 += i2;
        j2++;
        printf("Deseja para? [S/N] ");
        scanf("%s", &resp2);
        printf("\n");
    }
    printf("A soma foi de: %i\n\n", soma2);

    //Ele executa enquanto a condi��o � verdadeira!
    //...ou seja, quando a vari�vel assume outro valor na condi��o ele para!

    /*-----------------------------------------------------------------------
                                Para o visualg:

    H� uma invers�o no valor l�gico entre esses dois controles de repeti��o!
    Enquanto condi��o (verdadeira) fa�a (instru��es)
    Repita (instru��es) at� condi��o (falsa)

    */
    printf("\n\n____________ FOR\n\n");
    for(resp3='n';resp3!='s';){
        printf("Informe o %i� valor: ", j3);
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
