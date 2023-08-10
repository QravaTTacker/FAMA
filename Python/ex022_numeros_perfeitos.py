def perfeitos(n):
    soma = 0
    for div in range(1, n):
        if n % div == 0:
            soma += div
    if soma == n:
        return True
    return False


print('Números perfeitos do 1 ao 500:')
for i in range(1, 501):
    if perfeitos(i):
        print(f'{i}')
