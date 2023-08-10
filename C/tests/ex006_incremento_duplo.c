#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        float nota = 0.0, total = 0.0;
        printf("===========================\n\n");
        for(int i = 1; i <= 3; i++, total+=nota){
            printf(" %iª Nota: ", i);
            scanf("%f", &nota);
        }
        printf("\n Média = %.2f ponto(s)\n", total/3);
        printf("\n===========================\n");
        printf("\n Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp != 's');
    return 0;
}
