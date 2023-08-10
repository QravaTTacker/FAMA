from tkinter import *
root = Tk()
root.title('Gerenciador Pack & Widget Label')
root['bg'] = '#00ffff'
# root.iconbitmap('img/math.ico')

l1 = Label(root,
           bg='#00ff00',
           fg='#000000',
           text='Já é 2 da manhã\nJá é 3 da manhã',
           font='courier',
           bd=2,
           relief='solid')

l3 = Label(root,
           bg='#00ff00',
           fg='#000000',
           text='Já é 4 da manhã',
           font='times 20',
           width=20)

l2 = Label(root,
           bg='#00ff00',
           fg='#000000',
           text='Já é 5 da manhã',
           font='times 30',
           width=20,
           bd=10,
           relief='solid')

l1.pack()
l3.pack()
l2.pack()

'''
lt, lp = root.winfo_screenwidth() / 2, 450
ht, hp = root.winfo_screenheight() / 2, 300
pox, poy = lt - lp / 2, ht - hp / 2
root.geometry('%dx%d+%d+%d' % (lp, hp, pox, poy))
'''

root.mainloop()
