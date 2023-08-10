from time import sleep

nome = 'Cristian'
for i in range(10):
    x = 0
    while x < len(nome):
        for i in range(x):
            print(' ', end='')
        print(f'\033[3{x}m', end='')
        print(nome[x])
        sleep(0.1)
        x += 1
    print()
