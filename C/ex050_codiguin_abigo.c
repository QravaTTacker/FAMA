#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int main(){

    setlocale(LC_ALL, "");

    float investimento=0, total, rendimento=0;

    int op=1, contador,meses=0;

    do{
        printf("\n1. Poupan�a.");
        printf("\n2. Poupan�a plus.");
        printf("\n3. Fundo de renda.");
        printf("\n4. Sair.");
        printf("\nSelecione o tipo de investimento:\n\n");
        scanf("%i", &op);

        if (op==1){

            printf("\nSelecionado 1. Poupanca.\nDigite o valor do investimento:");

            while (investimento <=0){
                scanf("%f", &investimento);
                if(investimento <=0)printf("Investimento Inv�lido. Digite Novamente:");
            }

            total = investimento;
            printf("\nDigite o numero de meses:");

            while (meses <=0){

                scanf("%i", &meses);

                if(meses <=0)printf("Meses Inv�lido. Digite Novamente:");

            }

            for(contador = 1; contador <= meses; contador++)total = total * 1.00797415;

            rendimento = total - investimento;

            printf("\nRendimento de R$%.2f aplicado por %i meses: R$%.2f\n\n\n", investimento, meses, rendimento);

        }



        if (op==2){

            printf("\nSelecionado 2. Poupanca plus.\nDigite o valor do investimento:");

            while (investimento <=0){

                scanf("%f", &investimento);

                if(investimento <=0)printf("Investimento Inv�lido. Digite Novamente:");

            }

            total = investimento;

            printf("\nDigite o numero de meses:");

            while (meses <=0){

                scanf("%i", &meses);

                if(meses <=0)printf("Meses Inv�lido. Digite Novamente:");

            }

            for(contador = 1; contador <= meses; contador++)total = total * 1.0125095;

            rendimento = total - investimento;

            printf("\nRendimento de R$%.2f aplicado por %i meses: R$%f\n\n\n", investimento, meses, rendimento);

        }



        if (op==3){

            printf("\nSelecionado 3. Fundos de renda.\nDigite o valor do investimento:");

            while (investimento <=0){

                scanf("%f", &investimento);

                if(investimento <=0)printf("Investimento Inv�lido. Digite Novamente:");

            }

            total = investimento;

            printf("\nDigite o numero de meses:");

            while (meses <=0){

                scanf("%i", &meses);

                if(meses <=0)printf("Meses Inv�lido. Digite Novamente:");

            }

            for(contador = 1; contador <= meses; contador++)total = total * 1.0105511;

            rendimento = total - investimento;

            printf("\nRendimento de R$%.2f aplicado por %i meses: R$%f\n\n\n", investimento, meses, rendimento);

        }



    } while( op == 1 || op == 2 || op == 3);

    if (op==4)printf("Voc� saiu com sucesso");else printf("Opera��o inv�lida, reinicie o programa");

}
