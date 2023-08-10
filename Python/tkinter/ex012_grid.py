from tkinter import *

pp = Tk()
pp.title('Layout Grid')
pp['bg'] = '#a9a9a9'
pp.resizable(False, False)

nome = StringVar()
nome.set('Seu nome')
cpf = IntVar()
rg = IntVar()

lb1 = Label(pp,
            text='Nome: ',
            bg = '#a9a9a9',
            font = 'Times 15 bold'
            )

lb2 = Label(pp,
            text='CPF: ',
            bg = '#a9a9a9',
            font = 'Times 15 bold'
            )

lb3 = Label(pp,
            text='RG: ',
            bg = '#a9a9a9',
            font = 'Times 15 bold'
            )

ety1 = Entry(pp,
            textvariable=nome,
            bd=4,
            relief='sunken'
            )

ety2 = Entry(pp,
            textvariable=cpf,
            bd=4,
            relief='sunken'
            )

ety3 = Entry(pp,
            textvariable=rg,
            bd=4,
            relief='sunken'
            )

lb1.grid(row=0, column=0)
lb2.grid(row=1, column=0)
lb3.grid(row=2, column=0)
ety1.grid(row=0, column=1, pady=5)
ety2.grid(row=1, column=1, pady=5)
ety3.grid(row=2, column=1, pady=5)

largura = 230
altura = 150
pox = pp.winfo_screenwidth()/2 - largura/2
poy = pp.winfo_screenheight()/2 - altura/2
pp.geometry('%dx%d+%d+%d' % (largura, altura, pox, poy-50))
pp.mainloop()
