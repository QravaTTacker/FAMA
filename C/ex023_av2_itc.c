#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    char resp;
    do{
        int y = 0;  //Menos para os casos em que o expoente é uma fração :/
        float x = 0, pot = 1;
        printf("--------------------------------\n");
        printf("Informe o valor da base: ");
        scanf("%f", &x);
        printf("Informe o valor do expoente: ");
        scanf("%d", &y);
        printf("\n----------\n");
        if(y >= 0){
            for(int i=1;i<=y;i++){
                pot*=x;
            }
            printf("\nResultado da potência: %.2f\n", pot);
        }else{
            y *= (-1);
            for(int i=1;i<=y;i++){
                pot*=x;
            }
            printf("\nResultado da potência: %.4f\n", (1/pot));
        }
        printf("--------------------------------\n");
        printf("\nContinuar? [s/n] ");
        scanf("%s", &resp);
        printf("\n");
    }while(resp != 'n');
    return 0;
}
