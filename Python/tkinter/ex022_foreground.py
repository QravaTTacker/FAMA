from tkinter import *
root = Tk()
root.geometry('200x150+550+100')
root.title('FG')
root.resizable(width=False, height=False)
root.config(background='#151515')
l1 = Label(root, text='Geek', foreground='#00ff33', bg=root['bg'])
l1.pack(pady=50)
root.mainloop()
