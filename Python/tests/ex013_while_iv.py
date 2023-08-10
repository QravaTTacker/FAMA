total, x = 0, 1
while True:
    try:
        produto = float(input(f' {x}º produto: R$'))
        total += produto
    except ValueError:
        print(' Valor inválido :/')
        continue
    parar = str(input(' Fazer mais uma comprar? [s/n] ')).lower().strip()
    if not (parar == 's' or parar == 'si' or parar == 'sim'):
        break
    x += 1
valor = f'{total:,.2f}'
valor = valor.replace(',', '.')
if valor.count('.', -3):
    aux = valor[len(valor)-3:].replace('.', ',')
valor = valor[0: len(valor)-3] + aux
print(f' O gasto total foi de R${valor}')
