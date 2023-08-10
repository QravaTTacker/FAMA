from tkinter import *

root = Tk()
root.geometry('400x400')
root.config(bg='#353535')
root.title('Gerenciador Pack')
root.minsize(145, 95)

lbl1 = Label(root, 
            text='Label I', 
            font='courier 15 bold', 
            width=10, 
            height=3, 
            bg='#ffcc00', 
            bd='3', 
            relief=SOLID)
lbl2 = Label(root, 
            text='Label II', 
            font='courier 15 bold', 
            width=10, 
            height=3, 
            bg='#ff3300', 
            bd='3', 
            relief=SOLID)
lbl3 = Label(root, 
            text='Label III', 
            font='courier 15 bold', 
            width=10, 
            height=3, 
            bg='#55ff00', 
            bd='3', 
            relief=SOLID)
lbl4 = Label(root, 
            text='Label IV', 
            font='courier 15 bold', 
            width=10, 
            height=3, 
            bg='#0055ff', 
            bd='3', 
            relief=SOLID)

# Como o Label 1 e 4 tem prioridade sobre o Label 2 e 3, a sua geometria não será alterada.
# Por outro lado, o Label 1 tem prioridade sobre o Label 4...
# ...isso irá definir que a geometria o Label 4 será sujeita à alterações

# A prioridade em um widget sobre o outro é determinada pela distribuição do pack

lbl1.pack(side=TOP, pady=8)
lbl4.pack(side=BOTTOM, pady=8)
lbl2.pack(side=LEFT, padx=8)
lbl3.pack(side=RIGHT, padx=8)

for item in lbl1.keys():
    print(f' {item} -> {lbl1[item]}')

root.mainloop()
