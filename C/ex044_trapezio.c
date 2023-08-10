#include <stdio.h>
int main() {
    float l1, l2, l3;
    scanf("%f %f %f", &l1, &l2, &l3);
    if(l1+l2>l3 && l2+l3>l1 && l1+l3>l2){
        printf("Perimetro = %.1f\n", l1+l2+l3);
    }else{
        printf("Area = %.1f\n", ((l1+l2)*l3)/2);
    }
    return 0;
}
