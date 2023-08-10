# Código ANSI de cores (não funciona direito no terminal nativo).
red, green, clr = '\033[31m', '\033[32m', '\033[m'


# Função para formatar a saída de dados.
def msg_formatada(frase):
    print('=' * 55)
    print(frase)
    print('=' * 55)


# Função para validar se pode ou não forma um triângulo.
def validar_lados(a, b, c):
    if (a+b > c) and (a+c > b) and (b+c > a):
        # Forma um triângulo.
        return True
    # Não forma um triângulo.
    return False


# Função para índica qual triângulo é formado.
def tipo_triangulo(l1, l2, l3):
    if validar_lados(l1, l2, l3):
        # Caso todos os lados sejam iguais → Equilátero.
        if l1 == l2 == l3:
            return 'Formará um Triângulo {}Equilátero{} 📐'.format(green, clr)
        # Caso todos os lados sejam diferentes → Escaleno.
        if (l1 != l2) and (l3 != l2) and (l1 != l3):
            return 'Formará um Triângulo %sEscaleno%s 📐' % (green, clr)
        # Caso apenas dois lados sejam iguais → Isósceles.
        return f'Formará um Triângulo {green}Isósceles{clr} 📐'
    # else → Caso não seja possível forma um triângulo.
    return red + 'Impossível' + clr + ' formar um triângulo com esses valores 😐'


# Programa principal.
print('=' * 20)
# Iteração infinita até que a entrada de dados seja preenchida corretamente.
while True:
    # Verifica se o dado é um número, do contrário o programa executará de novo.
    try:
        # Entrada de dados.
        x = float(input('| x = '))
        y = float(input('| y = '))
        z = float(input('| z = '))
        # break termina o ciclo while.
        break
    except ValueError:
        # Mostra que a pessoa informou uma letra, por exemplo.
        msg_formatada(f'|{red}{"Informe um valor numérico 😕":^52}{clr}|')
# Mostra o resultado final.
msg_formatada(f'| {tipo_triangulo(x, y, z)}')
