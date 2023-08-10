#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{

    // Cálculo de consumo

    setlocale(LC_ALL, "portuguese");
    system("color 2");

    float km1 = 0, km2 = 0, km3 = 0, km4 = 0;
    float litro1 = 0, litro2 = 0, litro3 = 0, litro4 = 0;
    float kml1 = 0, kml2 = 0, kml3 = 0, kml4 = 0;
    float med = 0;
    int r = 0;

    printf("\n---------- Opções de Registo ----------\n\n");

    printf(" Digite (1) para um único registo.\n");
    printf(" Digite (2) para dois registros.\n");
    printf(" Digite (3) para três registos.\n");
    printf(" Digite (4) para quatro registros.\n");

    printf("\n----------------------------------------\n");

    printf("\nQuantos registos deseja? ");
    scanf("%i", &r);

    if (r == 1)
    {
        printf("\n----------------------------------------\n"); // Op��o 1

        printf("\nQuilometragem (km): ");
        scanf("%f", &km1);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro1);

        if ((litro1 > 0) && (km1 > 0))
        {
            kml1 = km1 / litro1;
            printf("Relação: %.2f km/L\n", kml1);
        }
        else
        {
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n----------------------------------------\n");
    }
    else if (r == 2)
    {

        printf("\n----------------------------------------\n"); // Op��o 2

        printf("\n\tPRIMEIRO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km1);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro1);

        if ((litro1 > 0) && (km1 > 0))
        {
            kml1 = km1 / litro1;
            printf("Relação: %.2f km/L\n", kml1);
        }
        else
        {
            kml1 = -1;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tSEGUNDO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km2);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro2);

        if ((litro2 > 0) && (km2 > 0))
        {

            kml2 = km2 / litro2;
            printf("Relação: %.2f km/L\n", kml2);
        }
        else
        {
            kml2 = -1;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n----------------------------\n");

        if ((kml1 > 0) && (kml2 > 0))
        {
            med = (kml1 + kml2) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if ((kml1 > 0) && (kml2 == -1))
        {
            med = (kml1) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if ((kml1 == -1) && (kml2 > 0))
        {
            med = (kml2) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else
        {
            printf("\nMÉDIA DE RELAÇÕES: Impossível realizar o cálculo!\n");
        }

        printf("\n----------------------------------------\n");
    }
    else if (r == 3)
    {

        printf("\n----------------------------------------\n"); // Op��o 3

        printf("\n\tPRIMEIRO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km1);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro1);

        if ((litro1 > 0) && (km1 > 0))
        {
            kml1 = km1 / litro1;
            printf("Relação: %.2f km/L\n", kml1);
        }
        else
        {
            kml1 = 0;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tSEGUNDO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km2);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro2);

        if ((litro2 > 0) && (km2 > 0))
        {
            kml2 = km2 / litro2;
            printf("Relação: %.2f km/L\n", kml2);
        }
        else
        {
            kml2 = 0;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tTERCEIRO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km3);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro3);

        if ((litro3 > 0) && (km3 > 0))
        {
            kml3 = km3 / litro3;
            printf("Relação: %.2f km/L\n", kml3);
        }
        else
        {
            kml3 = 0;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n----------------------------\n");

        if ((kml1 > 0) && (kml2 > 0) && (kml3 > 0))
        {
            med = (kml1 + kml2 + kml3) / 3;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((km1 == 0) && (kml2 > 0) && (kml3 > 0)))
        {
            med = (kml2 + kml3) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 > 0)))
        {
            med = (kml1 + kml3) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 > 0) && (kml3 == 0)))
        {
            med = (kml1 + kml2) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 == 0)))
        {
            med = (kml1) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 > 0) && (kml3 == 0)))
        {
            med = (kml2) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 == 0) && (kml3 > 0)))
        {
            med = (kml3) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else
        {
            printf("\nMÉDIA DE RELAÇÕES: Impossível realizar o cálculo!\n");
        }

        printf("\n----------------------------------------\n");
    }
    else if (r == 4)
    {

        printf("\n----------------------------------------\n"); // Op��o 4

        printf("\n\tPRIMEIRO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km1);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro1);

        if ((litro1 > 0) && (km1 > 0))
        {
            kml1 = km1 / litro1;
            printf("Relação: %.2f km/L\n", kml1);
        }
        else
        {
            kml1 = 0;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tSEGUNDO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km2);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro2);

        if ((litro2 > 0) && (km2 > 0))
        {
            kml2 = km2 / litro2;
            printf("Relação: %.2f km/L\n", kml2);
        }
        else
        {
            kml2 = 0;
            printf("Relação: Impossível realizar o cálculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tTERCEIRO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km3);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro3);

        if ((litro3 > 0) && (km3 > 0))
        {
            kml3 = km3 / litro3;
            printf("Relação: %.2f km/L\n", kml3);
        }
        else
        {
            kml3 = 0;
            printf("Relação: Impossível realizar o calculo! (motivo: informe corretamente os valores)\n");
        }

        printf("\n\tQUARTO CASO");
        printf("\nQuilometragem (km): ");
        scanf("%f", &km4);
        printf("Consumo de gasolina (L): ");
        scanf("%f", &litro4);

        if ((litro4 > 0) && (km4 > 0))
        {
            kml4 = km4 / litro4;
            printf("Relação: %.2f km/L\n", kml4);
        }
        else
        {
            kml4 = 0;
            printf("Relação: Impossível realizar o calculo! (motivo: informe corretamente os valores)\n");
        }
        printf("\n----------------------------\n");

        if ((kml1 > 0) && (kml2 > 0) && (kml3 > 0) && (kml4 > 0))
        {
            med = (kml1 + kml2 + kml3 + kml4) / 4;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((km1 == 0) && (kml2 > 0) && (kml3 > 0) && (kml4 > 0)))
        {
            med = (kml2 + kml3 + kml4) / 3;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 > 0) && (kml4 > 0)))
        {
            med = (kml1 + kml3 + kml4) / 3;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 > 0) && (kml3 == 0) && (kml4 > 0)))
        {
            med = (kml1 + kml2 + kml4) / 3;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 > 0) && (kml3 > 0) && (kml4 == 0)))
        {
            med = (kml1 + kml2 + kml3) / 3;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 == 0) && (kml3 > 0) && (kml4 > 0)))
        {
            med = (kml3 + kml4) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 > 0) && (kml3 == 0) && (kml4 > 0)))
        {
            med = (kml2 + kml4) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 > 0) && (kml3 > 0) && (kml4 == 0)))
        {
            med = (kml2 + kml3) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 == 0) && (kml4 > 0)))
        {
            med = (kml1 + kml4) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 > 0) && (kml4 == 0)))
        {
            med = (kml1 + kml3) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 > 0) && (kml3 == 0) && (kml4 == 0)))
        {
            med = (kml1 + kml2) / 2;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 > 0) && (kml2 == 0) && (kml3 == 0) && (kml4 == 0)))
        {
            med = (kml1) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 > 0) && (kml3 == 0) && (kml4 == 0)))
        {
            med = (kml2) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 == 0) && (kml3 > 0) && (kml4 == 0)))
        {
            med = (kml3) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else if (((kml1 == 0) && (kml2 == 0) && (kml3 == 0) && (kml4 > 0)))
        {
            med = (kml4) / 1;
            printf("\nMÉDIA DE RELAÇÕES: %.2f km/L\n", med);
        }
        else
        {
            printf("\nMÉDIA DE RELAÇÕES: Impossível realizar o calculo!\n");
        }

        printf("\n----------------------------------------\n");
    }
    else if (r > 4)
    {
        printf("\n------------------------------------------------------------------------\n");
        printf("\nInfelizmente nosso sistema só suporta, no momento, quatro registros :/\n");
        printf("\n------------------------------------------------------------------------\n");
    }
    else
    {
        printf("\n----------------------------------------\n");
        printf("\n                 Falso                  \n");
        printf("\n----------------------------------------\n");
    }
    return 0;
}
