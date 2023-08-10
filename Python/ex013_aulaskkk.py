from random import randint, random
from emoji import emojize
import math

print(float(input('Qual é o seu peso? (em kg) '))/math.pow(float(input('Qual é a sua altura? (em metros) ')), 2))

A = list(range(int(input('Valor de partida: ')), int(input('Valor de chegada: ')) + 1, int(input('Salto: '))))
print(A)

valor_inteiro = randint(1, 10)
valor_real = random()
valor_final = valor_inteiro + valor_real
print(f'{valor_final:.2f}')
print('%.3f' % valor_final)
print('{:.4f}'.format(valor_final))

print(emojize('Python é\033[35m legal \033[m:cachorro_quente::moai:', language='pt'))

i = 1
# for i in range(1, 11)
while i < 11:
    r1 = randint(1, 10)
    r2 = randint(1, 10)
    print(f'Loop {i}º')
    # r1 + r2 == 20 ou r1 == 10 and r2 == r1
    if r1 == 10 and r2 == 10:
        print('Os dois valores são 10...')
    else:
        print(f'Os valores são {r1} e {r2}')
        # print('Os valores são', r1, 'e', r2)
        # print('Os valores são ' + str(r1) + ' e ' + str(r2))
        # print('%s %i e %i' % ('Os valores são', r1, r2))
        # print('Os valores são {} e {}'.format(r1, r2))
    print('=' * 20)
    i += 1


def imprime(letra, quantidade):
    frase = ''
    cont = 1
    while cont < quantidade:
        frase += letra
        cont += 1
    print(f'{frase:^10}')


imprime('+', 1)
imprime('+', 3)
imprime('+', 5)
imprime('=', 7)
imprime('+', 5)
imprime('+', 3)
imprime('+', 1)

while True:
    try:
        a = int(input('Digite algo: '))
        print(a, 'é do tipo:', type(a))
        break
    except ValueError:
        print('\033[31mVocê digitou uma letra em vez de um número inteiro \033[m')
