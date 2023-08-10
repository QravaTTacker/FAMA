# linha = int(input('Linha: '))
# for i in range(1, linha+1):
#     for j in range(1, i+1):
#         print(' # ', end='')
#     print()
# print()
# for i in range(1, linha+1):
#     for j in range(i, linha+1):
#         print(' # ', end='')
#     print()
# print()
# for i in range(1, linha+1):
#     for j in range(1, linha+1):
#         if j >= i:
#             print(' # ', end='')
#         else:
#             print('   ', end='')
#     print()
# print()
# for i in range(1, linha+1):
#     for j in range(1, linha+1):
#         if j + i >= linha + 1:
#             print(' # ', end='')
#         else:
#             print('   ', end='')
#     print()

# linha = int(input('Linhas: '))
# for i in range(linha):
#     for j in range(linha):
#         print(' # ' if i == 0 or j == 0 or i == linha-1 or j == linha-1 or i + j == linha - 1 or i == j else '   ', end='')
#     print()

# nome = str(input('Nome: '))
# for i in range(1, len(nome) + 1):
#     print(nome[0:i])

# valor = int(input('Valor: '))
# somar = 0
# for i in range(valor + 1):
#     somar += i
# print(f'Somatório de {valor} = {somar}')

# for k in range(1, 11):
#     print('-' * 15, f'Tabuada do {k}')
#     for i in range(1, 11):
#         print(f'{i} x {k} = {i * k}')

# i = int(input('Início: '))
# f = int(input('Fim: '))
# aux = 1 if i <= f else -1
# while i != f + aux:
#     print(i, end=' ')
#     i += 1 * aux

# i = int(input('Início: '))
# f = int(input('Fim: '))
# if i <= f:
#     while i <= f:
#         print(i, end=' ')
#         i += 1
# else:
#     while i >= f:
#         print(i, end=' ')
#         i -= 1

# i = int(input('Início: '))
# f = int(input('Final: '))
# s = int(input('Salto: '))
# if i > f and s < 0:
#     for var in range(i, f-1, s):
#         print(var, end=' ')
# else:
#     print('Erro :/')

# i = int(input('Início: '))
# f = int(input('fim: '))
# for var in range(i, f-1, -1):
#     print(var, end=' ')

# i = float(input('Início: '))
# f = float(input('Fim: '))
# while i <= f:
#     print(i)
#     i += 0.5

# final = int(input('Valor final: '))
# inicio = 0
# while inicio <= final:
#     print(inicio)
#     inicio += 1

# soma = 0
# for i in range(50, 0, -4):
#     soma += i
#     if i == 2:
#         print(i, end=' = ')
#     else:
#         print(i, end=' + ') 
# print(soma)


# for i in range(0, 71, 1):
#     if i % 7 == 0:
#         print(i, end=' ')

# for i in range(0, 31, 3):
#     print(i, end=' ')

# for i in range(100, -1, -10):
#     print(i)

# for i in range(0, 11):
#     print(i)

# for i in range(0, 51):
#     print(i, end=' ')

# i = int(input('Começo: '))
# final = int(input('Final: '))
# print('-' * 20)
# aux = 1 if i < final else -1
# while i != final + aux:
#     print(f'Linha: {i}')
#     i += 1 * aux
