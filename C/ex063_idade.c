#include <stdio.h>
#include <stdlib.h>

int main(){

    int idade;

    /*

    idade de 1 a 12 -> kid
    idade de 13 a 18 -> jovem
    idade de 19 a 50 -> adulto
    idade de 51 a 100 -> idoso

    */

    printf("Informe sua idade: ");
        scanf("%i", &idade);

        if((idade >= 1)&&(idade <= 12)){

            printf("\nKid\n");

        }else{
            if((idade >= 13)&&(idade <= 18)){

                printf("\nJovem\n");

            }else{
                if((idade >= 50)&&(idade <= 100)){

                    printf("\nIdoso\n");

                }else{
                    if((idade > 18)&&(idade < 50)){

                        printf("\nAdulto\n");

                    }else{
                        if((idade > 100)&&(idade <= 120)){

                            printf("\nVc ainda esta vivo? .-.\n");

                        }else{

                            printf("\nFalso\n");

                        }

                    }

                }

            }

        }

    return 0;
}
