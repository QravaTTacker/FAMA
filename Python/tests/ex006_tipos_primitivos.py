'''
x = 'Meu timão'
y = 5
i = 0.7
j = False
print('='*25)
print('x =', x, '\ny =', y, '\ni =', i, '\nj =', j)
print('='*25)
print('x = ' + x, '\ny = ' + str(y), '\ni = ' + str(i), '\nj = ' + str(j))
print('='*25)
print('x = %s \ny = %s \ni = %s \nj = %s' % (x, y, i, j))
print('='*25)
print('x = {} \ny = {} \ni = {} \nj = {}'.format(x, y, i, j))
print('='*25)
print(f'x = {x} \ny = {y} \ni = {i} \nj = {j}')
print('='*25)

k = 1000000
t = 1000.40001
print('K = {:,}\nT = {:,.2f}\n'.format(k, t))
print(f'K = {k:,} \nT = {t:10,.2f}')

soma = int(1)
i = int(1)
while i <= 20:
    j = int(1)
    while j <= i:
        print(f'{soma}', end=' ')
        soma += 1
        j += 1
    print()
    i += 1
'''

num = int(input('Digite um inteiro: '))
print(f'{num} em hexadecimal: {num:x}')
print(f'{num} em octodecimal: {num:o}')
print(f'{num} em binário: {num:b}')
