import ctypes

# kernel32 = ctypes.windll.kernel32
# kernel32.SetConsoleMode(kernel32.GetStdHandle(-11), 7)

print(f'\u001b[38;1;3;4m')
for i in range(1, 6):
    print(f'\u001b[38;5;{i}mOlá mundo')
print('\u001b[m')
