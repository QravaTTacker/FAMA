from tkinter import *
janela = Tk()
largura = 450
altura = 300
# winfo_screenwidth() -> capta a largura do vídeo
# winfo_screenheight() -> capta a altura do vídeo
px = int(janela.winfo_screenwidth()/2 - largura/2)
py = int(janela.winfo_screenheight()/2 - altura/2)
janela.geometry(f'{largura}x{altura}+{px}+{py}')
# janela.geometry('%dx%d+%d+%d' % (largura, altura, px, py))
janela.config(bg='#343434')
janela.iconbitmap('img/ttt.ico')
janela.resizable(False, False)
janela.mainloop()
