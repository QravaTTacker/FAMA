from tkinter import *
janela = Tk()
janela.title('Anchor')
janela['bg'] = '#343434'
janela.geometry('+500+200')
janela.resizable(OFF, OFF)
Label(janela,
        text='NW', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=NW).grid(row=0, column=0)
Label(janela,
        text='N', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=N).grid(row=0, column=1)
Label(janela,
        text='NE', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=NE).grid(row=0, column=2)
Label(janela,
        text='W', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=W).grid(row=1, column=0)
Label(janela,
        text='CENTER', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=CENTER).grid(row=1, column=1)
Label(janela,
        text='E', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=E).grid(row=1, column=2)
Label(janela,
        text='SW', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=SW).grid(row=2, column=0)
Label(janela,
        text='S', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=S).grid(row=2, column=1)
Label(janela,
        text='SE', 
        font='Consolas 15 bold', 
        relief='solid', 
        border=2,
        width=10, 
        height=3,
        anchor=SE).grid(row=2, column=2)

# A propriedade 'anchor' aceita as constantes de:
# N -> Norte
# S -> Sul
# W -> Oeste
# E -> Leste
# NW -> Noroeste
# NE -> Nordeste
# SW -> Sudoeste
# SE -> Sudeste
# CENTER -> Centro
# Ou... as strings desses pontos cardeais. 'n', 's', 'se' etc

Label(janela, text='N', anchor=N)
Label(janela, text='S', anchor=S)
Label(janela, text='E', anchor=E)
Label(janela, text='W', anchor=W)
janela.mainloop()
