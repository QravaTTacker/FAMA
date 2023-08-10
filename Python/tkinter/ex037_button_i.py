from tkinter import *


def aumentarValor():
    global x
    x += 1
    lbl_valor['text'] = x


def diminuirValor():
    global x
    x -= 1
    lbl_valor['text'] = x



root = Tk()
root.title('Button')
root.config(bg='#202020')
root.geometry('300x200+450+150')
root.resizable(width=False, height=False)
root.iconbitmap('C:/Users/Cristian Pessotto/OneDrive/Documentos/3. Faculdades/1. Faculdade - [FAMA]/3. Códigos/3. Linguagem Python/04_python_tkinter/img/math.ico')

x = 0

lbl_valor = Label(root,
                    text=x,
                    font='consolas 12 bold',
                    fg='#ffff55', 
                    bg=root['bg'])
lbl_valor.pack(side=TOP, pady=35)

btn_aumentar = Button(root,
                        text='+1',
                        font='consolas 15 bold',
                        fg='#00ff00',
                        bg='#404040',
                        relief=SOLID,
                        borderwidth=1,
                        command=aumentarValor)
btn_aumentar.pack(side=LEFT, padx=50, anchor=N)

btn_diminuir = Button(root,
                        text='-1',
                        font='consolas 15 bold',
                        fg='#ff0000',
                        bg='#404040',
                        relief=SOLID,
                        borderwidth=1,
                        command=diminuirValor)
btn_diminuir.pack(side=RIGHT, padx=50, anchor=N)

root.mainloop()
