#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "PORTUGUESE");
    system("color 2");

    float massa = 0.0;
    int time = 0, seg = 0, min = 0, hora = 0;
    int seg2 = 0, min2 = 0, hora2 = 0;

    printf("_________________________________________________________\n\n");
    printf("Informe a massa do produto (em gramas): ");
    scanf("%f", &massa);
    printf("\n---------------------------------------------------");

    while (massa >= 0.5){
        massa /= 2;
        time += 50;
    }

    hora = time/3600;
    min = (time - (hora * 3600))/60;
    seg = time - (min * 60) - (hora * 3600);

    printf("\nTempo para massa ser menor ou igual a 0.5 gramas:\n\n\t %i horas, %i minutos e %i segundos\n", hora, min, seg);
    printf("---------------------------------------------------\n");
    printf("_________________________________________________________\n\n");

    hora2 = time/3600;
    min2 = (time/60)%60;
    seg2 = time%60;

    printf("\nTempo para massa ser menor ou igual a 0.5 gramas:\n\n\t %i horas, %i minutos e %i segundos\n", hora2, min2, seg2);
    printf("---------------------------------------------------\n");
    printf("_________________________________________________________\n\n");

    return 0;
}
