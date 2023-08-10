from tkinter import *


def saudações():
    try:
        nome = float(ent_nome.get())
        lbl['text'] = f' Olá {nome}! :) ' # if not nome.isspace() else ' Olá! :) '
    except ValueError:
        lbl['text'] = ' Digite um número :/ '


root = Tk()
root.title('Entry')
root.config(bg='#303030')
# root.geometry('400x330+200+100')

ent_nome = Entry(font='Arial 14', fg='red')
ent_nome.pack(pady=20, padx=20)

btn = Button(text='Click me', font='Arial 14', fg='red', command=saudações)
btn.pack()

lbl = Label(font='Arial 14', fg='red', bg=root['bg'])
lbl.pack(pady=50, padx=30)

root.mainloop()
