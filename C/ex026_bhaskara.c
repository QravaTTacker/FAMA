#include <stdio.h>
#include <math.h>
int main(){
    double a, b, c;
    printf("  ");
    scanf(" %lf", &a);
    printf("  ");
    scanf(" %lf", &b);
    printf("  ");
    scanf(" %lf", &c);
    if((a!=0)&&(pow(b,2)-(4*a*c))>=0){
        printf(" R1 = %.5lf\n", ((-b) + sqrt(pow(b,2)-(4*a*c)))/(2*a));
        printf(" R2 = %.5lf\n", ((-b) - sqrt(pow(b,2)-(4*a*c)))/(2*a));
    }else{
        printf(" Impossivel calcular\n");
    }
}
