#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void Ex01(void);
double km(double v, double t);
double consumo(double d);

void Ex02(void);
double montante(double c, double i, int t);

void Ex03(void);
void msg03(int a, int b);

void Ex04(void);
double pesoIdeal(double);

void msg(void);

////////////////////////////////////////////////////////////////////////////////

int main(){
    system("color 6");
    setlocale(LC_ALL, "portuguese");
    msg();
    Ex01();
    msg();
    Ex02();
    msg();
    Ex03();
    msg();
    Ex04();
    msg();
    return 0;
}

////////////////////////////////////////////////////////////////////////////////

void Ex01(void){
    double velocidade = 0.0, tempo = 0.0;
    printf(" Velocidade média (Km/h): ");
    scanf("%lf", &velocidade);
    printf(" Tempo (min): ");
    scanf("%lf", &tempo);
    printf(" Deslocamento: %.2lf Km\n", km(velocidade, tempo));
    printf(" Consumo: %.2lf L/Km\n", consumo(km(velocidade, tempo)));
}

double km(double v, double t){
    return v*(t/60);
}

double consumo(double d){
    return d/12;
}

////////////////////////////////////////////////////////////////////////////////

void Ex02(void){
    //M = C*pow((1+i), t);
    double reais = 0.0, taxa = 0.0;
    int tempo = 0;
    printf(" Depósito: ");
    scanf("%lf", &reais);
    printf(" Rendimento (%%): ");
    scanf("%lf", &taxa);
    printf(" Tempo (mês): ");
    scanf("%d", &tempo);
    printf(" Montante: R$ %.2lf \n", montante(reais, taxa, tempo));
}

double montante(double c, double i, int t){
    for(int k = 1; k <= t; k++)
        c += c*i/100;
    return c;
}

////////////////////////////////////////////////////////////////////////////////

void Ex03(void){
    int A = 40, B = -1;
    msg03(A, B);
    B++;
    printf("\n B++...\n\n");
    msg03(A, B);
}

void msg03(int a, int b){
    printf(" %d + %d = %d\n", a, b, a+b);
    printf(" %d - %d = %d\n", a, b, a-b);
    printf(" %d x %d = %d\n", a, b, a*b);
    if(b != 0)
        printf(" %d / %d = %d\n", a, b, a/b);
    else
        printf(" %d / %d = Indeterminação\n");
}

////////////////////////////////////////////////////////////////////////////////

void Ex04(void){
    double altura = 0.0;
    printf(" Altura: ");
    scanf("%lf", &altura);
    printf(" Peso ideal: %.2lf Kg\n", pesoIdeal(altura));
}

double pesoIdeal(double h){
    return (72.7*h)-58;
}

////////////////////////////////////////////////////////////////////////////////

void msg(void){
    printf("\n");
    for(int i = 1; i <= 30; i++)
        printf("=");
    printf("\n\n");
}

////////////////////////////////////////////////////////////////////////////////
