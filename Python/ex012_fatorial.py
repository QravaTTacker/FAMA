# Resolução I: Fatorial usando o algoritmo estruturado (6 linhas).
n = 10
resultado = 1
while n > 0:
    resultado *= n
    n -= 1
print(f'Fatorial de 10 é {resultado}')


# Resolução II: Fatorial usando algoritmo recursivo (5 linhas).
def fatorial(x):
    if x == 1:
        return 1
    return x * fatorial(x-1)


print(f'Fatorial de 10 é {fatorial(10):.3e}')
