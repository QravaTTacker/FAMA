from tkinter import *
janela = Tk()
janela['bg'] = '#343434'
janela.title('Anchor')
janela.resizable(False, False)
janela.geometry('300x200+450+150')
l1 = Label(janela, text='O', width=6, height=3, anchor=SE)
l1.pack(pady=70)
janela.mainloop()
