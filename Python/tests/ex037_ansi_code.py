for i in range(17):
        for j in range(17):
                code = str(i * 16 + j)
                print('\033[38;5;' + code + f'mO', end='-')
                print('\x1b[38;5;' + code + f'mO', end='-')
                print('\u001b[38;5;' + code + f'mO', end=' ')
        print()
