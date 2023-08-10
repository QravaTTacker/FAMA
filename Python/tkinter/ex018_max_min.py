from tkinter import *
janela = Tk()
janela.title('Max e Min')
janela['bg'] = '#000000'
# Permite maximizar a janela até 400 pixels na vertical (largura) e 400 para horizontal (altura)
janela.maxsize(400, 400)
# Permite minimizar a janela até 250 pixels na vertical (largura) e 250 para horizontal (altura)
janela.minsize(250, 250)
L = H = 300
pox = janela.winfo_screenwidth()/2 - L/2
poy = janela.winfo_screenheight()/2 - H/2
janela.geometry('%dx%d+%d+%d' % (L, H, pox, poy-50) )
janela.mainloop()
