from tkinter import *


def tipo():
    lbl['text']=f'{type(ent.get())}'
    # lbl['text'] = f' ent.get() -> {type(ent.get())}\n var.get() -> {type(var.get())}'


root = Tk()
var = IntVar()

ent = Entry()
ent.pack(padx=20)

btn = Button(text='click me', command=tipo)
btn.pack(padx=10)

lbl = Label(font='consolas 15 bold')
lbl.pack(padx=10)

root.mainloop()
