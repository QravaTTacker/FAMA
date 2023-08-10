#include <stdio.h>
int main(){
    double n1, n2, n3, n4, med, E;
    scanf("%lf %lf %lf %lf", &n1, &n2, &n3, &n4);
    med = (2*n1 + 3*n2 + 4*n3 + n4)/10;
    printf("Media: %.1f\n", med);
    if(med >= 7.0){
        printf("Aluno aprovado.\n");
    }else if (med >= 5.0){
        printf("Aluno em exame.\n");
        scanf("%lf", &E);
        printf("Nota do exame: %.f\n", E);
        if((E+med)/2.0 >= 5.0){
            printf("Aluno aprovado.\n");
        }else{
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1f\n", (E+med)/2.0);
    }else{
        printf("Aluno reprovado.\n");
    }
    return 0;
}
