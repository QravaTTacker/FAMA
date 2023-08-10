red1, red2, pur, sem = '\033[31;1m', '\033[31;1;7m', '\033[35;1m', '\033[m'


def ip_formatado(octetos, lista):
    # Função: Responsável por eliminar os zeros indevidos em cada octeto.
    # Argumento: Recebe uma 'string', por esse motivo é necessário separar.
    # Return: Pode retornar uma lista com o valor de cada octeto ou uma 'string'.
    octetos = octetos.split('.')
    formatar = ''
    for o in range(4):
        formatar += str(int(octetos[o])) + '.' if o != 3 else str(int(octetos[o]))
    if lista:
        return formatar.split(sep='.')
    return formatar


def sequencia_bin(octetos):
    # Função: Responsável por converter os valores de cada octeto em binário.
    # Argumento: Recebe uma lista com 4 octetos (Não precisa separar).
    # Return: Retorna uma 'string' com a contagem de 8 dígitos. Ex: 00001111...
    full_binar = ''
    for m in range(4):
        binar = str(bin(int(octetos[m]))[2:])
        zeros = '0' * (8 - len(binar))
        # Full_binar vai concatenando cada octeto.
        full_binar += zeros + binar + '.' if m != 3 else zeros + binar
    return full_binar


def tipificar_ip(octetos):
    # Função: Responsável indicar se o IP é reservado, válido, se é uma rede, broadcast, host etc.
    # Argumento: Recebe uma lista com 4 octetos (Não precisa separar).
    # Return: Retorna um conjunto de dados tipificando o IP.
    if '.'.join(octetos) == '0.0.0.0':
        return 'Reservado', 'IP de Inicialização', 'A'
    if '.'.join(octetos) == '255.0.0.0':
        return 'Reservado', 'Máscara De Rede', '/'
    if '.'.join(octetos) == '255.255.0.0':
        return 'Reservado', 'Máscara De Rede', '/'
    if '.'.join(octetos) == '255.255.255.0':
        return 'Reservado', 'Máscara De Rede', '/'
    if '.'.join(octetos) == '255.255.255.255':
        return 'Reservado', 'Broadcast Geral', '/'

    if '.'.join(octetos[0:2]) == '169.254':
        return 'Reservado', 'APIPA', 'B'
    if '.'.join(octetos) == '127.0.0.0':
        return 'Reservado', 'Rede De Loopback', 'A'
    if octetos[0] == '127':
        return 'Reservado', 'Loopback/Localhost', 'A'

    if 0 <= int(octetos[0]) <= 127 and '.'.join(octetos[1:]) == '0.0.0':
        return 'Reservado', 'Rede', 'A'
    if 128 <= int(octetos[0]) <= 191 and '.'.join(octetos[2:]) == '0.0':
        return 'Reservado', 'Rede', 'B'
    if 192 <= int(octetos[0]) <= 223 and octetos[3] == '0':
        return 'Reservado', 'Rede', 'C'
    if 0 <= int(octetos[0]) <= 127 and '.'.join(octetos[1:]) == '255.255.255':
        return 'Reservado', 'Broadcast', 'A'
    if 128 <= int(octetos[0]) <= 191 and '.'.join(octetos[2:]) == '255.255':
        return 'Reservado', 'Broadcast', 'B'
    if 192 <= int(octetos[0]) <= 223 and octetos[3] == '255':
        return 'Reservado', 'Broadcast', 'C'

    if octetos[0] == '10':
        return 'Privado', 'Host', 'A'
    if octetos[0] == '172' and 16 <= int(octetos[1]) <= 31:
        return 'Privado', 'Host', 'B'
    if '.'.join(octetos[:2]) == '192.168':
        return 'Privado', 'Host', 'C'

    if 0 <= int(octetos[0]) <= 127:
        return 'Público', 'Host', 'A'
    if 128 <= int(octetos[0]) <= 191:
        return 'Público', 'Host', 'B'
    if 192 <= int(octetos[0]) <= 223:
        return 'Público', 'Host', 'C'

    if 224 <= int(octetos[0]) <= 239:
        return 'Reservado', 'Multicast', 'D'
    if 240 <= int(octetos[0]) <= 254:
        return 'Reservado', 'Experimental', 'E'
    return '/', '/', '/'


