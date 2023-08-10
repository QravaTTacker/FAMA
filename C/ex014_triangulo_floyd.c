#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

int main(){

    setlocale(LC_ALL, "PORTUGUESE");
    system("color 2");

    int num = 0, l = 0, c = 0, soma = 0, cor = 1;
    printf("Informe um número: ");
    scanf("%i", &num);
    printf("_____________________\n\n");

    for(l = 1; l <= num ; l++){
        for(c = 1; c <= l; c++){
            if (cor == 1)
                system("color 1");
            else if (cor == 2)
                system("color 2");
            else if (cor == 3)
                system("color 3");
            else if (cor == 4)
                system("color 4");
            else if (cor == 5)
                system("color 5");
            else if (cor == 6)
                system("color 6");
            printf(" %4d ", ++soma);
            cor++;
            if (cor == 7)
                cor = 1;

        }
        printf("\n");
    }

    printf("_____________________\n\n");
    return 0;
}
