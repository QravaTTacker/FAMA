#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    float nota, total;
    printf("===========================\n\n");
    for(int i=1;i<=3;i++){
        printf(" %iª Nota: ", i);
        scanf("%f", &nota);
        total += nota;
    }
    printf("\n Média = %.2f ponto(s)\n", total/3);
    printf("\n===========================\n");
    return 0;
}
