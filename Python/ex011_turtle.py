from lib.validar import validar_triangulo
from lib.myMath import angulatura as angulo, tipo_triangulo
import turtle as t

# Programa principal
while True:
    try:
        A = float(input(' A = '))
        B = float(input(' B = '))
        C = float(input(' C = '))
        if validar_triangulo(A, B, C):
            print(f' {tipo_triangulo(A, B, C)}')
            break
        print(' Esses valores não permitem formar um triângulo...')
    except ValueError:
        print(' Informe um valor numérico...')

# Definições iniciais
passos = t.Turtle()
tela = t.Screen()
tela.setup(800, 500)
tela.bgcolor('#000000')
passos.color('#7334d1', '#9944c7')
passos.pensize(3)

# Posicionamento do pincel
passos.pu()
passos.goto(-100, -100)
passos.pendown()

# Criação do triângulo
passos.begin_fill()
passos.fd(A * 45)
passos.lt(180 - angulo(s1=A, s2=B, oposto=C))
passos.fd(B * 45)
passos.lt(180 - angulo(s1=B, s2=C, oposto=A))
passos.fd(C * 45)
passos.end_fill()

# mainloop
t.done()
