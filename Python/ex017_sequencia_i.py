def sequencia_valores_for(tam):
    aux = tam
    for i in range(tam * 2 - 1):
        aux -= 1
        for j in range(abs(aux) + 1):
            print('{: >2}'.format(tam - abs(aux)), end='')
        print()


def sequencia_valores_while(tam):
    aux = tam
    linha = 1
    while linha <= (aux * 2 - 1):
        tam -= 1
        coluna = 1
        while coluna <= abs(tam) + 1:
            print('%2i' % (aux - abs(tam)), end='')
            coluna += 1
        print()
        linha += 1


valor = int(input('Tamanho da sequência: '))
print('=' * (valor * 2 + 1) + ' Com for...')
sequencia_valores_for(abs(valor))
print('=' * (valor * 2 + 1) + ' Com while...')
sequencia_valores_while(abs(valor))
print('=' * (valor * 2 + 1) + ' Num tem do-while :/')
