#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    char resp;
    int n, pot=1, i=0, fdp=0;
    printf("Informe um valor: ");
    scanf("%d", &n);
    do{
        if(i==0){
            printf("\n\t%d^0 = %d\n", n, pot);
            printf("\nDeseja continuar a potência? [s/n] ");
            scanf("%s", &resp);
        }else{
            pot*=n;
            printf("\n\t%d^%d = %d\n", n, i, pot);
            printf("\nDeseja continuar a potência? [s/n] ");
            scanf("%s", &resp);
        }
        i++;
    }while(resp != 'n');
    return 0;
}
