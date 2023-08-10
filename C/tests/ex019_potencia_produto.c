#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

int multR(int, int);
int potR(int, int);
int atribuir(char);
void msg(void);

int main(void){
    textcolor(GREEN);
    setlocale(LC_ALL, "portuguese");
    int x = 0, y = 0;
    msg();
    printf("\n %15s \n\n", "X x Y");
    x = atribuir('X');
    y = atribuir('Y');
    printf("\n A multiplica��o � %d\n", multR(x, y));
    msg();
    printf("\n %15s \n\n", "X ^ Y");
    x = atribuir('X');
    y = atribuir('Y');
    printf("\n A pot�ncia � %d\n", potR(y, x));
    msg();
    return 0;
}

int multR(int v, int n){
    if(v == 1)
        return n;
    else
        return n + multR(v-1, n);
}

int potR(int v, int n){
    if(v == 0)
        return 1;
    else
        return n * potR(v-1, n);
}

int atribuir(char c){
    int valor = 0;
    printf(" Valor de %c: ", c);
    scanf("%d", &valor);
    return valor;
}

void msg(void){
    for(int l=1;l<=27;l++)
        printf("-");
}
