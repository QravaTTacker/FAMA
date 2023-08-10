from tkinter import *
root = Tk()
root.config(bg='#343434')
root.title('Anchor')
root.resizable(width=False, height=False)
l1 = Label(root, 
        text='Anchor determina a\nposição que nosso texto\nficará sobre o widget', 
        font='Times 15 bold italic',
        bg='#555555',
        fg='#00ff33',
        bd=3,
        relief='solid',
        width=20,
        height=3,
        anchor=NW,
        justify=LEFT,
        padx=10,
        pady=20)
l1.pack(pady=100)
L = 500
H = 350
px = int(root.winfo_screenwidth()/2 - L/2)
py = int(root.winfo_screenheight()/2 - H/2) - 50
root.geometry(f'{L}x{H}+{px}+{py}')
root.mainloop()
