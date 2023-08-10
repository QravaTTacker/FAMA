from tkinter import *

pp = Tk()
pp.title('Página no Cento do Vídeo')
pp.resizable(False, False)

# Resolução da nossa página:
Lpp = 400
Hpp = 250

# Resolução do nosso sistema:
largura_t = pp.winfo_screenwidth()
altura_t = pp.winfo_screenheight()

'''
.winfo_screenwidth -> É uma função que retorna a largura do nosso vídeo (tela do pc) - Em pixels
.winfo_screenheight -> É uma função que retorna a altura do nosso vídeo (tela do pc) - Em pixels

Lt/2 - Lpp/2 = L central (pox)
Ht/2 - Hpp/2 = H cental (poy)
'''

pox = largura_t / 2 - Lpp / 2
poy = altura_t / 2 - Hpp / 2

pp.geometry('%dx%d+%d+%d' % (Lpp, Hpp, pox, poy))

# Obs: É obrigatório o uso da interpolação da versão 2 do python (uso de %)

pp.mainloop()
