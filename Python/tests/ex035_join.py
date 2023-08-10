rede = ['0', '0', '0']
broad = ['255', '255', '255']
host = ['255', '255', '254']

for pos in range(3, -1, -1):
    final_rede = '.'.join(rede[:3-pos])
    print(final_rede)

for pos in range(3, -1, -1):
    final_broad = '.'.join(broad[:3-pos])
    print(final_broad)

for pos in range(3, -1, -1):
    final_host = '.'.join(host[pos:])
    print(final_host)
