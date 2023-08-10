from tkinter import *
from os import system
# from tkinter.messagebox import showinfo
system('cls')


def msg():
    lb['text'] = 'Funcionou!!'


janela = Tk()

Button(janela, width=20, text='OK', command=msg).place(x=100, y=100)
lb = Label(janela, text='Teste')
lb.place(x=100, y=150)
# msg.showinfo('Título')

janela.title('Button e Label')
janela.geometry('350x350+800+500')
janela.mainloop()
