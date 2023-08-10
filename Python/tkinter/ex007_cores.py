from functools import partial
from time import sleep
from tkinter import *

def mudar(b):
    if b == 1:
        lb['fg'] = bt1['fg']
    elif b == 2:
        lb['fg'] = bt2['fg']
    elif b == 3:
        lb['fg'] = bt3['fg']
    else:
        lb['fg'] = bt4['fg']


pp = Tk()
pp.geometry('630x350+340+180')
pp.title('Aplicação 2.0')
# pp.iconbitmap('img/Icon2.ico')
pp['bg'] = '#000000'
pp.resizable(0, 0)

lb = Label(pp, text='Funcionalidades de um botão e ventos', 
font='courier 14 italic', fg='#ffffff', bg='#000000')
lb.place(x=110, y=80)

bt1 = Button(pp, text='Mudar de cor', font='courier 14 italic bold', bg='#edf2ef', fg='#ff3600')
bt1['command'] = partial(mudar, 1)
bt1.place(x=160, y=200)

bt2 = Button(pp, text='Mudar de cor', font='courier 14 italic bold', bg='#edf2ef', fg='#008000')
bt2['command'] = partial(mudar, 2)
bt2.place(x=310, y=200)

bt3 = Button(pp, text='Mudar de cor', font='courier 14 italic bold', bg='#edf2ef', fg='#ff00ff')
bt3['command'] = partial(mudar, 3)
bt3.place(x=160, y=240)

bt4  = Button(pp, text='Mudar de cor', font='courier 14 italic bold', bg='#edf2ef', fg='#edcf39')
bt4 ['command'] = partial(mudar, 4)
bt4.place(x=310, y=240)

# bt3 = Button(pp, text='Mudar de cor', font='courier 14 italic bold', bg='#edf2ef', fg='purple')
# bt3['command'] = partial(mudar, bt3)
# bt3.place(x=240, y=240)

pp.mainloop()
