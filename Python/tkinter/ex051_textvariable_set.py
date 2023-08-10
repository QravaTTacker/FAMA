from tkinter import Tk, StringVar, IntVar, DoubleVar, BooleanVar, Entry

root = Tk()
nome = StringVar()
nome.set('Cristian')
idade = IntVar()
idade.set(15)
peso = DoubleVar()
peso.set(55.5)
estado = BooleanVar()
estado.set(True)

ent_nome = Entry(font=('Arial', 20, 'bold', 'italic'), textvariable=nome)
ent_idade = Entry(font='Arial 20 bold', textvariable=idade)
ent_peso = Entry(font='Arial 20 bold', textvariable=peso)
ent_bool = Entry(font='Arial 20 bold', textvariable=estado)

ent_nome.pack(padx=(30, 50), pady=10)
ent_idade.pack(padx=(30, 50), pady=10)
ent_peso.pack(padx=(30, 50), pady=10)
ent_bool.pack(padx=(30, 50), pady=10)

root.mainloop()
