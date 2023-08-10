from tkinter import *
pp = Tk()
pp.title('Padx e Pady')
pp.config(bg='#343434')
pp.geometry('350x380+450+150')
pp.resizable(width=False, height=False)

# padx -> Determina o distanciamento do conteúdo ou do widget no ei horizontal 
# pady -> Determina o distanciamento do conteúdo ou do widget no eixo vertical

l1 = Label(pp, text='Padx = 5', font='Arial 20', padx=5)
l2 = Label(pp, text='Padx = 30', font='Arial 20', padx=30)
l3 = Label(pp, text='Pady = 5', font='Arial 20', pady=5)
l4 = Label(pp, text='Pady = 30', font='Arial 20', pady=30)
l1.pack(pady=20)
l2.pack(pady=20)
l3.pack(pady=20)
l4.pack(pady=20)
pp.mainloop()
