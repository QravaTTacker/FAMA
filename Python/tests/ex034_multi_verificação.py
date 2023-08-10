octetos_mask = ['255', '255', '0', '15']
estado_mask = True
for i in range(4):
    # if i != 0 and ((octetos_mask[i - 1] == '254' or octetos_mask[i - 1] == '252' or \
    #     octetos_mask[i - 1] == '248' or octetos_mask[i - 1] == '240' or octetos_mask[i - 1] == '224' or \
    #     octetos_mask[i - 1] == '192' or octetos_mask[i - 1] == '128') and not octetos_mask[i] == '0'):
    #     print(f'Ambos os octetos {i} e {i + 1} são mistos :/')
    #     estado_mask = False
    #     break
    if i != 0 and octetos_mask[i] != '255':
        for mistos in ['254', '252', '248', '240', '224', '192', '128']:
            if octetos_mask[i - 1] == mistos and octetos_mask[i] != '0':
                print(f'Octetos {i} e {i + 1} são mistos:/')
                estado_mask = False
                break
        if estado_mask == False:
            break
print(f'Estado da máscara: {estado_mask}')
