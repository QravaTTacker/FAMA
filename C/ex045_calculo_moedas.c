#include <stdio.h>
#include <stdlib.h>
int main(){

    int C100, C50, C20, C10, C5, C2, M1, M50, M25, M10, M05, M01;
    int C;
    double Din, SuporDOU;
    scanf("%lf", &Din);

    C = Din;

    C100 = C/100;
    C = C%100;
    C50 = C/50;
    C %= 50;
    C20 = C/20;
    C %= 20;
    C10 = C/10;
    C %= 10;
    C5 = C/5;
    C %= 5;
    C2 = C/2;
    M1 = C%2;

    SuporDOU = Din*100;
    C = (int)SuporDOU;
    C %= 100;

    M50 = C/50;
    C %= 50;
    M25 = C/25;
    C %= 25;
    M10 = C/10;
    C %= 10;
    M05 = C/5;
    M01 = C%5;

    printf("NOTAS:\n");
    printf("%d nota(s) de R$ 100.00\n", C100);
    printf("%d nota(s) de R$ 50.00\n", C50);
    printf("%d nota(s) de R$ 20.00\n", C20);
    printf("%d nota(s) de R$ 10.00\n", C10);
    printf("%d nota(s) de R$ 5.00\n", C5);
    printf("%d nota(s) de R$ 2.00\n", C2);
    printf("MOEDAS:\n");
    printf("%d moeda(s) de R$ 1.00\n", M1);
    printf("%d moeda(s) de R$ 0.50\n", M50);
    printf("%d moeda(s) de R$ 0.25\n", M25);
    printf("%d moeda(s) de R$ 0.10\n", M10);
    printf("%d moeda(s) de R$ 0.05\n", M05);
    printf("%d moeda(s) de R$ 0.01\n", M01);

    return 0;
}
