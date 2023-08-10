#include <stdio.h>
#include <limits.h>
#include <stdint.h>

#include <math.h>
#include <ctype.h>
#include <windows.h>

#define myPI 3.14159265358979323846

int main(void)
{

    //*************************** NUMBERS ***************************

    /* Funções Numéricas
     *
     * Variações:
     * name_function_f() -> float
     * name_function() -> double
     * name_function_l() -> long double
     *
     * Define value PI:
     *
     * acos(0) = cos^-1(0) = π/2 rad = 90º = 1,5707...
     * PI = 2 * acos(0)
     *
     * const double PI = 2 * acos(0.0); ou M_PI (constante interna)
     *
     * ************************************
     * abs(int) -> int
     * labs(long) -> long
     * fabs(double) -> double
     * ceil(double) -> double
     * floor(double) -> double
     * sqrt(double) -> double
     * pow(double, double) -> double
     * fmod(double, double) -> double
     * sin(double) -> double
     * cos(double) -> double
     * tan(double) -> double
     * log(double) -> double
     * log10(double) -> double
     * ************************************
     *
     * abs(X) -> Valor absoluto de X
     * labs(X) -> Valor absoluto de X (long)
     * fabs(X) -> Valor absoluto de X (double)
     * ceil(X) -> Arredondamento para cima de X
     * floor(X) -> Arredondamento para baixo de X
     * sqrt(X) -> Raiz quadrada de X
     * pow(X, Y) -> Potência de X elevado a Y
     * fmod(X, Y) -> Modulo de X sobre Y (X % Y)
     * sin(X) -> Seno de X
     * cos(X) -> Cosseno de X
     * tan(X) -> Tangente de X
     * log(X) -> Logaritmo natural de X ou logaritmo de X na base de e (2.718281828)
     * log10(X) -> Logaritmo X na base 10
     */

    // printf("abs(-7) = %i \n", abs(-7));
    // printf("labs(-7L) = %li \n", labs(-7L));
    // printf("fabs(-7.8) = %#lg \n", fabs(-7.8));
    // printf("ceil(7.1) = %#lg \n", ceil(7.1));
    // printf("floor(7.1) = %#lg \n", floor(7.1));
    // printf("sqrt(4) = %#lg \n", sqrt(4.0));
    // printf("pow(4, 2) = %#lg \n", pow(4.0, 2.0));
    // printf("fmod(5, 2) = %#lg \n", fmod(5.0, 2.0));
    // printf("sin(0) = %#lg \n", sin(myPI));
    // printf("cos(0) = %#lg \n", cos(myPI));
    // printf("tan(0) = %#lg \n", tan(myPI));
    // printf("ln(5) = %#lg \n", log(5.0));
    // printf("log(5) = %#lg \n", log10l(5.0));

    // int A = 5;
    // int B = 2;

    // printf("%d + %d = %d\n", A, B, (A + B));
    // printf("%d - %d = %d\n", A, B, (A - B));
    // printf("%d * %d = %d\n", A, B, (A * B));
    // printf("%d / %d = %d\n", A, B, (A / B));
    // printf("%d / %d = %f\n", A, B, ((float)A / B));
    // printf("%d %% %d = %d\n", A, B, (A % B));

    //*************************** CHARACTERS ***************************

    // char characters[] = {'a', 'A', '4', '_', '#', '\t'};
    // int8_t length = (int8_t)sizeof(characters) / sizeof(char);

    /* Funções Para Caracteres
     *
     * Retornos: (Muda para algumas funções)
     * 0 Condição False
     * 1 Minúsculas
     * 2 Minúsculas
     * 4 Números
     * 8 Controls e Espaçamentos
     * 16 Pontuações
     * 32 Controls
     * 64 Espaçamentos
     * 128 Hexadecimais
     *
     * retorno != 0 : TRUE (retorno > 0)
     * retorno == 0 : FALSE
     *
     * ************************************
     * isdigit(int) -> int
     * isalpha(int) -> int
     * isalnum(int) -> int
     * ispunct(int) -> int
     * isgraph(int) -> int
     * isspace(int) -> int
     * iscntrl(int) -> int
     * isxdigit(int) -> int
     * islower(int) -> int
     * isupper(int) -> int
     * isprint(int) -> int
     * isascii(int) -> int
     * toupper(int) -> int
     * tolower(int) -> int
     * toascii(int) -> int
     * ************************************
     *
     * isdigit(C) -> Verifica se C é um número (1 ao 9)
     * isalpha(C) -> Verifica se C é uma letra (A ao Z e a ao z)
     * isalnum(C) -> Verifica se C é uma letra ou número
     * ispunct(C) -> Verifica se C é um caractere de pontuação (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)
     * isgraph(C) -> Verifica se C é um gráfico (número, letra, pontuações. O espaçamento em branco não é gráfico)
     * isspace(C) -> Verifica se C é um caractere de control (\n, \t, \v, \f, \r) ou espaçamento em branco ( )
     * iscntrl(C) -> Verifica se C é um caractere de control, desconsiderando o espaçamento em branco ( )
     * isxdigit(C) -> Verifica se C é um número do sistema hexadecimal (1 ao 9, A ao F ou a ao f)
     * islower(C) -> Verifica se C é um caractere minúsculo
     * isupper(C) -> Verifica se C é um caractere maiúsculo
     * isprint(C) -> Verifica se C é um imprimível, igual ao isgraph() com considerando o espaçamento
     * isascii(C) -> Verifica se C é um caractere da tabela ASCII (0 ao 127)
     * toupper(C) -> Converte um caractere para maiúscula
     * tolower(C) -> Converte um caractere para minúscula
     * toascii(C) -> Converte um valor para ASCII
     *
     */

    // int i = -1;
    // while (++i < UCHAR_MAX)
    //     if (isgraph(i))
    //         printf("%c ", (char)i);

    // puts("\n----------------------------------------------");
    // i = -1;
    // while (++i < UCHAR_MAX)
    //     if (isprint(i))
    //         printf("%c ", (char)i);

    // ********* uint16_t i = 0;

    // puts("================================ isDigit");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d: %c\n", isdigit(i), (char)i);
    // }
    // * 0 Maiúsculas, Minúsculas, Espaçamentos, Controles, Especiais, Pontuações
    // * 1 Números

    // puts("================================ isAlpha");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d: %c\n", isalpha(i), (char)i);
    // }
    //* 0 Números, Espaçamentos, Controles, Especiais, Pontuações
    //* 1 Maiúsculas
    //* 2 Minúsculas

    // puts("================================ isAlNum");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d: %c\n", isalnum(i), (char)i);
    // }
    //* 0 Espaçamentos, Controles, Especiais, Pontuações
    //* 1 Maiúsculas
    //* 2 Minúsculas
    //* 4 Números

    // puts("================================ isPunct");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d: %c\n", ispunct(i), (char)i);
    // }
    // * 0 Números, Maiúsculas, Minúsculas, Espaçamentos, Controles, Especiais
    // * 16 Pontuações

    // puts("================================ isGraph");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d: %c\n", isgraph(i), (char)i);
    // }
    //* 0 Espaçamentos, Especiais
    //* 1 Maiúsculas
    //* 2 Minúsculas
    //* 4 Números
    //* 16 Pontuações

    // puts("================================ isSpace");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d) %d: %c\n", i, isspace(i), (char)i);
    // }
    // * 0 Números, Maiúsculas, Minúsculas, Especiais, Pontuações
    // * 8 Espaçamentos: {' '} Controles: {\t, \n, \r, \f, \v}

    // puts("================================ isCntrl");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d) %d: %c\n", i, iscntrl(i), (char)i);
    // }
    // * 0 Números, Maiúsculas, Minúsculas, Especiais, Pontuações
    // * 32 Controles: {\t, \n, \r, \f, \v}

    // for (int8_t j = 0; j < UCHAR_MAX; j++)
    //     if (isspace(j) && !iscntrl(j))
    //         printf("Character %d is space and not control escape", j); // -> Apenas espaços
    // * 0 Números, Maiúsculas, Minúsculas, Especiais, Pontuações
    // * 128 Números, Maiúsculas: {A, B, C, D, E, F}, Minúsculas: {a, b, c, d, e, f}

    // puts("================================ isUpper");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d) %d: %c\n", i, isupper(i), (char)i);
    // }
    //* 0 Números, Minúsculas, Espaçamentos, Controles, Especiais, Pontuações
    //* 1 Maiúsculas

    // puts("================================ isLower");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d) %d: %c\n", i, islower(i), (char)i);
    // }
    //* 0 Números, Maiúsculas, Espaçamentos, Controles, Especiais, Pontuações
    //* 2 Minúsculas

    // puts("================================ isPrint");
    // i = -1;
    // while (++i < UCHAR_MAX)
    // {
    //     printf("%d) %d: %c\n", i, isprint(i), (char)i);
    // }
    //* 0 Controles, Especiais
    //* 1 Minúsculas
    //* 2 Minúsculas
    //* 4 Números
    //* 16 Pontuações
    //* 64 Espaçamentos

    // puts("================================ isAscii");
    // i = -1;
    // while (++i < UCHAR_MAX + 0x1B7)
    // {
    //     printf("%d) %d: %c\n", i, isascii(i), (char)i);
    //     printf("%d) -> %d: %c\n", i, toascii(i), (char)i);
    // }

    /*
     * 127 & 'a'
     * (01111111) & (01100001) -> (01100001)
     *
     * 127 & 571
     * (01111111) & 0010.(00111011) -> ()
     *
     * 1111111
     * 00111011
     * 00111011 -> 59 -> Table ASCII -> ;
     */

    //*************************** BOOLEANS ***************************

    /*
     * 1 == True = TRUE
     * 0 = False = FALSE
     */

    BOOL T = TRUE;
    BOOL F = FALSE;

    puts("====================> TYPE BOOLEAN");
    printf("TRUE = %i\n", T);
    printf("FALSE = %i\n", F);

    puts("====================> Operador !");
    printf("!TRUE = %i\n", !TRUE);
    printf("!FALSE = %i\n", !FALSE);

    puts("====================> Operador &&");
    printf("TRUE && TRUE = %i\n", TRUE && TRUE);
    printf("TRUE && FALSE = %i\n", TRUE && FALSE);
    printf("FALSE && TRUE = %i\n", FALSE && TRUE);
    printf("FALSE && FALSE = %i\n", FALSE && FALSE);

    puts("====================> Operador ||");
    printf("TRUE || TRUE = %i\n", TRUE || TRUE);
    printf("TRUE || FALSE = %i\n", TRUE || FALSE);
    printf("FALSE || TRUE = %i\n", FALSE || TRUE);
    printf("FALSE || FALSE = %i\n", FALSE || FALSE);

    return 0;
}
