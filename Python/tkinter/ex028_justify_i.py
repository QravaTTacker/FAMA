from tkinter import *
root = Tk()
root.title('Justify')
root['bg'] = '#343434'
root.resizable(False, False)
root.geometry('450x250+450+150')
frase = '''O parâmetro justify é responsável\npor alinhar o texto!'''
l1 = Label(root, text=frase, font='arial 14', bg='#aaaaaa', justify=CENTER)
l2 = Label(root, text=frase, font='arial 14', bg='#aaaaaa', justify=RIGHT)
l3 = Label(root, text=frase, font='arial 14', bg='#aaaaaa', justify=LEFT)
l1.pack(pady=20)
l2.pack(pady=10)
l3.pack(pady=20)
root.mainloop()
