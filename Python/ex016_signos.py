# Os valores da lista indica o limite de dias para cada signo nos respectivos meses.
# Se o valor limite é superado, o endereçamento da lista será: signo[mes] (mês seguinte).
# Se o valor limite não é superado, o endereçamento será: signo[mes - 1] (mês atual).
dia_limite = [20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21]

# Essa lista mostra o dia máximo de cada mês. Observação: para anos bissextos, fevereiro muda de 28 para 29.
dia_max = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

# Por último, temos a lista dos signos. O último elemento é uma exceção.
signos = ['Capricórnio', 'Aquário', 'Peixes', 'Áries', 'Touro', 'Gêmeos', 'Câncer', 'Leão', 'Virgem', 'Libra',
          'Escorpião', 'Sagitário', 'Talvez você errou na digitação da data :/']


# Essa função mostra os signos de cada dia do ano, tanto pela função v1, quanto pela v2.
def todas_datas():
    global dia_limite, dia_max, signos
    for meses in range(1, 13):
        aux = meses
        print(f'\033[3{meses%2+4}m' + '=' * 40, f'Mês {aux}')
        # Com o range(1, dia_max[mes-1] + 1) no segundo 'for' a último condição é inútil...
        for dias in range(1, 32):
            meses = aux
            print(f'{dias}/{meses}:', indicar_signo_v1(dias, meses))
            if 1 <= dias <= dia_limite[meses - 1]:
                meses -= 1
            elif meses == 12 and (31 >= dias >= 22):
                meses = 0
            elif dias > dia_max[meses - 1]:
                meses = 12
            print(f'{dias}/{aux}:', signos[meses])
            print('-' * 20)


def indicar_signo_v1(d=10, m=5):
    if (m == 12 and (22 <= d <= 31)) or (m == 1 and (1 <= d <= 20)):
        # de 22/12 até 20/1 Capricórnio
        return 'Capricórnio'
    elif (m == 1 and (21 <= d <= 31)) or (m == 2 and (1 <= d <= 19)):
        # de 21/1 até 19/2 Aquário
        return 'Aquário'
    elif (m == 2 and (20 <= d <= 29)) or (m == 3 and (1 <= d <= 20)):
        # de 20/2 até 20/3 Peixes
        return 'Peixes'
    elif (m == 3 and (21 <= d <= 31)) or (m == 4 and (1 <= d <= 20)):
        # de 21/3 até 20/4 Áries
        return 'Áries'
    elif (m == 4 and (21 <= d <= 30)) or (m == 5 and (1 <= d <= 20)):
        # de 21/4 até 20/5 Touro
        return 'Touro'
    elif (m == 5 and (21 <= d <= 31)) or (m == 6 and (1 <= d <= 20)):
        # de 21/5 até 20/6 Gêmeos
        return 'Gêmeos'
    elif (m == 6 and (21 <= d <= 30)) or (m == 7 and (1 <= d <= 21)):
        # de 21/6 até 21/7 Câncer
        return 'Câncer'
    elif (m == 7 and (22 <= d <= 31)) or (m == 8 and (1 <= d <= 22)):
        # de 22/7 até 22/8 Leão
        return 'Leão'
    elif (m == 8 and (23 <= d <= 31)) or (m == 9 and (1 <= d <= 22)):
        # de 23/8 até 22/9 Virgem
        return 'Virgem'
    elif (m == 9 and (23 <= d <= 30)) or (m == 10 and (1 <= d <= 22)):
        # de 23/9 até 22/10 Libra
        return 'Libra'
    elif (m == 10 and (23 <= d <= 31)) or (m == 11 and (1 <= d <= 21)):
        # de 23/10 até 21/11 Escorpião
        return 'Escorpião'
    elif (m == 11 and (22 <= d <= 30)) or (m == 12 and (1 <= d <= 21)):
        # de 22/11 até 21/12 Sagitário
        return 'Sagitário'
    return 'Talvez você errou na digitação da data :/'


def indicar_signo_v2(d=10, m=5):
    global signos, dia_limite
    if not(1 <= m <= 12) or not(1 <= d <= dia_max[m - 1]):
        return 12
    if 1 <= dia <= dia_limite[m - 1]:
        return m - 1
    if m == 12 and (22 <= d <= 31):
        return 0
    return m


while True:
    try:
        dia = int(input('Dia do seu nascimento: '))
        mes = int(input('Mês do seu nascimento: '))
        break
    except ValueError:
        print('\033[31mDigite um valor numérico!\033[m')
print('-' * 30)
v1 = indicar_signo_v1(dia, mes)
v2 = signos[indicar_signo_v2(dia, mes)]
print(f'Seu signo é {v1} (v1)' if not ('Talvez' in v1) else f'{v1} (v1)')
print(f'Seu signo é {v2} (v2)' if not ('Talvez' in v2) else f'{v2} (v2)')
print('-' * 30)

resp = input('Mostrar os signos de todas as datas? [s/n]: ').lower().strip()
if resp == 's' or resp == 'si' or resp == 'sim':
    todas_datas()
