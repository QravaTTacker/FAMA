from tkinter import Tk, Label as L, Button, Frame as F, SOLID, TOP, NE
# from emoji import emojize

cor = vx = vy = 0
var = 1000
vez1 = True
print(f' Don: 👾🖕🤠🖕')


def mudar_valor(valor):
    if valor <= 10:
        return 1
    elif valor <= 100:
        return 10
    elif valor <= 500:
        return 50
    else:
        return 100


def velocidade(opc):
    global var, vez1
    if vez1:
        eixos()
        vez1 = False
    if opc and var > 1:
        var -= mudar_valor(var)
    elif not opc:
        var += mudar_valor(var)
    lbl['text'] = f'{int(5/(var/1000))} pixels/s'


def voltar():
    global vx, vy, cor
    vy = vx = 0
    msg1.place(x=0, y=0)
    eixos()


def rgb(opc_cor):
    global cor
    if opc_cor % 10 == 0:
        if cor == 0:
            root['bg'] = '#ff4545'
        elif cor == 1:
            root['bg'] = '#f5aa31'
        elif cor == 2:
            root['bg'] = '#ffff55'
        elif cor == 3:
            root['bg'] = '#5aeb3d'
        elif cor == 4:
            root['bg'] = '#3142de'
        elif cor == 5:
            root['bg'] = '#9331de'
        elif cor == 6:
            root['bg'] = '#de31d2'
        else:
            root['bg'] = '#aa0033'
        cor += 1
        if cor == 8:
            cor = 0


def eixos():
    global vx, vy, var
    vy += 5
    vx += 5
    rgb(vx)
    msg1.place(x=vx, y=vy)
    msg2.place(x=400-vx, y=400-vy)
    msg3.place(x=200-vx, y=110+vy)
    msg4.place(x=100+vx, y=int(300-(vy/5)))
    msg5.place(x=350-vx, y=int(200+(vy/10)))
    msg1['text'] = f'({vx};{vy})'
    msg2['text'] = f'({400-vx};{400-vy})'
    msg3['text'] = f'({200-vx};{110+vy})'
    msg4['text'] = f'({100+vx};{int(300-(vy/5))})'
    msg5['text'] = f'({350-vx};{int(200+(vy/10))})'
    root.geometry(f'600x400+{int(vx*2)}+{int(vy*0.2)}')
    if vy < 400 and var >= 1:
        root.after(1, eixos)
    elif var >= 1:
        voltar()


root = Tk()
root.title('Place')
root.geometry('600x400+0+0')
root.resizable(False, False)
root.config(background='#454545')

frm_sts = F(bg='#252525', relief=SOLID, borderwidth=2)
frm_sts.pack(side=TOP, anchor=NE, padx=10, pady=10)

lbl = L(master=frm_sts,
        text=f'0.00 pixels/s',
        font=('ivy', 10, 'bold'),
        width=15,
        relief=SOLID,
        bd=1,
        padx=10,
        pady=5)
btn_maior = Button(master=frm_sts,
                   text='+V',
                   font=('ivy', 10, 'bold'),
                   width=5,
                   relief=SOLID,
                   bd=1,
                   padx=10,
                   pady=5,
                   command=lambda: velocidade(True))
btn_menor = Button(master=frm_sts,
                   text='-V',
                   font=('ivy', 10, 'bold'),
                   width=5,
                   relief=SOLID,
                   bd=1,
                   padx=10,
                   pady=5,
                   command=lambda: velocidade(False))

lbl.grid(row=0, column=0, columnspan=2, padx=5, pady=5)
btn_maior.grid(row=1, column=0, padx=5, pady=5)
btn_menor.grid(row=1, column=1, padx=5, pady=5)

msg1 = L(master=root,
         text='(0;0)',
         font=('ivy', 13, 'bold'),
         width=10,
         relief=SOLID,
         bd=1,
         padx=5,
         pady=5)
msg2 = L(master=root,
         text='(400;400)',
         font=('ivy', 13, 'bold'),
         width=10,
         relief=SOLID,
         bd=1,
         padx=5,
         pady=5)
msg3 = L(master=root,
         text='(200;110)',
         font=('ivy', 13, 'bold'),
         width=10,
         relief=SOLID,
         bd=1,
         padx=5,
         pady=5)
msg4 = L(master=root,
         text='(100;300)',
         font=('ivy', 13, 'bold'),
         width=10,
         relief=SOLID,
         bd=1,
         padx=5,
         pady=5)
msg5 = L(master=root,
         text='(350;200)',
         font=('ivy', 13, 'bold'),
         width=10,
         relief=SOLID,
         bd=1,
         padx=5,
         pady=5)

msg1.place(x=0, y=0)
msg2.place(x=400, y=400)
msg3.place(x=200, y=110)
msg4.place(x=100, y=300)
msg5.place(x=350, y=200)

root.mainloop()
