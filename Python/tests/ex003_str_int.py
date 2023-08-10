try:
    x = float(input("X = "))
    y = float(input("Y = "))
    print(x, ' + ', y, ' =', x+y)
except ValueError:
    print('Valor inválido!')
