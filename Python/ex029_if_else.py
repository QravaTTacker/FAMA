from random import randint

d1 = randint(1, 6)
d2 = randint(1, 6)
d3 = randint(1, 6)

print(f'd1: {d1}')
print(f'd2: {d2}')
print(f'd3: {d3}')

maior = (d1 + d2 + abs(d1 - d2))//2
maior = (maior + d3 + abs(maior - d3))//2

print(f'{"d1 é o maior" if (d1 == maior and d2 != maior and d3 != maior) else "d2 é o maior" if (d2 == maior and d1 != maior and d3 != maior) else "d3 é o maior" if (d3 == maior and d1 != maior and d2 != maior) else "d1 e d2 possuem os maiores valores" if (d1 == d2 == maior and d3 != maior) else "d1 e d3 possuem os maiores valores" if (d1 == d3 == maior and d2 != maior) else "d2 e d3 possuem os maiores valores" if (d2 == d3 == maior and d1 != maior) else "Todos são iguais"}')
