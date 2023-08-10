from tkinter import Tk, Button, Label, PhotoImage, SOLID
from PIL import ImageTk, Image
vez = True
var_cor = 0


def click_cor():
    global var_cor
    if var_cor == 0:
        lbl['fg'] = '#ff4545',
        btn['image'] = star
    elif var_cor == 1:
        lbl['fg'] = '#f5aa31'
        btn['image'] = alg
    elif var_cor == 2:
        lbl['fg'] = '#ffff55'
        btn['image'] = py
    elif var_cor == 3:
        lbl['fg'] = '#5aeb3d'
        btn['image'] = cosmos
    elif var_cor == 4:
        lbl['fg'] = '#3142de'
        btn['image'] = cat2
    elif var_cor == 5:
        lbl['fg'] = '#9331de'
        btn['image'] = anime
    else:
        lbl['fg'] = '#de31d2'
        btn['image'] = cat
    var_cor += 1
    if var_cor == 7:
        var_cor = 0
    lbl.pack(pady=50)
    pp.after(350, click_cor)


def vezes():
    global vez
    if vez:
        click_cor()
        vez = False


pp = Tk()
pp.geometry('500x500+450+60')
pp.resizable(False, False)
pp['bg'] = '#202020'

py = PhotoImage(file=r'04_python_tkinter\img\Python.png')
cosmos = ImageTk.PhotoImage(Image.open(r'04_python_tkinter\img\thumb.jpg'))
cat2 = ImageTk.PhotoImage(Image.open(r'04_python_tkinter\img\gatinho.jpg'))
anime = ImageTk.PhotoImage(Image.open(r'04_python_tkinter\img\photo.jpg'))
alg = ImageTk.PhotoImage(Image.open(r'04_python_tkinter\img\SOFTWARE-MEDIDA.jpg'))
star = ImageTk.PhotoImage(Image.open(r'04_python_tkinter\img\star.jpg'))
cat = PhotoImage(file=r'04_python_tkinter\img\cat_button.png')

btn = Button(master=pp, image=cat, width=280, height=280, bd=0, relief=SOLID, command=vezes)
btn.pack(pady=10)
lbl = Label(master=pp, text='Salve meu chegado', font='consolas 20 bold', bg=pp['bg'])

pp.mainloop()
