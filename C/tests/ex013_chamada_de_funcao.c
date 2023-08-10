#include <stdio.h>
#include <locale.h>

double cubo();
double absnum();

int main(void){
    setlocale(LC_ALL, "portuguese");
    double valor = 0.0;
    printf(" Informe um valor: ");
    scanf("%lf", &valor);
    printf(" |(%.2lf)�| = %.2lf ", valor, cubo(valor));
    return 0;
}

double cubo(double x){
    if(x > 0){
        return (x*x*x);
    }else if(x < 0){
        x = absnum(x);
        return (x*x*x);
    }else{
        return 1.0;
    }
}

double absnum(double y){
    return y*(-1);
}
