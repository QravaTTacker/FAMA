import time
import cowsay

cowsay.cow('Aqui podemos mostrar a sequência de Fibonacci')
clr, red, green, yel = '\033[m', '\033[31m', '\033[32m', '\033[33m'


def triangulo(linhas, recursivo):
    print(f'{green}' if recursivo else f'{yel}', end='')
    print(' ' * 5, end='')
    j = 0
    while j <= linhas:
        print(' $ ', end='')
        j += 1
    print(f'{clr}')


def erro(msg):
    print('-' * 31)
    print(f'| {red}{f" {msg.upper()} ":_^58}{clr} |')
    print('=' * 62 + '\n\n')
    time.sleep(1)


def fibo_recursivo(t):
    if t <= 1:
        return t
    return fibo_recursivo(t-1) + fibo_recursivo(t-2)


def fibo_normal(t, ambos):
    t1, t2, t3 = 0, 1, 0
    for cont in range(t):
        print(f'|{cont + 1:3}{"º termo ->":8}{yel}{t2:10}{clr}', end='')
        t3 = t1 + t2
        t1, t2 = t2, t3
        if ambos:
            print(f'      ||     ', end='')
            print(f'{cont + 1:3}{"º termo ->":8}{green}{fibo_recursivo(cont + 1):10}{clr} |')
        else:
            triangulo(cont, False)


def menu():
    print('=' * 62)
    print(f'| {f"Fibonacci {yel}Iterativo{clr}..............................[{yel}1{clr}]":^74} |')
    print(f'| {f"Fibonacci {green}Recursivo{clr}..............................[{green}2{clr}]":^74} |')
    print(f'| {f"Fibonacci {red}Ambos{clr}..................................[{red}3{clr}]":^74} |')
    print('=' * 62)


while True:
    try:
        menu()
        opc = int(input('| Opção >>> '))
        if not(1 <= opc <= 3):
            erro('opção inválido')
            continue
        print('-' * 31)
        n_termos = int(input('| Número de termos >>> '))
        if n_termos > 0:
            print('=' * 62)
            if opc == 1:
                fibo_normal(n_termos, False)
            elif opc == 2:
                for i in range(n_termos):
                    print(f'|{i+1:3}{"º termo ->":8}{green}{fibo_recursivo(i+1):10}{clr}', end='')
                    triangulo(i, True)
            else:
                fibo_normal(n_termos, True)
        else:
            erro('número de termos inválido')
            continue
    except ValueError:
        erro('valor inválido')
        continue
    print('=' * 62)
    resp = str(input('| Para? [s/n] ')).strip().lower()
    if resp == 's' or resp == 'si' or resp == 'sim':
        print('=' * 62)
        print(f'| {red}{"Parando Aplicação":^58}{clr} |')
        print('=' * 62)
        time.sleep(1.5)
        break
