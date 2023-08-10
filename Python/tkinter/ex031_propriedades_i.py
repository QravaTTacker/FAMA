import tkinter as tk

window = tk.Tk()
lbl = tk.Label(window, text='Analisando propriedades')

# <widget>.keys() é uma função que mostra as propriedades de um widget

for item in lbl.keys():
    print(f'{item}: {lbl[item]}')

window.mainloop()
