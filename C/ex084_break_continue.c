#include <stdio.h>
#include <stdlib.h>

int main(){

    // break -> Finaliza o processo condicional
    // Continue -> Finaliza um processo em particular

    for(int i=1;i<=10;i++){
        if(i == 5){
            printf(" X \n");
            continue;
        }
        printf(" %d \n", i);
    }
    return 0;
}
