# Biblioteca usada para criar emojis.
from emoji import emojize

# Instrução para atribuir o código do emoji.
emoji1 = emojize(':space_invader:', language='alias')
# Códigos ANSI de cores.
red, pur, clr = '\033[31m', '\033[35m', '\033[m'


# Função responsável por mostrar a sequência de Fibonacci.
def fibo(termo):
    # Variáveis usadas.
    t1, t2 = 0, 1
    lista = [1]
    # Se o número de termos for positivo o programa irá executar a função.
    if termo >= 1:
        # O ciclo percorre até termo-1, em vez de todos (termo >= 1).
        while termo > 1:
            # Calculo do Fibonacci.
            fib = t1 + t2
            t1, t2 = t2, fib
            # Acumula cara resultado em uma lista.
            lista.append(fib)
            # Atribuição de subtração.
            termo -= 1
        # Variável de controle do ciclo 1.
        i = 0
        # Ciclo responsável por mostrar as linhas. Percorre até o número de elementos da lista.
        while i < len(lista):
            # Variável de controle do ciclo 2.
            j = 0
            # Ciclo responsável por indica as colunas.
            while j <= i:
                # Se ambas viráveis de controles forem iguais (diagonal) será mostrado o valor da sequência.
                if i == j:
                    # Mostra o valor da lista no índice j.
                    print(f' {pur}{lista[j]:>2}{clr}', end='')
                # Se não for a diagonal, o programa irá mostra um emoji.
                else:
                    print(f' {pur}{emoji1}{clr} ', end='')
                # Atribuição de adição do ciclo 2.
                j += 1
            # Pula a linha
            print()
            # Atribuição de adição do ciclo 1.
            i += 1
    # Indica que o número de termos foi nulo ou negativo, finalizando o programa.
    else:
        print(f'\n{red}Impossível{clr} formar a sequência\n')


# Programa principal.
print('=' * 20)
# Iteração infinita até que a entrada de dados seja preenchida corretamente.
while True:
    # Verifica se o valor informado é um inteiro.
    try:
        num = int(input('| Número termos: '))
        # Finaliza o ciclo while caso o dado esteja coreto.
        break
    except ValueError:
        # Mostra que a pessoa digitou uma str ou float.
        print('=' * 29)
        print(f'| {red}Informe um valor inteiro!{clr} |')
        print('=' * 29)
# Saída dos dados.
print('=' * 29)
fibo(num)
print('=' * 29)
