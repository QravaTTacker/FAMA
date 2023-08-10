def seq(n):
    aux = n
    for x in range(2 * n - 1):
        aux -= 1
        s = n - abs(aux)
        if s >= 10:
            print('\033[31m', end='')
        else:
            print('\033[32m', end='')
        print(f'{s: <3}' * (abs(aux) + 1))


valor = int(input('Digite um valor: '))
seq(valor)
print('\033[m', end='')
