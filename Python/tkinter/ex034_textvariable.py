from tkinter import *
window = Tk()
window.config(bg='#343434')
window.resizable(height=False, width=False)

var = StringVar()
var.set('Olá meu nobre')
lbl_dados = Label(master=window,
                    textvariable=var,
                    font='consolas 12 bold',
                    bg=window['bg'],
                    foreground='#ff5555',
                    width=20,
                    padx=5,
                    pady=5)
lbl_dados.pack(padx=20, pady=5)

var2 = str('Olá meu camarada')
lbl_dados2 = Label(master=window,
                    text=var2,
                    font='consolas 12 bold',
                    bg=window['bg'],
                    foreground='#ff5555',
                    width=20,
                    padx=5,
                    pady=5)
lbl_dados2.pack(padx=20, pady=5)
window.mainloop()
