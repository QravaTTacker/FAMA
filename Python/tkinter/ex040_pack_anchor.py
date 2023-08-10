from tkinter import *

window = Tk()
window.config(bg='#ffffff')
window.title('Pack e Anchor')
window.geometry('600x300+450+150')
window.state('zoomed')

cor_center = '#00ff5d'
cor_s = '#ffdd00'
cor_n = '#ff0033'

frm_top = Frame(window, bg='#101010')
frm_bottom = Frame(window, bg='#303030')
frm_left = Frame(window, bg='#909090')
frm_right = Frame(window, bg='#505050')

lbl1 = Label(master=frm_left,
            text='LEFT -> N',
            font='courier 12 bold',
            bg=cor_n,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl2 = Label(master=frm_left,
            text='LEFT -> S',
            font='courier 12 bold',
            bg=cor_s,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl3 = Label(master=frm_left,
            text='LEFT -> CENTER',
            font='courier 12 bold',
            bg=cor_center,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)
            
lbl4 = Label(master=frm_right,
            text='RIGHT -> CENTER',
            font='courier 12 bold',
            bg=cor_center,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl5 = Label(master=frm_right,
            text='RIGHT -> N',
            font='courier 12 bold',
            bg=cor_n,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl6 = Label(master=frm_right,
            text='RIGHT -> S',
            font='courier 12 bold',
            bg=cor_s,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl7 = Label(master=frm_top,
            text='TOP -> CENTER',
            font='courier 12 bold',
            bg=cor_center,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl8 = Label(master=frm_top,
            text='TOP -> W',
            font='courier 12 bold',
            bg=cor_n,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl9 = Label(master=frm_top,
            text='TOP -> E',
            font='courier 12 bold',
            bg=cor_s,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl10 = Label(master=frm_bottom,
            text='BOTTOM -> CENTER',
            font='courier 12 bold',
            bg=cor_center,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl11 = Label(master=frm_bottom,
            text='BOTTOM -> W',
            font='courier 12 bold',
            bg=cor_n,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)

lbl12 = Label(master=frm_bottom,
            text='BOTTOM -> E',
            font='courier 12 bold',
            bg=cor_s,
            fg='#000000',
            bd=3,
            relief='solid',
            padx=10)


frm_top.pack(side=TOP, fill=X)
frm_bottom.pack(side=BOTTOM, fill=X)
frm_left.pack(side=LEFT, fill=Y)
frm_right.pack(side=RIGHT, fill=Y)

lbl10.pack(side=BOTTOM, anchor=CENTER, pady=10, padx=10)
lbl11.pack(side=BOTTOM, anchor=W, pady=10, padx=10)
lbl12.pack(side=BOTTOM, anchor=E, pady=10, padx=10)
            
lbl7.pack(side=TOP, anchor=CENTER, pady=10, padx=10)
lbl8.pack(side=TOP, anchor=W, pady=10, padx=10)
lbl9.pack(side=TOP, anchor=E, pady=10, padx=10)

lbl3.pack(side=LEFT, anchor=CENTER, pady=10, padx=10)
lbl1.pack(side=LEFT, anchor=N, pady=10, padx=10)
lbl2.pack(side=LEFT, anchor=S, pady=10, padx=10)

lbl4.pack(side=RIGHT, anchor=CENTER, pady=10, padx=10)
lbl5.pack(side=RIGHT, anchor=N, pady=10, padx=10)
lbl6.pack(side=RIGHT, anchor=S, pady=10, padx=10)

window.mainloop()
