#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int lim=0;
        printf("===============================\n");
        printf(" Informe um valor limite: ");
        scanf("%d", &lim);
        printf("\n-------------------------\n");
        for(int i=0;i<=lim;i++)
            if(i%13==0)
                printf(" %4d é múltiplo de 13!\n", i);
        printf("-------------------------\n\n");
        printf("===============================\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
