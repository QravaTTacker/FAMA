a = 5
b = a
print(a == b)
print(a is b, end='\n\n')


a = [1, 2, 3]
b = [1, 2, 3] # a[0:len(a)]
print(a == b)
print(a is b)

b.append(4)
print(a, b, sep='\n', end='\n\n')


a = ['a', 'b', 'c']
b = a
print(a == b)
print(a is b)

b.append('d')
print(a, b, sep='\n')
