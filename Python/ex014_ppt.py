import time
import random
# from os import system

ppt = ['Pedra', 'Papel', 'Tesoura']
vit = der = emp = 0


def resultados():
    print('=' * 16)
    print(f'Vitórias: {vit}')
    print(f'Derrotas: {der}')
    print(f'Empates: {emp}')
    print('=' * 16)


def erro():
    # system('cls')
    time.sleep(0.5)
    print('\n\n\n\n')
    print('=' * 16)
    print(f'\033[31m{"Opção inválida":^16}\033[m')


def painel():
    print('=' * 16)
    print('Pedra........[1]')
    print('Papel........[2]')
    print('Tesoura......[3]')
    print('=' * 16)


def msg(dado_usr, dado_pc):
    print('=' * 16)
    print(f'Você: {dado_usr}')
    print(f'PC: {dado_pc}')
    print('=' * 16)


def jogo(opc_usr):
    global vit, der, emp, ppt
    pc = random.randint(0, 2)
    msg(ppt[opc_usr], ppt[pc])
    if ppt[opc_usr] == ppt[pc]:
        print(f'\033[34m{"Empate":^16}\033[m')
        emp += 1
    elif (ppt[opc_usr] == 'Pedra' and ppt[pc] == 'Papel') or \
        (ppt[opc_usr] == 'Papel' and ppt[pc] == 'Tesoura') or \
        (ppt[opc_usr] == 'Tesoura' and ppt[pc] == 'Pedra'):
        print(f'\033[31m{"Derrota":^16}\033[m')
        der += 1
    # (ppt[opc_usr] == 'Pedra' and ppt[pc] == 'Tesoura') or (ppt[opc_usr] == 'Papel' and ppt[pc] == 'Pedra') or (ppt[opc_usr] == 'Tesoura' and ppt[pc] == 'Papel'):
    else:
        print(f'\033[32m{"Vitória":^16}\033[m')
        vit += 1


while True:
    painel()
    try:
        usr = int(input('Opção >>> '))
    except ValueError:
        erro()
        continue
    if not(1 <= usr <= 3):
        erro()
        continue
    else:
        jogo(usr-1)
    print('=' * 16)
    resp = str(input('Para? [s/n] ')).strip().lower()
    # system('cls')
    time.sleep(0.5)
    print('\n\n\n\n')
    if resp == 's':
        break
resultados()
