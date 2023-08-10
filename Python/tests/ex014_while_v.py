x = 0
while x < 3:
    somar = str(input(f' x = {x}\n Somar +1? [s/n] '))
    if not(somar == 's'):
        continue
    x += 1
print(f' x = {x} ')
