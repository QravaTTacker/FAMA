#include <stdio.h>
#include <locale.h>
#include <math.h>

double gravidade = 10.0; //9.80665 Variável global

double Vqueda(); //Protótipo = Declaração da função
void EPG(); //Protótipo = Declaração da função

int main(void){
    setlocale(LC_ALL, "portuguese");
    double altura = 0.0;
    printf(" Informe a altura (m): ");
    scanf("%lf", &altura);
    printf(" Velocidade de queda: %.2lf m/s\n\n", Vqueda(altura));
    EPG(Vqueda(altura));
    return 0;
}

double Vqueda(double h){ //Definição da função = Informar o que ela faz...
    //Calcula a velocidade de queda livre
    //v² = 2gh
    return sqrt(2*gravidade*h);
}

void EPG(double varV){ //Definição da função = Informar o que ela faz...
    //Calcula a energia potencial gravitacional
    //Eg = mgh
    //v²/2g = h --> h = (pow(varV,2)/(2*gravidade))
    double massa = 0.0;
    printf(" Informe a massa do corpo (kg): ");
    scanf("%lf", &massa);
    printf(" Energia potencial gravitacional: %.2lf kJ\n", (massa*gravidade*(pow(varV,2)/(2*gravidade)))/1000);
}


