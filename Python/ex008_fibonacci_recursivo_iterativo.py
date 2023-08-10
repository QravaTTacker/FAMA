# Função do Fibonacci recursivo.
def fibo(t):
    # Só começa retornar os dados quando chegar no 1º e 2º termo.
    if t <= 1:
        return t
    # Chamada recursiva do tipo (f = t1 + t2).
    return fibo(t - 2) + fibo(t - 1)


# Programa principal.
print('\033[32m' + '=' * 65)
# Executa até a pessoa querer sair do programa.
while True:
    # Verifica se a entrada de dados não terá um erro.
    try:
        # Variáveis usadas.
        f, f1, f2 = 0, 0, 1
        # Entrada de dados, indicando o número de termos.
        termo = int(input('| Nº de termos: '))
        print('=' * 65)
        # Iteração com alcance limite da entrada.
        for i in range(termo):
            # Nas 3 primeiras execuções mostrará os valores de f2 (1, 1...).
            if i <= 2:
                print('| %2dº %8s %10d' % (i+1, 'termo ->', f2), end='')
            else:
                print('| %2dº %8s %10d' % (i+1, 'termo ->', f), end='')
            # Calculo do Fibonacci iterativo.
            f = f1 + f2
            f1, f2 = f2, f
            # Separa o Fibonacci iterativo do recursivo.
            print(f'{"||":^12}', end='')
            # Saída de dados (Fibonacci recursivo).
            print(f' {i+1:2}º {"termo ->":8} {fibo(i+1):10} |')
        print('=' * 65)
    # Se o valor um float ou string cairá aqui.
    except ValueError:
        print('Valor inválido :/')
        # Não pergunta se quer continuar a aplicação e volta para cima do ciclo.
        continue
    # Pergunta ao usuário se deseja continuar a aplicação.
    if str(input('| Para? [s/n] ')).strip().lower() == 's':
        # Quebra o ciclo while (True)
        break
    print('=' * 65)
print('=' * 65 + '\033[32m')
