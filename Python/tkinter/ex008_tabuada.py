from tkinter import *


def tabuada():
    k = 0
    x = valor.get()
    for i in range(1, 11):
        result = Label(pp, 
                        bg='#000000', 
                        fg='#00ff00', 
                        text=f' {i} × {x:,} = {i*x:,}', 
                        width=49)
        result.place(x=20, y=(120 + k))
        k += 20


pp = Tk()
pp.title('Tabuada')
pp['bg'] = '#000000'
pp.resizable(False, False)
# pp.iconbitmap('img/math.ico')

valor = IntVar()
valor.set(1)

msg1 = Label(pp, 
            bg='#000000', 
            fg='#00ff00', 
            text='Informe um número: ')
msg1.place(x=20, y=20)

entrada1 = Spinbox(pp, 
                    bg='#000000', 
                    fg='#00ff00',
                    textvariable=valor, 
                    from_=-100, to=100, increment=1)
entrada1.place(x=130, y=50)

bt = Button(pp, 
            bg='#000000', 
            fg='#00ff00', 
            text='Calcular', 
            command=tabuada)
bt.place(x=170, y=80)

# Deixa a janela no centro do vídeo...
largura = 400
altura = 350
pox = pp.winfo_screenwidth()/2 - largura/2
poy = pp.winfo_screenheight()/2 - altura/2
pp.geometry('%dx%d+%d+%d' % (largura, altura, pox, poy-30))
pp.mainloop()
