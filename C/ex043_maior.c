#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>
int main(){
    int x, y, w, Ma, Me, lim;
    printf(" X = ");
    scanf("%d", &x);
    printf(" Y = ");
    scanf("%d", &y);
    printf(" W = ");
    scanf("%d", &w);

    //Maior(xy) = ((x + y) + abs(x - y))/2;
    Ma = (x+y+abs(x-y))/2;
    Ma = (Ma+w+abs(Ma-w))/2;

    //Menor(xy) = ((x + y) - abs(x - y))/2;
    Me = (x+y-abs(x-y))/2;
    Me = (Me+w-abs(Me-w))/2;

    printf("\n Maior = %d", Ma);
    printf("\n Menor = %d\n", Me);

    printf("\n\n Lim: ");
    scanf("%d", &lim);
    clrscr();
    for(int i=1; i<=lim; i++){
        printf(" X = ");
        scanf("%d", &x);
        printf(" Y = ");
        scanf("%d", &y);
        printf("\n Maior: %d", (x+y+abs(x-y))/2);
        printf("\n Menor: %d\n\n", (x+y-abs(x-y))/2);
        printf(" Digite para continuar... ");
        getche();
        clrscr();
    }
    return 0;
}
