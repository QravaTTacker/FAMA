from tkinter import *

root = Tk()

lbl_r = Label(text='RIGHT')
lbl_l = Label(text='LEFT')
lbl_c = Label(text='CENTER')

ent_r = Entry(justify=RIGHT)
ent_l = Entry(justify=LEFT)
ent_c = Entry(justify=CENTER)

lbl_r.grid(row=0, column=0, padx=10, pady=10)
lbl_l.grid(row=1, column=0, padx=10, pady=10)
lbl_c.grid(row=2, column=0, padx=10, pady=10)

ent_r.grid(row=0, column=1, padx=10, pady=10)
ent_l.grid(row=1, column=1, padx=10, pady=10)
ent_c.grid(row=2, column=1, padx=10, pady=10)

root.mainloop()
