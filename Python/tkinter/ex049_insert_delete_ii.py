from tkinter import *


def strEntry(opc):
    global var
    if opc:
        ent.insert(END, f' {var}')
        var += 1
    elif len(ent.get()) >= 1:
        ent.delete(len(ent.get())-len(ent.get().split()[-1])-1, END)
    btn_add['text'] = f'Adicionar {var}'
    if ent.get():
        btn_del['text'] = f'Deletar {ent.get().split()[-1]}'
    else:
        btn_del['text'] = f'Deletar'


def var0():
    global var 
    var = 1
    btn_add['text'] = f'Adicionar {var}'


root = Tk()
root.config(bg='#454545')
root.title('Entry')
root.geometry('350x200+450+100')
var = 1

ent = Entry(font='ivy 20 bold', bd=3, relief=SOLID, width=20)
ent.pack(pady=20)
ent.insert(0, '0')

btn_add = Button(text=f'Adicionar {var}', command=lambda: strEntry(True))
btn_add.pack()

btn_del = Button(text=f'Deletar', command=lambda: strEntry(False))
btn_del.pack(pady=10)

bnt_var = Button(text='Var = 1', command=var0)
bnt_var.pack()

root.mainloop()
