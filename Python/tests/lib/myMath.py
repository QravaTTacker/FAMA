def tabuada(valor=1, pular=False):

    print('\033[36m', end='')

    for i in range(1, 10):
        print(f'{i} x {valor} = {i*valor}')
    print('\033[m', end='')

    if pular:
        print()
