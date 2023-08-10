#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <conio2.h>

void moverDisco(int, char, char, char);

int main(){
    setlocale(LC_ALL, "portuguese");
    textcolor(GREEN);
    int discos = 3;
    printf(" Número de discos: ");
    scanf("%d", &discos);
    printf(" Para %d discos, será necessário %d movimentos!\n\n", discos, (int)(pow(2,discos)-1));
    moverDisco(discos, 'A','B','C');
    return 0;
}
/*!
       -        |        |
      ---       |        |
     -----      |        |
       A        B        C

       1 de A para B
       2 de A para C
       1 de B para C
       3 de A para B
       1 de C para A
       2 de C para B
       1 de A para B
*/

void moverDisco(int d, char a, char b, char c){
    if(d==1){
        printf(" Mover disco %d de %c para %c\n", d, a, b);
    }else{
        moverDisco(d-1, a, c, b);
        printf(" Mover disco %d de %c para %c\n", d, a, b);
        moverDisco(d-1, c, b, a);
    }
}
