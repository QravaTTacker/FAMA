#include <stdio.h>
#include <stdlib.h>

int main(){

    float n1, n2, n3, n4, m;

    printf("----------- Media Escolar -----------\n\n");
    printf("Exemplo de nota: 7.55\n");
    printf("\nInforme a sua primeira nota: ");
        scanf("%f", &n1);

    printf("Informe a sua segunda nota: ");
        scanf("%f", &n2);

    printf("Informe a sua terceira nota: ");
        scanf("%f", &n3);

    printf("Informe a sua quarta nota: ");
        scanf("%f", &n4);

    m = (n1+n2+n3+n4)/4;

    printf("\nMedia: %.2f\n", m);

        if((m>=7)&&(m<=10)){

            printf("\nAprovado! :)\n");

        }else if((m < 7)&&(m >=0)){

            printf("\nReprovado :/\n");

        }else{

            printf("\nFalso ._.\n");

        }

    return 0;
}
