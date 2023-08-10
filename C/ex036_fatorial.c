#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int FATORIAL=1, NUM, i;
        printf("=====================\n");
        printf(" Número inteiro: ");
        scanf("%d", &NUM);
        printf("---------------------\n\n");
        if(NUM<=13&&NUM>=0){
            for(i=NUM;i>1;i--){
                FATORIAL *= i;
                printf(" %i *", i);
            }
            if(NUM>0)
                printf(" %i \n\n---------------", i);
            else
                printf(" 1 \n\n---------------");
            printf("\n Fatorial: %i\n", FATORIAL);
        }else if(NUM>=-13&&NUM<0){
            for(i=NUM;i<-1;i++){
                FATORIAL *= i;
                printf(" %i *", i);
            }
            printf(" -1 \n\n---------------");
            if(NUM<0)
                printf("\n Produto: %i\n", FATORIAL*(-1));
        }else{
            printf("\n---------------------");
            printf("\n{n > 13} ou {n < -13}\n\n   C não tanka...!!\n------");
        }
        printf("---------------\n\n");
        printf("=====================\n\n");
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
