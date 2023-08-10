#include <stdio.h>
#include <locale.h>

/*
int Fconta (int x){
     return 2*x + 2;
}
*/

float Fpar(int par1, int par2, float par3){
    if(par1 == 13){
        if(par2 == 22)
            return par3+(par3*0.13)-22;
        else
            return par3+(par3*0.13)-25;
    }else{
        if(par2 == 22)
            return par3+(par3*0.15)-22;
        else
            return par3+(par3*0.15)-25;
    }
}


int main (){

    /*
        int x = 0;
        printf("Informe o valor para x: ");
        scanf("%d", &x);
        printf("F(x) = %d ", Fconta(x));
    */

    setlocale(LC_ALL, "portuguese");

    int cod1 = 0, cod2 = 0;
    double valor = 0.0;

    while((cod1!=13 && cod1!=15) || (cod2!=22 && cod2!=25) || (valor<=0.0)){
        printf(" Informe o código 1 (13 ou 15): ");
        scanf("%d", &cod1);
        printf(" Informe o código 2 (22 ou 25): ");
        scanf("%d", &cod2);
        printf(" Informe o valor: ");
        scanf("%lf", &valor);
        clrscr();
    }

    printf("\n Valor do produto: R$ %.2f \n", Fpar(cod1, cod2, valor));

    return 0;
}
