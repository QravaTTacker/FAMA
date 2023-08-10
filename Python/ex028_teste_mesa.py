# n = abs(int(input('Linhas: ')))
# soma = i = 1
# while i <= n:
#     j = 1
#     while j <= i:
#         print(f'{soma:3}', end='')
#         soma += 1
#         j += 1
#     i += 1
#     print()

# resultado, n = 1, 5
# while n > 0:
#     print(f'Resultado: {resultado:3} * {n} = {resultado * n:3}')
#     resultado *= n
#     n -= 1

# y = x = 1
# while x <= 5:
#     y += 2 if x % 2 == 0 else 3
#     print(f'{x}º -> y = {y}')
#     x += 1

n, res, i = 5, 1, 1
while i <= n:
    res *= i
    print(res)
    i += 1
