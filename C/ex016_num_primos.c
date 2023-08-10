#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include "conio.h"

int main(){

    setlocale(LC_ALL, "PORTUGUESE");
    system("color 2");

    int num = 0, i = 0, div = 0;

    printf("_________ Número Primos _________\n");
    printf("\n  Digite um valor: ");
    scanf("%i", &num);
    if(num % 2 != 0){
        i = num;
        while(i >= 2){
            if((num % num == 0) && (num % i == 0)){
                div++;
            }
        i--;
        }
    }
    if(div == 1){
        printf("\n\t%i é primo!\n", num);
    }else{
       printf("\n\t%i não é primo\n", num);
    }
    printf("_________________________________\n");
    return 0;
}
