import tkinter as tk

# --------------------------------------------------------> Funções


def retorne_propriedades(widget):
    arguments = ''
    for i, item in enumerate(widget.keys()):        
        if item == widget.keys()[-1]:  # or... (i + 1) == len(lbl.keys())
            arguments += f'{i+1}) {item}'
            # Não há porquê a última propriedade pular linha...
        else:
            arguments += f'{i+1}) {item}\n'
    return arguments


def retorne_linhas(widget):
    return len(widget.keys())


# --------------------------------------------------------> Definição da janela
window = tk.Tk()
window.config(bg='#202020')
# window.state('zoomed')
window.title('Propriedades De Widgets')
# --------------------------------------------------------> Widgets analisados
lbl = tk.Label()
btn = tk.Button()
ent = tk.Entry()
frm = tk.Frame()
spn = tk.Spinbox()
chk = tk.Checkbutton()
lst = tk.Listbox()
# --------------------------------------------------------> Frames
frm_titles = tk.Frame(window,
                        bg='#353535',
                        bd=3,
                        relief=tk.SOLID)
frm_titles.grid(row=0, column=0, padx=17, pady=10)
frm_propriedades = tk.Frame(window,
                            bg='#353535',
                            bd=3,
                            relief=tk.SOLID)
frm_propriedades.grid(row=1, column=0)
# --------------------------------------------------------> Estilos
style_font = 'arial 7 bold'
style_font2 = 'arial 12 bold'
fundo = '#252525'
# --------------------------------------------------------> Títulos
ttl_lbl = tk.Label(frm_titles,
                text='Label',
                font=style_font2,
                bg=fundo,
                fg='#ff4545',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_lbl.pack(side=tk.LEFT, anchor=tk.NW, padx=20, pady=5)
ttl_btn = tk.Label(frm_titles,
                text='Button',
                font=style_font2,
                bg=fundo,
                fg='#f5aa31',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_btn.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=5)
ttl_ent = tk.Label(frm_titles,
                text='Entry',
                font=style_font2,
                bg=fundo,
                fg='#ffff55',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_ent.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=5)
ttl_frm = tk.Label(frm_titles,
                text='Frame',
                font=style_font2,
                bg=fundo,
                fg='#5aeb3d',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_frm.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=5)
ttl_spn = tk.Label(frm_titles,
                text='Spinbox',
                font=style_font2,
                bg=fundo,
                fg='#3142de',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_spn.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=5)
ttl_chk = tk.Label(frm_titles,
                text='Checkbutton',
                font=style_font2,
                bg=fundo,
                fg='#9331de',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_chk.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=5)
ttl_lst = tk.Label(frm_titles,
                text='Listbox',
                font=style_font2,
                bg=fundo,
                fg='#de31d2',
                width=12,
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
ttl_lst.pack(side=tk.LEFT, anchor=tk.NW, padx=20, pady=5)
# --------------------------------------------------------> Propriedades/Argumentos em GUI
all_lbl = tk.Label(frm_propriedades,
                text=retorne_propriedades(lbl),
                font=style_font,
                bg=fundo,
                fg=ttl_lbl['fg'],
                width=20,
                height=retorne_linhas(lbl),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_lbl.pack(side=tk.LEFT, anchor=tk.NW, padx=20, pady=20)
all_btn = tk.Label(frm_propriedades,
                text=retorne_propriedades(btn),
                font=style_font,
                bg=fundo,
                fg=ttl_btn['fg'],
                width=20,
                height=retorne_linhas(btn),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_btn.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=20)
all_ent = tk.Label(frm_propriedades,
                text=retorne_propriedades(ent),
                font=style_font,
                bg=fundo,
                fg=ttl_ent['fg'],
                width=20,
                height=retorne_linhas(ent),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_ent.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=20)
all_frm = tk.Label(frm_propriedades,
                text=retorne_propriedades(frm),
                font=style_font,
                bg=fundo,
                fg=ttl_frm['fg'],
                width=20,
                height=retorne_linhas(frm),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_frm.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=20)
all_spn = tk.Label(frm_propriedades,
                text=retorne_propriedades(spn),
                font=style_font,
                bg=fundo,
                fg=ttl_spn['fg'],
                width=20,
                height=retorne_linhas(spn),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_spn.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=20)
all_chk = tk.Label(frm_propriedades,
                text=retorne_propriedades(chk),
                font=style_font,
                bg=fundo,
                fg=ttl_chk['fg'],
                width=20,
                height=retorne_linhas(chk),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_chk.pack(side=tk.LEFT, anchor=tk.NW, padx=15, pady=20)
all_lst = tk.Label(frm_propriedades,
                text=retorne_propriedades(lst),
                font=style_font,
                bg=fundo,
                fg=ttl_lst['fg'],
                width=20,
                height=retorne_linhas(lst),
                justify=tk.LEFT,
                relief=tk.SOLID,
                padx=10,
                pady=10)
all_lst.pack(side=tk.LEFT, anchor=tk.NW, padx=20, pady=20)
# --------------------------------------------------------> Propriedades/argumentos em CLI
print(f'LABEL...\n{retorne_propriedades(lbl)}')
print(f'\nBUTTON...\n{retorne_propriedades(btn)}')
print(f'\nENTRY...\n{retorne_propriedades(ent)}')
print(f'\nFRAME...\n{retorne_propriedades(frm)}')
print(f'\nSPINBOX...\n{retorne_propriedades(spn)}')
print(f'\nCHECKBUTTON...\n{retorne_propriedades(chk)}')
print(f'\nLISTBOX...\n{retorne_propriedades(lst)}')
# --------------------------------------------------------> Loop de execução
window.mainloop()
