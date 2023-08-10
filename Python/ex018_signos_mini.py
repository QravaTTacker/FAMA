signos = ['Capricórnio', 'Aquário', 'Peixes',
          'Áries', 'Touro', 'Gêmeos',
          'Câncer', 'Leão', 'Virgem',
          'Libra', 'Escorpião', 'Sagitário',
          'Talvez você errou na digitação da data :/']


def indicar_signo(d, m):

    dia_limite = [20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21]
    dia_max = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if not(1 <= d <= dia_max[m]) or not(0 <= m <= 11):
        return 12
    if 1 <= d <= dia_limite[m]:
        return m
    if m == 11 and (dia_limite[m] < d <= dia_max[m]):
        return 0
    return m + 1


dia = int(input('Dia do seu nascimento: '))
mes = int(input('Mês do seu nascimento: '))
print(f'Signo: {signos[indicar_signo(dia, mes-1)]}')
