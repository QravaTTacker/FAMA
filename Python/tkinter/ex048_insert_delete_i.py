from tkinter import Tk, Button, Entry, END, NORMAL, DISABLED, ACTIVE, CENTER

i = 0
linha = 1
abc = 'abcdefghijklmnopqrstuvwxyz'


def mudar(opc):
    if opc:
        global i, abc, linha
        var, j = '', i
        while i < (j + 1):
            var = abc[i]
            i += 1
        if var == 'z':
            btn['state'] = DISABLED
        ent['state'] = NORMAL
        ent.insert(END, f'{var}')
        ent['state'] = DISABLED
    else:
        ent['state'] = NORMAL
        ent.delete(0, END)
        ent['state'] = DISABLED
        btn['state'] = ACTIVE
        i = 0


root = Tk()
ent = Entry(width=len(abc)+2, justify=CENTER, state=DISABLED)
btn = Button(text='Add', command=lambda: mudar(True))
btn2 = Button(text='Del', command=lambda: mudar(False))
ent.pack(pady=20, padx=30)
btn.pack(pady=10)
btn2.pack(pady=10)
root.mainloop()
