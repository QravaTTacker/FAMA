from tkinter import *


def alterar_cor():
    global mudar_tx
    b1['fg'], l1['fg'] =  l1['fg'],  b1['fg']
    if mudar_tx % 2 == 0:
        b1['text'] = 'Mudar para\ncor roxa'
    else:
        b1['text'] = 'Mudar para\ncor verde'
    mudar_tx += 1


pp = Tk()
pp['bg'] = '#343434'
pp.title('Analisando Propriedades')
pp.resizable(height=False, width=OFF)
largura, altura, mudar_tx = 500, 260, 0
px = int(pp.winfo_screenwidth()/2 - largura/2)
py = int(pp.winfo_screenheight()/2 - altura/2) - 30
pp.geometry(f'{largura}x{altura}+{px}+{py}')

l1 = Label(pp, 
            text='Analisando as propriedades\nde um componente Label',
            font='Consolas 15 bold italic underline',
            fg='#ffaaff',
            bg='#222222',
            relief=RIDGE,
            border=5,
            width=35,
            height=5,
            anchor=NW,
            justify=LEFT,
            padx=10,
            pady=5)
l1.pack(pady=10)

b1 = Button(pp,
            text='Mudar para\ncor verde',
            font='Consolas 15 bold italic',
            fg='#aaffaa',
            bg='#222222',
            relief=RIDGE,
            border=3,
            width=10,
            height=2,
            anchor=CENTER,
            justify=CENTER,
            padx=10,
            pady=5,
            command=alterar_cor)
b1.pack(pady=10)

# A função keys() permite mostra todas as propriedade de um widget
for propriedade in l1.keys():
    print(f'{propriedade} : {l1[propriedade]}')
print('\n\n')
for propriedade in b1.keys():
    print(f'{propriedade} : {b1[propriedade]}')
pp.mainloop()
