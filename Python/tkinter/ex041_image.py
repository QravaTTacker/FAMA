from tkinter import *
from PIL import ImageTk, Image
jogo = Tk()
# pip install Pillow
# Usa-se da biblioteca PIL nos casos em que a imagem tem uma extensão diferente de png ou gif.
img1 = ImageTk.PhotoImage(Image.open(r'C:\Users\Cristian Pessotto\OneDrive\Documentos\3. Faculdades\1. Faculdade - [FAMA]\3. Códigos\3. Linguagem Python\04_python_tkinter\img\gatinho.jpg'))
img2 = PhotoImage(file=r'C:\Users\Cristian Pessotto\OneDrive\Documentos\3. Faculdades\1. Faculdade - [FAMA]\3. Códigos\3. Linguagem Python\04_python_tkinter\img\Python.png')
lbl1 = Label(jogo, bg='#aaaaaa', image=img1)
lbl2 = Label(jogo, bg='#aaaaaa', image=img2)
lbl1.pack(side=LEFT, padx=20, pady=20)
lbl2.pack(side=LEFT, padx=20, pady=20)
jogo.mainloop()
