#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

void binario(int x);
int absNum(int y);

int main(){
    setlocale(LC_ALL, "portuguese");
    char resp;
    do{
        int n = 0;
        textcolor(GREEN);
        printf(" n = ");
        scanf("%d", &n);
        if(n <= 0)
            n = absNum(n);
        printf("\n\n %d em binário: ", n);
        binario(n);
        //system("calc");
        textcolor(GREEN);
        printf("\n\n______________\n");
        printf(" Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp != 's');
    textcolor(WHITE);
    return 0;
}

void binario(int x){
    textcolor(RED);
    if(x == 1)
        printf("%d", x);
    else{
        binario(x/2);
        printf("%d", x%2);
    }

}

int absNum(int y){
    return y * (-1);
}
