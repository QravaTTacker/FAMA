from tkinter import *
janela = Tk()
janela.title('Resizable')
janela['bg'] = '#000000'
janela.geometry('400x400+500+100')
janela.resizable(False, False)
# janela.resizable(height=True, width=False)
janela.mainloop()
