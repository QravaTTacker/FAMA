#include <stdio.h>
#include <locale.h>

void automatica();
void estatica();
int Fibonacci();

int main(void){

    setlocale(LC_ALL, "portuguese");
    /*
    printf(" Automática: \n");
    automatica();
    automatica();
    automatica();

    printf("\n Estática: \n");
    estatica();
    estatica();
    estatica();
    */
    for(int i = 1; i <= 8; i++)
        printf(" %d ", Fibonacci());

    return 0;
}

void automatica(void){
    int x = 2;
    x *= 2;
    printf(" x = %d\n", x);
}

void estatica(void){
    static int x = 2;
    x *= 2;
    printf(" x = %d\n", x);
}

int Fibonacci(void){
    static int a = 0, b = 1, f = 0;
    f = a + b;
    a = b;
    b = f;
    return f;
}