def mask_mista(b):
    # Função: Determina a classe base conforme o número de bits.
    # Argumento: Recebe o valor de bits da máscara CIDR.
    # Return: Irá retornar uma 'string' da classe base.
    if b <= 8:
        return 'A'
    if b <= 16:
        return 'B'
    return 'C'


def erro(msg):
    # Função: Mostra uma mensagem de erro se o IP ou a Máscara forem inválidos.
    # Argumento: Recebe uma mensagem de notificação do erro.
    # Return: Não possui retorno, pois se trata de um procedimento.
    print('=' * 60)
    print(f"{red1}{msg:^60}{sem}")


def finalizar(msg):
    print('=' * 60)
    print(msg)
    print('=' * 60)


# ======================================================= Sessão do IP
while True:
    print('=' * 60)
    ip = input('Endereço IP: ').replace(' ', '')
    print('=' * 60)
    octetos_ip = ip.split(sep='.')
    # Verifica a quantidade de octetos do IP.
    if len(octetos_ip) == 4:
        estado_ip = True
        for i in range(4):
            # Verifica se cada octeto é decimal.
            if not octetos_ip[i].isdecimal():
                estado_ip = False
                print(f'{i + 1}º octeto está {red2}inválido{sem}!')
                break
            # Verifica se cada octeto está entre 0 e 255.
            if not 0 <= int(octetos_ip[i]) <= 255:
                estado_ip = False
                print(f'{i + 1}º octeto está {red2}fora da faixa{sem}!')
                break
        # Se o estado do IP é favorável para trabalhar ele irá sair do loop.
        if estado_ip:
            # Características do IP.
            ip = ip_formatado(ip, False)
            octetos_ip = ip_formatado(ip, True)
            tipo, natureza, classe = tipificar_ip(octetos_ip[:])
            ip_bin = sequencia_bin(octetos_ip[:])
            # Quebra o loop while
            break
    else:
        print(f'IPv4 possui {red2}4 octetos{sem}!')
    erro('IP inválido')

print(f'IP:                   {ip}')
print(f'Tipo:                 {tipo}')
print(f'Natureza:             {pur}{natureza}\033[m')
print(f'Classe:               {classe}')
print(f'Binário do IP:        {ip_bin}')

