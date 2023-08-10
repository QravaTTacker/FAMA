# print('Hello, World!')
var = input('Digite algo: ')
if var.isalpha() is True:
    print('Você digitou uma letra!')
elif var.isnumeric() is True:
    print('Você digitou um número!')
else:
    print('Você digitou uma alfanumérico :v')
