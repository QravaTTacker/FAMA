from tkinter import *
p = Tk()
p.title('Justify')
p.geometry('350x150+500+200')
p.resizable(width=False, height=False)
p.config(bg='#343434')

# Justify -> É responsável por justificar o texto (tanto para LEFT, RIGHT ou CENTER)

l1 = Label(p, text='Justificação\nRight', justify='right')
l2 = Label(p, text='Justificação\nLeft', justify='left')
l3 = Label(p, text='Justificação\nCenter', justify='center')
l1.pack(pady=10)
l2.pack()
l3.pack(pady=10)
p.mainloop()
