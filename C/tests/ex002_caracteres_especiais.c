#include <stdio.h>
#include <stdlib.h>

int main(){

    int cont = 10;
    while( --cont )
        printf("C2 cont = %d\n",cont);

    //cont-- : reduz depois; --cont : reduz antes.

    return 0;
}
