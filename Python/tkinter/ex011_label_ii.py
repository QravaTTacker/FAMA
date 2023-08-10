from tkinter import *
from tkinter.font import BOLD

# Qualidades da página principal
root = Tk()
root.title('Configurando Um Label')
root.resizable(False, False)
root['bg'] = '#a9a9a9'

# widget -> Componente gráfico
# Definição e configuração

lb1 = Label(root,
            bg='#999999', 
            fg='#00ff00', 
            font=('Times', 20, BOLD), 
            text='Label I',
            width=20,
            height=2,
            relief='solid',
            bd=5)

lb2 = Label(root,
            bg='#999999',
            fg='#ff0000',
            font='Courier 20 bold italic',
            text='Label II',
            width=20,
            height=2,
            relief='groove',
            bd=5)

lb3 = Label(root,
            bg='#999999',
            fg='#ff9900',
            font='Arial 20 bold italic underline',
            text='Label III',
            width=20,
            height=2,
            relief='flat',
            bd=5)

lb4 = Label(root, 
            bg='#999999', 
            fg='#0000ff', 
            font='Panda 20 bold italic overstrike', 
            text='Label IV',
            width=20,
            height=2,
            relief='ridge',
            bd=5)

lb5 = Label(root, 
	        bg='#999999', 
            fg='#ffff00', 
            font='Garamond 20 bold italic underline overstrike', 	
            text='Label V', 
            width=20, 
            height=2, 	
            relief='sunken', 
            bd=5)


lb6 = Label(root,
            background='#999999',
            foreground='#ff99cc',
            font='Times 20 bold',
            text='Label VI',
            width=20,
            height=2,
            relief='raised',
            border=5)

# Fontes válidas: Times, Arial, Courier, Garamond
# bold (negrito), italic (itálico), underline (sublinhado) e overstrike (tachado)
# width -> Largura do widget
# height -> Altura do widget
# relief -> Tipo de borda do widget (solid, groove, flat, ridge, raised e sunken)

# Gerenciadores de Layout (Distribuição física dos widget)
lb1.pack()
lb2.pack()
lb3.pack()
lb4.pack()
lb5.pack()
lb6.pack()

# place()
# pack()
# grind()

lado = 600
altura = 500
pox = root.winfo_screenwidth()/2 - lado/2
poy = root.winfo_screenheight()/2 - altura/2
root.geometry('%dx%d+%d+%d' % (lado, altura, pox, poy-30))
root.mainloop()
