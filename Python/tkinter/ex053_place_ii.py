from tkinter import Tk, Label, OFF

root = Tk()
root.config(bg='#000000')
root.title('Place')
root.iconbitmap(r'04_python_tkinter\img\boi.ico')
altura = 350
largura = 550
root.resizable(width=OFF, height=OFF)
pox = int(root.winfo_screenwidth()/2 -  largura/2)
poy = int(root.winfo_screenheight()/2 - altura/2)

root.geometry(f'{largura}x{altura}+{pox}+{poy}')
lbl = Label(master=root,
            text='Você',
            foreground='#00ff00',
            bg=root['bg'],
            font=('Consolas', 12, 'bold italic'))
lbl.place(x=0, y=0)

lbl2 = Label(master=root,
            text='é',
            foreground=lbl['fg'],
            background=root['background'],
            font=('consolas', 12, 'bold italic'))
lbl2.place(x=int(largura/2 - 10), y=int(altura/2 - 10))

lbl3 = Label(master=root,
            text='Corno',
            foreground='#00ff00',
            bg=root['bg'],
            font=('Consolas', 12, 'bold italic'))
lbl3.place(x=largura-50, y=altura-25)

root.mainloop()
