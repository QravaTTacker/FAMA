#include <stdio.h>
#include <locale.h>
#include <math.h>

double gravidade = 10.0; //9.80665 Vari�vel global

double Vqueda(); //Prot�tipo = Declara��o da fun��o
void EPG(); //Prot�tipo = Declara��o da fun��o

int main(void){
    setlocale(LC_ALL, "portuguese");
    double altura = 0.0;
    printf(" Informe a altura (m): ");
    scanf("%lf", &altura);
    printf(" Velocidade de queda: %.2lf m/s\n\n", Vqueda(altura));
    EPG(Vqueda(altura));
    return 0;
}

double Vqueda(double h){ //Defini��o da fun��o = Informar o que ela faz...
    //Calcula a velocidade de queda livre
    //v� = 2gh
    return sqrt(2*gravidade*h);
}

void EPG(double varV){ //Defini��o da fun��o = Informar o que ela faz...
    //Calcula a energia potencial gravitacional
    //Eg = mgh
    //v�/2g = h --> h = (pow(varV,2)/(2*gravidade))
    double massa = 0.0;
    printf(" Informe a massa do corpo (kg): ");
    scanf("%lf", &massa);
    printf(" Energia potencial gravitacional: %.2lf kJ\n", (massa*gravidade*(pow(varV,2)/(2*gravidade)))/1000);
}


