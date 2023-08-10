def validar_triangulo(l1=1.0, l2=1.0, l3=1.0):

    caso1 = (l1 > 0) and (l2 > 0) and (l3 > 0)
    caso2 = (l1 + l2 > l3) and (l2 + l3 > l1) and (l1 + l3 > l2)

    if caso1 and caso2:
        return True
    return False
