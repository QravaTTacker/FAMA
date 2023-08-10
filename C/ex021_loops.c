#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "portuguese");
    system("color 2");

    printf("\n-------------------------------------------\n\n");

    for(int l=1;l<=3;l++){
        for(int c=1;c<=l;c++){
            printf("# ");
        }
        printf("\n");
    }

    printf("\n-------------------------------------------\n\n");

    for(int l=1;l<=3;l++){
        for(int c=l;c<=3;c++){
            printf("# ");
        }
        printf("\n");
    }

    printf("\n-------------------------------------------\n\n");

    for(int l=1;l<=3;l++){
        for(int c=1;c<=3;c++){
            if((c==2) && (l==2)){
                printf("  ");
            }else{
                printf("# ");
            }
        }
        printf("\n");
    }

    printf("\n-------------------------------------------\n\n");

    int n = 0;
    printf("Informe o número de linhas: ");
    scanf("%i", &n);
    printf("\n");

    for(int l=1;l<=n;l++){
        for(int c=1;c<=n;c++){
            if((c!=1)&&(l!=1)&&(c!=n)&&(l!=n)){
                printf("  ");
            }else{
                printf("# ");
            }
        }
        printf("\n");
    }

    printf("\n-------------------------------------------\n\n");

    return 0;
}