# ======================================================= Sessão da Máscara
if tipo == 'Privado' or tipo == 'Público':
    while True:
        print('=' * 60)
        mask = input('Máscara de Sub-rede: ').strip().lower()
        print('=' * 60)
        octetos_mask = mask.split('.')
        # Se a máscara for padrão, será determinado conforme o valor do primeiro octeto.
        if mask == 'p':
            if int(octetos_ip[0]) <= 127:
                octetos_mask = ['255', '0', '0', '0']
                break
            elif int(octetos_ip[0]) <= 191:
                octetos_mask = ['255', '255', '0', '0']
                break
            else:
                octetos_mask = ['255', '255', '255', '0']
                break
        # Verifica a quantidade de octetos da máscara.
        if len(octetos_mask) == 4:
            estado_mask = True
            for i in range(4):
                # Verifica se cada octeto é decimal.
                if not octetos_mask[i].isdecimal():
                    print(f'{i + 1}º octeto está {red2}inválido{sem}!')
                    estado_mask = False
                    break
                # Verifica se o octeto anterior é menor que próximo (impossível).
                if i != 0 and int(bin(int(octetos_mask[i]))[2:]) > int(bin(int(octetos_mask[i - 1]))[2:]):
                    print(f'{i + 1}º octeto {red2}deve ser menor{sem} que o {i}º octeto')
                    estado_mask = False
                    break
                # Verifica o caso do CIDR /0 ._.
                if octetos_mask[0] == '0':
                    print(f'Você tem uma {red2}rede mundial{sem} seu fdp?')
                    estado_mask = False
                    break
                # Verificar se o octeto possui um valor valido: 255, 254, 252, 248, 240, 224, 192, 128, 0.
                for mistos in ['255', '254', '252', '248', '240', '224', '192', '128', '0']:
                    estado_mask = False if octetos_mask[i] != mistos else True
                    if estado_mask:
                        break
                if not estado_mask:
                    print(f'{i + 1}º octeto {red2}não possui um valor permitido{sem}:')
                    print(f'São permitidos: 255, 254, 252, 248, 240, 224, 192, 128, 0')
                    break
                # Verificada se há apenas um octeto misto, (não é possível ter dois em simultâneo).
                # Só irá verificar quando o octeto atual difere de 255 (meramente por desempenho)
                if i != 0 and octetos_mask[i] != '255':
                    for mistos in ['254', '252', '248', '240', '224', '192', '128']:
                        if octetos_mask[i - 1] == mistos and octetos_mask[i] != '0':
                            print(f'Octetos {i} e {i + 1} {red2}são mistos{sem} :/')
                            estado_mask = False
                            break
                    if not estado_mask:
                        break
            # Se o estado da Máscara é favorável para trabalhar ele irá sair do ciclo.
            if estado_mask:
                break
        else:
            print(f'A máscara do IPv4 possui {red2}4 octetos{sem}!')
        erro('Máscara inválida')

    # Características da Máscara.
    mask = ".".join(octetos_mask)
    mask_bin = sequencia_bin(octetos_mask[:])
    bits = mask_bin.count('1')
    cidr = str(ip) + '/' + str(bits)
    classe = mask_mista(bits)
    hosts = f"{abs(2 ** mask_bin.count('0') - 2):,}"

    # Variáveis para suporte de cálculo.
    misto = 255
    pos = 0
    salto = 1
    comum = True

    # Capta o valor do octeto misto para fazer o cálculo do salto.
    for i in range(3, -1, -1):
        if octetos_mask[i] != '0':
            misto = int(octetos_mask[i])
            pos = i
            break
    salto = 256 - misto
    aux_salto = '/'

    # Determina se a rede é sub-dividida ou é uma rede única.
    if bits == 8 or bits == 16 or bits == 24:
        redes = f'{salto} {classe}'
    elif 25 <= bits <= 32:
        comum = False
        redes = f'1/{256 // salto} Rede'
        aux_salto = f'{salto} em {salto}' if bits <= 30 else '/'
    else:
        comum = False
        redes = f"{salto} {classe}"
        aux_salto = f'{salto} em {salto}'

    print(f'Máscara:              {mask}')
    print(f'CIDR:                 {cidr}')
    print(f'Hosts:                {hosts}')
    print(f'Redes:                {pur}{redes}\033[m')
    print(f'Salto:                {aux_salto}')
    print(f'Binário da Máscara:   {mask_bin}')

    if bits <= 30 and not comum:

        rede_sub = ['.0', '.0', '.0']
        broad_sub = ['.255', '.255', '.255']
        host_sub0 = ['.0', '.0', '.1']
        host_sub1 = ['.255', '.255', '.254']
        sub = 0

        print('=' * 85)
        print(f'{pur}{"Sub-Redes":>16}| {"Hosts":>30}| {"Broadcast":>30}|{sem}')
        print('=' * 85)
        # listaRede = []
        # listaBroad = []
        var = 1 if pos == 3 else 0
        aux = 1 if bits < 25 else 2
        fixos = '.'.join(octetos_ip[:pos]) + '.' if pos != 0 else ''
        for i in range(0, 256, salto):
            sub += 1
            rede = fixos + str(i) + ''.join(rede_sub[:3 - pos])
            broad = fixos + str(salto + i - 1) + ''.join(broad_sub[:3 - pos])
            host = str(i + var) + ''.join(host_sub0[pos:]) + ' até ' + str(salto + i - aux) + ''.join(host_sub1[pos:])
            print(f'{rede:>16}| {host:>30}| {broad:>30}|')
            # listaRede.append(rede)
            # listaBroad.append(broad)
        print('-' * 20)
        print(f'Sub-redes: {pur}{sub}{sem}')
        print('=' * 85)

        # print('\nEndereços de rede: ')
        # for n, i in enumerate(listaRede):
        #     print(i, end='; ')
        #     if pos % 10 == 0:
        #         print()

        # print('\n\nEndereços de Broadcast: ')
        # for i in listaBroad:
        #     print(i, end='; ')
        #     if pos % 10 == 0:
        #         print()

    elif bits == 31:
        finalizar(f'Cada computador estabelece uma relação de {pur}ponta-a-ponto\033[m.')
    elif bits == 32:
        finalizar(f'Vulgarmente, cada host se comporta como uma {pur}rede própria\033[m.')
    elif comum:
        finalizar(f'Máscara de rede padrão! Nesse caso, há{pur} uma única rede\033[m.')
else:
    print('=' * 60)
