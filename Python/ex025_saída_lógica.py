o1, o2, o3, o4 = bin(192)[2:], bin(168)[2:], bin(20)[2:], bin(15)[2:]
m1, m2, m3, m4 = bin(255)[2:], bin(255)[2:], bin(0)[2:], bin(0)[2:]
octetos_ip = [o1, o2, o3, o4]
octetos_mask = [m1, m2, m3, m4]

for i in range(4):
    zeros = ''
    zeros += '0' * (8 - len(octetos_ip[i]))
    octetos_ip[i] = zeros + octetos_ip[i]
print('IP:   ', end='')
for i in octetos_ip:
    print(i, end='')

for i in range(4):
    zeros = ''
    zeros += '0' * (8 - len(octetos_mask[i]))
    octetos_mask[i] = zeros + octetos_mask[i]
print('\nMask: ', end='')
for i in octetos_mask:
    print(i, end='')

print('\nRede: ', end='')
r1 = ''
# Itera entre cada octeto.
for i in range(4):
    # Itera entre cada valor de octeto.
    for j in range(8):
        logico = str(int(octetos_ip[i][j]) and int(octetos_mask[i][j]))
        r1 += logico + '.' if i != 3 and j == 7 else logico
rede = r1.split('.')
print(''.join(rede))

for i in range(4):
    rede[i] = str((int(rede[i], 2)))
print('Endereço de Rede:', '.'.join(rede))

broadcast = []
for i in range(4):
    bc = rede[i] if rede[i] != '0' else '255'
    broadcast.append(bc)
print('Endereço de Broadcast:', '.'.join(broadcast))
