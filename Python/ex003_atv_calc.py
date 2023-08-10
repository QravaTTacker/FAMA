from os import system
from math import factorial
from time import sleep
system('cls')
# system('calc')
black = str('\033[1;30m')
red = str('\033[0;31m')
green = str('\033[0;32m')
sem = str('\033[m')
while True:
    print(f'{black}' + '='*26)
    print('''| Adição.............[1] |
| Subtração..........[2] |
| Multiplicação......[3] |
| Divisão Real.......[4] |
| Divisão Inteira....[5] |
| Módulo.............[6] |
| Potência...........[7] |
| Raiz...............[8] |
| Fatorial...........[9] |''')
    print(f'| {red}Exit..............[10]{black} |\n' + '='*26)
    op = str(input(f'\n {sem}Opção >>> ')).lower().strip()
    print(f'\n{black}'+'-'*26)
    if op == '1' or op == 'soma' or op == 'adição' or op == 'adicao' or op == '+':
        print(f'{"x + y":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        print(f'|\n| {x:,.2f} + {y:,.2f} = {green}{x+y:,.2f}{black}\n|')
    elif op == '2' or op == 'menos' or op == 'subtração' or op == 'subtracao' or op == '-':
        print(f'{"x - y":^26}\n{"y - x":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        print(f'|\n| {x:,.2f} - {y:,.2f} = {green}{x-y:,.2f}{black}')
        print(f'| {y:,.2f} - {x:,.2f} = {green}{y-x:,.2f}{black}\n|')
    elif op == '3' or op == 'vezes' or op == 'multiplicação' or op == 'multiplicacao' or op == '*':
        print(f'{"x * y":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        print(f'|\n| {x:,.2f} * {y:,.2f} = {green}{x*y:,.2f}{black}\n|')
    elif op == '4' or op == 'divisão' or op == 'divisao' or op == '/' or op == 'div':
        print(f'{"x / y":^26}\n{"y / x":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        if y != 0 and x != 0:
            print(f'|\n| {x:,.2f} / {y:,.2f} = {green}{x/y:,.2f}{black}')
            print(f'| {y:,.2f} / {x:,.2f} = {green}{y/x:,.2f}{black}\n|')
        elif y == 0 and x != 0:
            print(f'|\n| {x:,.2f} / {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} / {x:,.2f} = {green}{y/x:,.2f}{black}\n|')
        elif y != 0 and x == 0:
            print(f'|\n| {x:,.2f} / {y:,.2f} = {green}{x/y:,.2f}{black}')
            print(f'| {y:,.2f} / {x:,.2f} = {red}Erro :/{black}\n|')
        else:
            print(f'|\n| {x:,.2f} / {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} / {x:,.2f} = {red}Erro :/{black}\n|')
    elif op == '5' or op == 'divisão int' or op == 'divisao int' or op == 'divisão inteira' or op == 'divisao inteira' or op == '//' or op == 'div int': 
        print(f'{"x // y":^26}\n{"y // x":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        if y != 0 and x != 0:
            print(f'|\n| {x:,.2f} // {y:,.2f} = {green}{int(x//y):,}{black}')
            print(f'| {y:,.2f} // {x:,.2f} = {green}{int(y//x):,}{black}\n|')
        elif y == 0 and x != 0:
            print(f'|\n| {x:,.2f} // {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} // {x:,.2f} = {green}{int(y//x):,}{black}\n|')
        elif y != 0 and x == 0:
            print(f'|\n| {x:,.2f} // {y:,.2f} = {green}{int(x//y):,}{black}')
            print(f'| {y:,.2f} // {x:,.2f} = {red}Erro :/{black}\n|')
        else:
            print(f'|\n| {x:,.2f} // {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} // {x:,.2f} = {red}Erro :/{black}\n|')
    elif op == '6' or op == 'resto' or op == 'módulo' or op == 'modulo' or op == '%' or op == 'mod':
        print(f'{"x % y":^26}\n{"y % x":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        if y != 0 and x != 0:
            print(f'|\n| {x:,.2f} % {y:,.2f} = {green}{int(x%y):,}{black}')
            print(f'| {y:,.2f} % {x:,.2f} = {green}{int(y%x):,}{black}\n|')
        elif y == 0 and x != 0:
            print(f'|\n| {x:,.2f} % {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} % {x:,.2f} = {green}{int(y%x):,}{black}\n|')
        elif y != 0 and x == 0:
            print(f'|\n| {x:,.2f} % {y:,.2f} = {green}{int(x%y):,}{black}')
            print(f'| {y:,.2f} % {x:,.2f} = {red}Erro :/{black}\n|')
        else:
            print(f'|\n| {x:,.2f} % {y:,.2f} = {red}Erro :/{black}')
            print(f'| {y:,.2f} % {x:,.2f} = {red}Erro :/{black}\n|')
    elif op == '7' or op == 'potência' or op == 'potencia' or op == 'pot' or op == 'pow' or op == '**' or op == '^':
        print(f'{"x ^ y":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        y = float(input('| y = '))
        print(f'|\n| {x:,.2f} ^ {y:,.2f} = {green}{x**y:,.2f}{black}\n|')
    elif op == '8' or op == 'raiz' or op == 'sqrt':
        print(f'{" Raiz de x ":^26}\n' + '-'*26 + '\n|')
        x = float(input('| x = '))
        if x >= 0:
            print(f'|\n| {x:,.2f} ^ (0.5) = {green}{x**(0.5):,.2f}{black}\n|')
        else:
            print(f'|\n| {x:,.2f} ^ (0.5) = {red}Erro :/{black}\n|')
    elif op == '9' or op == '!' or op == 'fatorial' or op == 'fat':
        print(f'{" x! ":^26}\n' + '-'*26 + '\n')
        x = int(input('| x = '))
        if x >= 0:
            print(f'|\n| {x:,}! = {green}{factorial(x):,}{black}\n|')
        else:
            print(f'|\n| {x:,}! = {red}Erro :/{black}\n|')
    elif op == '10' or op == 'yes':
        print(f'{"Saindo...":^27}\n' + '-'*26 + '\n')
        sleep(1.5)
        system('cls')
        break
    else:
        print(f'{"Falso :/":^26}')
    print('-'*26)
    resp = str(input(f' Para? [{green}sim{black}/{red}não{black}] ')).lower().strip()
    if resp == 'sim' or resp == 'si' or resp == 's' or resp == '10' or resp == 'yes':
        print(f'\n{"Parando...":^26}\n' + '-'*26)
        sleep(1.5)
        system('cls')
        break
    system('cls')
