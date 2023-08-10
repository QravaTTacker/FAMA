from tkinter import Tk, Label, Button, Spinbox, IntVar

jp = Tk()
jp.title('Tabuada GUI')
jp.geometry('280x310+550+150')
var = IntVar()
var.set(1)


def tabuada():
    resultado = '\n'
    x = var.get()
    for i in range(1, 11):
        resultado += f'{i} x {x} = {i * x}\n'
    Label(jp, text=resultado, width=35).place(x=15, y=100)


Spinbox(jp, textvariable=var, from_=-100, to=100, increment=1).place(x=80, y=35)
Button(jp, text='Calcular', command=tabuada).place(x=110, y=70)
jp.mainloop()
