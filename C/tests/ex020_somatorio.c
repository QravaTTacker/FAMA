#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

int somatorio(int);

int main(){
    setlocale(LC_ALL, "portuguese");
    textcolor(GREEN);
    int lim = 0;
    printf(" Valor limite para somatório: ");
    scanf("%d", &lim);
    if(lim >= 0){
        printf(" Somatório 1 até %d = %d\n", lim, somatorio(lim));
    }
    else
        printf(" Valor limite inválido\n");
    return 0;
}

int somatorio(int n){
    if(n == 0)
        return n;
    else
        return n + somatorio(n-1);
}
