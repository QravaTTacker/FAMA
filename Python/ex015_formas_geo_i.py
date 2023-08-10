cor1, cor2, clr = '\033[35;1m', '\033[36;1m', '\033[m'
print(ascii(67))

while True:
    try:
        linhas =int(input('Linhas: '))
        break
    except ValueError:
        print('\nValor Inválido\n')

print('\nWhile...')
for i in range(linhas):
    for j in range(linhas):
        if not i != j or (i + j) == (linhas - 1):
            print(f' {cor1}{linhas-i-1:^3}{clr} ', end='')
        else:
            print(f' {cor2}{"#":^3}{clr} ', end='')
    print()

print('\nFor...')
i = 1
while i <= linhas:
    j = 1
    while j <= linhas:
        if i == j:
            print(f' {cor1}{linhas-i:^3}{clr} ', end='')
        elif i + j == linhas + 1:
            print(f' {cor1}{i - 1:^3}{clr} ', end='')
        else:
            print(f' {cor2}{"#":^3}{clr} ', end='')
        j += 1
    print()
    i += 1
print()

i = 1
while i <= linhas:
    j = 1
    while j <= linhas:
        print(f' [{i+j:^3}] ', end='')
        j += 1
    print('\n')
    i += 1
print()
