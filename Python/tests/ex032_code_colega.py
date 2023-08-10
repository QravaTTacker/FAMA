def transformar_em_data(d, m):
    lista_de_signos = ['Capricórnio', 'Aquário', 'Peixes',
                       'Áries', 'Touro', 'Gêmeos',
                       'Câncer', 'Leão', 'Virgem',
                       'Libra', 'Escorpião', 'Sagitário']
    if 22 <= d <= 31 and m == 12 or 0 < d <= 20 and m == 1:
        print(lista_de_signos[0])
    elif d >= 21 and m == 1 or d <= 19 and m == 2:
        print(lista_de_signos[1])
    elif d >= 20 and m == 2 or d <= 20 and m == 3:
        print(lista_de_signos[2])
    elif d >= 21 and m == 3 or d <= 20 and m == 4:
        print(lista_de_signos[3])
    elif d >= 21 and m == 4 or d <= 20 and m == 5:
        print(lista_de_signos[4])
    elif d >= 21 and m == 5 or d <= 20 and m == 6:
        print(lista_de_signos[5])
    elif d >= 21 and m == 6 or d <= 21 and m == 7:
        print(lista_de_signos[6])
    elif d >= 22 and m == 7 or d <= 22 and m == 8:
        print(lista_de_signos[7])
    elif d >= 23 and m == 8 or d <= 22 and m == 9:
        print(lista_de_signos[8])
    elif d >= 23 and m == 9 or d <= 22 and m == 10:
        print(lista_de_signos[9])
    elif d >= 23 and m == 10 or d <= 21 and m == 11:
        print(lista_de_signos[10])
    elif d >= 22 and m == 11 or d <= 21 and m == 12:
        print(lista_de_signos[11])
    else:
        print('Valores inválidos, por favor tente novamente!')


dia = int(input('Insira o dia de seu aniversário: '))
mes = int(input('Insira o mês de seu aniversário: '))

transformar_em_data(dia, mes)
