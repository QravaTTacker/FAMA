def my_len(num):
    digits_total = 1
    while num // 10 != 0:
        digits_total += 1
        num /= 10
    return digits_total


print(f'O valor que você digitou possui {my_len(abs(int(input("Digite um inteiro: "))))} dígitos!')
