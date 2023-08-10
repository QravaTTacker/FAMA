from math import acos, pi

pur, clr = '\033[35m', '\033[m' 


def somatorio(valor=0):
    total = 0
    for i in range(1, valor+1):
        total += i
    return total


def angulatura(s1=0.0, s2=0.0, oposto=0.0):
    return acos((s1**2 + s2**2 - oposto**2) / (2 * s1 * s2)) * (180/pi)


def tipo_triangulo(l1=0.0, l2=0.0, l3=0.0):
    if l1 == l2 == l3:
        return 'Formará um Triângulo {}Equilátero{} 📐'.format(pur, clr)
    elif (l1 != l2) and (l3 != l2) and (l1 != l3):
        return 'Formará um Triângulo %sEscaleno%s 📐' % (pur, clr)
    return f'Formará um Triângulo {pur}Isósceles{clr} 📐'
