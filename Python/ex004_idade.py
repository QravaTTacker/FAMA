from emoji import emojize
from os import system
from time import sleep

print('\033[32m', end='')
while True:
    sleep(2)
    # system('cls')
    try:
        idade = int(input(f'{emojize(":snake:")} Qual a sua idade? '))
        if idade < 1:
            print('Faixa etária: Idade inválida 😕')
            continue
        elif idade < 13:
            print('Faixa etária: Criança 😄')
        elif idade < 18:
            print('Faixa etária: Adolescente 😏')
        elif idade < 50:
            print('Faixa etária: Adulto 😌')
        elif idade < 150:
            print('Faixa etária: Idoso 🤠')
        else:
            resp = (input('Você está vivo? 😲 \n >> ')).strip().lower()
            if resp == 'sim' or resp == 'si' or resp == 's':
                print('😨😨😨')
            elif resp == 'nao' or resp == 'não' or resp == 'no' or resp == 'n':
                print(' RIP 💀')
            else:
                print('Tente novamente 😅')
                continue
        break
    except ValueError:
        print('Erro :/ Informe um valor válido! 😕')
