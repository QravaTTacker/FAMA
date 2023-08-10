from tkinter import *


def mudarValor(op):
    global x
    if op == '+':
        x += 1
    else:
        x -= 1
    lbl_valor['text'] = f'{x}'
    converterBase(ultima_op)


def converterBase(base):
    global ultima_op
    if base == 'hex':
        lbl_resultado['text'] = f'{hex(x)[:]}'
        ultima_op = 'hex'
        btn_hex['bd'] = 1
        btn_bin['bd'] = btn_oct['bd'] = 0
    elif base == 'bin':
        lbl_resultado['text'] = f'{bin(x)[:]}'
        ultima_op = 'bin'
        btn_bin['bd'] = 1
        btn_hex['bd'] = btn_oct['bd'] = 0
    else:
        lbl_resultado['text'] = f'{oct(x)[:]}'
        ultima_op = 'oct'
        btn_oct['bd'] = 1
        btn_bin['bd'] = btn_hex['bd'] = 0


root = Tk()
root['bg'] = '#202020'
root.title('Button II')
root.geometry('400x280+450+150')
root.resizable(height=False, width=False)
root.iconbitmap('C:/Users/Cristian Pessotto/OneDrive/Documentos/3. Faculdades/1. Faculdade - [FAMA]/3. Códigos/3. Linguagem Python/04_python_tkinter/img/geo.ico')

x = 0
ultima_op = 'bin'

# -----------------------------------------------> Labels
lbl_titulo = Label(root,
                text='Conversor de base numérica',
                font='ivy 15 bold',
                foreground='#ddffdd',
                background=root['bg'])
lbl_titulo.pack(side=TOP, pady=10, padx=20, anchor=CENTER)
lbl_valor = Label(root,
                text=f'{x}',
                font='ivy 14 bold',
                foreground='#ffffff',
                background=root['bg'])
lbl_valor.pack(side=TOP, pady=30, anchor=CENTER)
lbl_resultado = Label(root,
                text=f'x',
                font='ivy 14 bold',
                foreground='#ffffff',
                background=root['bg'])
lbl_resultado.pack(side=BOTTOM, pady=30, anchor=N)
# -----------------------------------------------> Botões de bases
btn_hex = Button(root,
                text='Hexadecimal',
                font='ivy 12 bold',
                foreground='#9999ff',
                background=root['bg'],
                borderwidth=0,
                command=lambda: converterBase('hex'))
btn_hex.pack(side=LEFT, padx=20, pady=5, anchor=N)
btn_bin = Button(root,
                text='Binário',
                font='ivy 12 bold',
                foreground='#99ff99',
                background=root['bg'],
                borderwidth=1,
                command=lambda: converterBase('bin'))
btn_bin.pack(side=LEFT, padx=15, pady=5, anchor=N)
btn_oct = Button(root,
                text='Octodecimal',
                font='ivy 12 bold',
                foreground='#ffdd99',
                background=root['bg'],
                borderwidth=0,
                command=lambda: converterBase('oct'))
btn_oct.pack(side=LEFT, padx=20, pady=5, anchor=N)
# -----------------------------------------------> Botões de [+] e [-]
btn_aumentar = Button(root,
                text='+',
                font='ivy 11 bold',
                foreground='#00ff11',
                background=root['bg'],
                bd=0,
                width=3,
                command=lambda: mudarValor('+'))
btn_aumentar.place(x=95, y=80)
btn_diminuir = Button(root,
                text='-',
                font='ivy 11 bold',
                foreground='#ff0011',
                background=root['bg'],
                bd=0,
                width=3,
                command=lambda: mudarValor('-'))
btn_diminuir.place(x=269, y=80)
root.mainloop()
