def text_prompt(msg):
    try:
        return raw_input(msg)
    except NameError:
        return input(msg)


nota1 = float(text_prompt('1ª nota: '))
nota2 = float(text_prompt('2ª nota: '))
media = (nota1 + nota2) / 2
if media >= 9:
    print('Aprovado, você foi um excelente aluno! ')
elif media >= 7:
    print('Aprovado!')
else:
    print('Reprovado :( estude mais!')
