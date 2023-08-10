import os
x = 1
resp = str('n')
while resp != 's':
    print(x)
    resp = str(input('Parar? '))
    x += 1
    os.system('cls')
