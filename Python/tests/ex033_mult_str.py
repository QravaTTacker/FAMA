def sequencia_bin(octetos):
    # Função: Responsável por converter os valor de cada octeto em binário.
    # Argumento: Recebe uma lista com 4 octetos (Não precisa splitar).
    # Return: Retorna uma string com a contagem de 8 dígitos. Ex: 00001111...
    full_binar = ''
    for i in range(4):
        binar = str(bin(int(octetos[i]))[2:])
        zeros = '0' * (8 - len(binar))
        # Full_binar vai concatenando cada octeto
        full_binar += zeros + binar + '.' if i != 3 else zeros + binar
    return full_binar


print(sequencia_bin(['192', '168', '0', '1']))


# if int(octetos_mask[i]) != 255 and int(octetos_mask[i]) != 254 and int(octetos_mask[i]) != 252 \
#     and int(octetos_mask[i]) != 248 and int(octetos_mask[i]) != 240 and int(octetos_mask[i]) != 224 \
#     and int(octetos_mask[i]) != 192 and int(octetos_mask[i]) != 128 and int(octetos_mask[i]) != 0:
# estado_mask = False
# break
for i in ['255', '255', '128', '0']:
    estado = True
    for mistos in ['255', '254', '252', '248', '240', '224', '192', '128', '0']:
        estado = False if i != mistos else True
        if estado:
            break
    if estado == False:
        break
