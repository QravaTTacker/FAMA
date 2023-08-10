print('-'*50)
num = int(input(' Digite o número de linhas: '))
# --------------------------------------------- I
print('-'*50)
i = int(1)
while i <= num:
    j = int(1)
    while j <= 3:
        print('  ', end='')
        j += 11
    j = int(1)
    while j <= num:
        print(' #', end=' ')
        j += 1
    print()
    i += 1
# --------------------------------------------- II
print('-'*50)
i = int(1)
while i <= num:
    j = num-1
    while j >= i:
        print('   ', end=' ')
        j -= 1
    j = int(1)
    while j <= i:
        print('  #', end=' ')
        j += 1
    print()
    i += 1
# --------------------------------------------- III
print('-'*50)
i = int(1)
while i <= num:
    j = num
    while j >= i:
        print('  #', end=' ')
        j -= 1
    print()
    i += 1
# --------------------------------------------- IV
print('-'*40)
i = int(1)
while i <= num:
    j = int(1)
    while j <= i-1:
        print('   ', end=' ')
        j += 1
    j = num
    while j >= i:
        print('  #', end=' ')
        j -= 1
    print()
    i += 1
# --------------------------------------------- V
print('-'*50)
i = int(1)
while i <= num:
    j = num-1
    while j >= i:
        print(' ', end=' ')
        j -= 1
    j = int(1)
    while j <= i:
        print('  #', end=' ')
        j += 1
    print()
    i += 1
# --------------------------------------------- V
print('-'*50)
i = int(1)
while i <= num:
    j = int(1)
    while j <= i:
        print('  #', end=' ')
        j += 1
    print()
    i += 1
# --------------------------------------------- VI
print('-'*50)
i = int(1)
while i <= num:
    j = int(1)
    while j <= i-1:
        print(' ', end=' ')
        j += 1
    j = num
    while j >= i:
        print('  #', end=' ')
        j -= 1
    print()
    i += 1
print('-'*50)
