nome = u"""natan"""
new = ""

for i in range(len(nome)-1, -1, -1):
    new += nome[i]
    
print(f"Tamanho: {len(nome)}")
print(f"Antigo: {nome}")
print(f"Agora: {new}")
