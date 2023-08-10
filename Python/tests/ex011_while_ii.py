from os import system
op = 's'
while op != 'n' and op != 'no' and not (op == 'não'):
    soma = 0
    print('-'*25)
    lim = int(input('| Termo n: '))
    for var in range(lim+1):
        soma += var
    print('-'*25)
    print(f'| Resultado: {soma}')
    print('-'*25)
    op = str(input('| Fazer outro somatório? ')).strip().lower()
    system('cls')
