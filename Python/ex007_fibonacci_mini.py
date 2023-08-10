t1, t2, t3 = 0, 1, 0
for i in range(int(input('Nº Termos: '))):
    t3 = t1 + t2; t1, t2 = t2, t3; print(' ' * i + f'\033[3{i%2+5}m{t1}\033[m')