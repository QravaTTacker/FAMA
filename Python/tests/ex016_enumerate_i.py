lista = ['Python', 'C', 'C++', 'C#', 'Java', 'JavaScript', 'PHP']
print('---------------------------------')
indi = 0
for var in lista:
    print(f' Linguagem: {var} índice: {indi}')
    indi += 1
print('---------------------------------')
for i, var in enumerate(lista):
    print(f' Linguagem: {var} índice: {i} ')
print('---------------------------------')
for var in range(len(lista)):
    print(f' Linguagem: {lista[var]} índice: {var}')
