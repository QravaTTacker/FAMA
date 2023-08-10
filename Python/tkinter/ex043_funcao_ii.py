from tkinter import *
from functools import partial


def mCor(cor):
    if cor == 1:
        lbl['fg'] = 'Red'
    elif cor == 2:
        lbl['fg'] = 'Orange'
    elif cor == 3:
        lbl['fg'] = 'Yellow'
    elif cor == 4:
        lbl['fg'] = 'Green'
    elif cor == 5:
        lbl['fg'] = 'Blue'


root = Tk()
root.title('Função Com Parâmetros')
lbl = Label(text='Olá, Mundo!')
b1 = Button(text='Vermelho')

b1['command'] = partial(mCor, 1)

b2 = Button(text='Laranja', command=lambda: mCor(2))
b3 = Button(text='Amarelo', command=lambda: mCor(3))
b4 = Button(text='Verde', command=lambda: mCor(4))
b5 = Button(text='Azul', command=lambda: mCor(5))

lbl.pack(side=TOP, pady=10)
b1.pack(side=LEFT, padx=10, pady=10)
b2.pack(side=LEFT, padx=10, pady=10)
b3.pack(side=LEFT, padx=10, pady=10)
b4.pack(side=LEFT, padx=10, pady=10)
b5.pack(side=LEFT, padx=10, pady=10)
root.mainloop()
