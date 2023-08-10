def fatorial(x: int):
    return 1 if x == 0 or x == 1 else x * fatorial(x-1)


print(f'O retorno é {fatorial(abs(int(input("Fatorial de: "))))}')
