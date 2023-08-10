from tkinter import *

pp = Tk()
pp.title('Pack no centro')
pp['bg'] = '#454545'
lbl = Label(master=pp,
            text='Olá mundo',
            font='Arial 15 bold',
            bg='#454545',
            fg='#aaffaa',
            relief=SOLID,
            border=2,
            padx=10,
            pady=10)
lbl.pack(padx=40, pady=40)

pp.mainloop()
