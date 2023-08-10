#include <stdio.h>
#include <locale.h>

int fat();

int main(void){
    setlocale(LC_ALL, "portuguese");
    int num = 0;
    printf(" Num = ");
    scanf("%d", &num);
    if(num >= 0)
        printf("\n %d! = %d \n", num, fat(num));
    else
        printf("\n Não há fatorial para valor negativo :/\n");
    return 0;
}

int fat(int x){
    int F = 0;
    if(x == 0){
        F = 1;
    }else{
        F = x * fat(x - 1);
    }
    return F;
}
