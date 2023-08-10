#include <stdio.h>
#include <stdlib.h>

int main(){

    for(int a=0, b=10; a<=10; a++, b--){
        printf("%.2i || %.2i\n", a, b);
    }

    printf("\n\n");

    for(int a=0, b=10; a<=10; a++, b--){
        printf("%.2i - %.2i = %i\n", a, b, (a-b));
    }

    return 0;
}
