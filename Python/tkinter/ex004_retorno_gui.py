from tkinter import *
from os import system

# Funções para contas aritméticas
system('cls')
def soma():
    x = float(scan1.get())
    y = float(scan2.get())
    resultado['text'] = f'{x+y:,.2f}'


def sub():
    x = float(scan1.get())
    y = float(scan2.get())
    resultado['text'] = f'{x-y:,.2f}'


def multi():
    x = float(scan1.get())
    y = float(scan2.get())
    resultado['text'] = f'{x*y:,.2f}'


def div():
    x = float(scan1.get())
    y = float(scan2.get())
    resultado['text'] = f'{x/y:,.2f}'


root = Tk()

# Mensagens na tela
lb1 = Label(root, text='Primeiro valor:', font=('times', 15), width=12, height=1, bg='white')
lb1.place(x=30, y=34)
lb2 = Label(root, text='Segundo valor:', font=('times', 15), width=12, height=1, bg='white')
lb2.place(x=30, y=73)
resultado = Label(root, font=('times', 15), width=26, height=1, bg='white')
resultado.place(x=105, y=130)

# Entrada de dados
scan1 = Entry(root, font='times 20', foreground='#ff0000')
scan1.place(x=170, y=30)
scan2 = Entry(root, font=('times', 20))
scan2.place(x=170, y=70)

# Evento das operações
b1 = Button(root, text='Somar', font=('time', 10), width=10, command=soma)
b1.place(x=105, y=190)
b2 = Button(root, text='Subtrair', font=('time', 10), width=10, command=sub)
b2.place(x=205, y=190)
b3 = Button(root, text='Multiplicar', font=('time', 10), width=10, command=multi)
b3.place(x=305, y=190)
b4 = Button(root, text='Divisão', font=('time', 10), width=10, command=div)
b4.place(x=105, y=230)

# Config da root (janela)
root['bg'] = 'black'
root.geometry('500x350+480+150')
root.title("Operações Básicas")
root.mainloop()
