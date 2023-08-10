from tkinter import *

mudar_cor = 1


def alterarCor():
    global mudar_cor
    if mudar_cor == 1:
        btn['bg'] = 'red'
    elif mudar_cor == 2:
        btn['bg'] = 'Orange'
    elif mudar_cor == 3:
        btn['bg'] = 'Yellow'
    elif mudar_cor == 4:
        btn['bg'] = 'Green'
    elif mudar_cor == 5:
        btn['bg'] = 'Blue'
    mudar_cor += 1
    if mudar_cor == 6:
        mudar_cor = 1  


root = Tk()
root.geometry('200x100')
root.resizable(width=False, height=False)
btn = Button(text='Alterar cor', command=alterarCor)
btn.pack(pady=35)
root.mainloop()
