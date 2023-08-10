from tkinter import *
# from tkinter import messagebox
# from functools import partial
import os
os.system('cls')

root = Tk()
root.title('Retorno Idade')
root.geometry('350x200+400+200')
root['bg'] = '#000000'

def janela2(msg):
    pp = Tk()
    pp.title(' Tela de Mensagem ')
    pp.geometry('250x180+450+200')
    pp['bg'] = '#000000'
    lb7 = Label(pp, text = msg, fg = '#00ff00', bg = '#000000')
    lb7.place(x = 10, y = 10)
    pp.mainloop()


def idade():
    x = num.get()
    if 1 <= x <= 12:
        msg2['text'] = 'Criança'
        janela2('Criança')
    elif 12 < x <= 18:
        msg2['text'] = 'Adolescente'
        janela2('Adolescente')
    elif 18 < x <= 50:
        msg2['text'] = 'Adulto'
        janela2('Adulto')
    elif 50 < x <= 140:
        msg2['text'] = 'Idoso'
        janela2('Idoso')
    else:
        msg2['text'] = 'Você está vivo?'
        janela2('Você está vivo?')


num = IntVar()
num.set(1)

msg1 = Label(root, text = 'Informe a sua idade abaixo: ', fg = '#00ff00', bg = '#000000')
msg2 = Label(root, text = '....', fg = '#00ff00', bg = '#000000')

# entrada = Entry(root, textvariable = num)
entrada = Spinbox(root, textvariable=num, from_=1, to=150, increment=1)
bt = Button(root, text = 'click', fg = '#00ff00', bg = '#000000', command = idade)

bt.place(x = 140, y = 90)
entrada.place(x = 95, y = 50)
msg1.place(x = 80, y = 15)
msg2.place(x = 80, y = 130)

root.mainloop()
