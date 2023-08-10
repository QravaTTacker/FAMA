def sequencia_valores_for(tam):
    aux = tam
    for linha in range(1, tam * 2):
        aux -= 1
        for coluna in range(tam - abs(aux)):
            print(f'{red}{coluna + 1:2}{sem}', end=' ')
        for asterisco in range(abs(aux)):
            print(' * ', end='')
        print()


def sequencia_valores_while(tam):
    aux = tam
    linha = 1
    while linha < (tam * 2):
        aux -= 1
        coluna = 1
        while coluna <= tam - abs(aux):
            print(f'{red}{coluna:2}{sem}', end=' ')
            coluna += 1
        asterisco = 1
        while asterisco <= abs(aux):
            print(' * ', end='')
            asterisco += 1
        print()
        linha += 1


red, sem  = '\033[31m', '\033[m'
valor = int(input('Informe o tamanho: '))
print('=' * (valor * 3 + 1) + ' Com for...')
sequencia_valores_for(valor)
print('=' * (valor * 3 + 1) + ' Com while...')
sequencia_valores_while(valor)
print('=' * (valor * 3 + 1) + ' Num tem do-while :/')
