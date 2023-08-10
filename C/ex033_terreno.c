#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    float largura, comprimento;
    printf("===========================\n");
    printf("          Terreno          \n");
    printf("===========================\n");
    printf("\n Largura (m): ");
    scanf("%f", &largura);
    printf(" Comprimento (m): ");
    scanf("%f", &comprimento);
    if(largura>1 && comprimento>0){
        printf("\n     -----------------\n");
        printf("      Área: %.2f m²\n", comprimento*largura);
        printf("     -----------------\n");
    }else if(largura<=0 || comprimento<=0)
        printf("\n    Valor inválido :/\n\n");
    printf("===========================\n");
    return 0;
}
