from tkinter import *


def tabuada():
    try:
        x = valor.get()
        if -100000000.0 < x < 100000000.0:
            for i in range(1, 11):
                result = Label(pp,
                                bg='#000000',
                                fg='#00ff00',
                                bd=4,
                                relief='sunken',
                                width=29,
                                text=f' {i} × {x:} = {i*x:b}')
                result.grid(row=(i-1), column=1)
        else:
            result = Label(pp,
                           bg='#000000',
                           fg='#00ff00',
                           bd=4,
                           relief='sunken',
                           width=29,
                           text=' Passou do valor limite :/')
            result.grid(row=0, column=1)
    except TclError:
        result = Label(pp,
                       bg='#000000',
                       fg='#00ff00',
                       bd=4,
                       relief='sunken',
                       width=29,
                       text=' Digite um valor numérico!')
        result.grid(row=0, column=1)


pp = Tk()
pp.title('Tabuada Com Grid')
pp['bg'] = '#000000'
pp.resizable(False, False)

valor = IntVar()
valor.set(1)

entrada1 = Spinbox(pp,
                    bg='#000000', 
                    fg='#00ff00',
                    textvariable=valor,
                    from_=-100, to=100, increment=1)
entrada1.grid(row=0, column=0)

bt = Button(pp, 
            bg='#000000', 
            fg='#00ff00', 
            text='Calcular', 
            command=tabuada)
bt.grid(row=1, column=0)

largura = 350
altura = 251
pox = pp.winfo_screenwidth() / 2 - largura / 2
poy = pp.winfo_screenheight() / 2 - altura /2
pp.geometry('%dx%d+%d+%d' % (largura, altura, pox, poy-30))
pp.mainloop()
