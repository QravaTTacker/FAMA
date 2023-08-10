from math import *

try:
    equ = eval('cos(radians(180))')
    print(equ)
except ValueError and ZeroDivisionError:
    print('Erro :/')
