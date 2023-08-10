def primos(n=0):
    for div in range(2, n):
        if n % div == 0:
            return False
    return True


spc = 0
print('São primos do 10 ao 100:')
for i in range(10, 101):
    if primos(i):
        spc += 1
        print(' ' * spc + f'{i}')
