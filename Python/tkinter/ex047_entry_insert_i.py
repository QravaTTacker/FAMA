from tkinter import *
from math import trunc


def inserir():
    var = 'Olá'
    ent.insert(0, var)
    ent['width'] = len(ent.get())*trunc(3/2)


root = Tk()
frm = Frame()
frm.pack(padx=10, pady=10)
ent = Entry(master=frm, justify=CENTER)
ent.pack(pady=10)
btn = Button(master=frm, text='Olá', command=inserir)
btn.pack(pady=10)
root.mainloop()
