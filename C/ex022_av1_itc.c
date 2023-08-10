#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    int n = 0;
    printf("Informe o número de linhas: ");
    scanf("%d", &n);
    printf("----------------------------------------------\n");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf(" * ");
        }
        printf("\n");
    }
    printf("----------------------------------------------");
    return 0;
}
