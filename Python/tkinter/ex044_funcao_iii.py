from tkinter import Tk, Label, Button, LEFT, TOP
from functools import partial

alterar = [0, 0, 0, 0]


def estilo(op):
    global alterar
    if op == 1:
        if alterar[0] % 2 == 0:
            lbl['font'] += ' bold'
        else:
            lbl['font'] = str(lbl['font']).replace(' bold', '')
        alterar[0] += 1
    elif op == 2:
        if alterar[1] % 2 == 0:
            lbl['font'] += ' italic'
        else:
            lbl['font'] = str(lbl['font']).replace(' italic', '')
        alterar[1] += 1
    elif op == 3:
        if alterar[2] % 2 == 0:
            lbl['font'] += ' underline'
        else:
            lbl['font'] = str(lbl['font']).replace(' underline', '')
        alterar[2] += 1
    elif op == 4:
        if alterar[3] % 2 == 0:
            lbl['font'] += ' overstrike'
        else:
            lbl['font'] = str(lbl['font']).replace(' overstrike', '')
        alterar[3] += 1
    print(lbl['font'])


root = Tk()
a12 = 'Arial 12'
lbl = Label(text='Olá Mundo!', font=a12)

b1 = Button(text='Negrito')
b1['command'] = partial(estilo, 1)

b2 = Button(text='Itálico', command=lambda: estilo(2))
b3 = Button(text='Sublinhado', command=lambda: estilo(3))
b4 = Button(text='Tachado', command=lambda: estilo(4))
print(lbl['font'])
lbl.pack(side=TOP, pady=10)
b1.pack(side=LEFT, padx=10, pady=10)
b2.pack(side=LEFT, padx=10, pady=10)
b3.pack(side=LEFT, padx=10, pady=10)
b4.pack(side=LEFT, padx=10, pady=10)
root.mainloop()
