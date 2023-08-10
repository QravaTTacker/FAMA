from tkinter import Tk, Label

root = Tk()
root.title('Place')
root['bg'] = '#aaddaa'
root.geometry('300x200+100+100')

lbl = Label(master=root, 
            text='Coé meu nobre', 
            foreground='#000000',
            font=('Courier', 15, 'bold'),
            background=root['bg'])
lbl.place(x=50, y=150)

lbl_i = Label(master=root, 
            text='Coé meu nobre', 
            foreground='#000000',
            font=('Courier', 15, 'bold'),
            background=root['bg'])
lbl_i.place(x=285, y=175)

root.mainloop()
