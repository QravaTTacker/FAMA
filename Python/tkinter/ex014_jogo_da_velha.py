from tkinter import Tk, Label, Button, Frame, W, CENTER
from random import choice
from os import system
from PIL import ImageTk, Image
from emoji import emojize

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
listaD = [1, 3, 7, 9]
listaL = [2, 4, 6, 8]
dificuldade = rodada = 1
vezes_click = derrota = vitoria = 0
party = True
vbt = []

for i in range(9):
    vbt.append(True)
    print(f'vbt[{i}] = \033[32m{vbt[i]}\033[m')


def reset(tudo):
    global vezes_click, party, vitoria, derrota, dificuldade, vbt, lista, listaD, listaL, rodada
    if tudo == 's':
        derrota = vitoria = 0
        rodada = 1
        dif(1)
        btn_continuar['command'] = lambda: reset('n')
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    listaD = [1, 3, 7, 9]
    listaL = [2, 4, 6, 8]
    vezes_click = 0
    party = True
    b1['text'] = ''
    b2['text'] = ' '
    b3['text'] = '  '
    b4['text'] = '   '
    b5['text'] = '    '
    b6['text'] = '     '
    b7['text'] = '      '
    b8['text'] = '       '
    b9['text'] = '        '
    b1['bg'] = b2['bg'] = b3['bg'] = b4['bg'] = b5['bg'] = b6['bg'] = b7['bg'] = b8['bg'] = b9['bg'] = '#B6B6B6' 
    lbl_status['text'] = f'{rodada}ª rodada'
    lbl_placar['text'] = f'{vitoria} x {derrota}'
    lbl_status['fg'] = '#ffbb00'
    system('cls')
    print('=' * 25)
    for pos in range(9):
        vbt[pos] = True
        print(f'vbt[{pos}] = \033[32m{vbt[pos]}\033[m')


def dif(level):
    global dificuldade
    if level == 1:
        dificuldade = 1
        btn_normal['bg'] = btn_hard['bg'] = '#ffffff'
        btn_normal['relief'] = btn_hard['relief'] = 'flat'
        btn_izi['relief'] = 'solid'
        btn_izi['bg'] = '#CEF69E'
    elif level == 2:
        dificuldade = 2
        btn_izi['bg'] = btn_hard['bg'] = '#ffffff' 
        btn_izi['relief'] = btn_hard['relief'] = 'flat'
        btn_normal['relief'] = 'solid'
        btn_normal['bg'] = '#F7F78D'
    else:
        dificuldade = 3
        btn_izi['bg'] = btn_normal['bg'] = '#ffffff'
        btn_izi['relief'] = btn_normal['relief'] = 'flat'
        btn_hard['relief'] = 'solid'
        btn_hard['bg'] = '#F6BB9E'


def bot(usr):
    validar()
    global party
    if party:
        global vezes_click, dificuldade, vbt, lista, listaD, listaL
        lista.remove(usr)
        if usr == 1 or usr == 3 or usr == 7 or usr == 9:
            listaD.remove(usr)
        if usr == 2 or usr == 4 or usr == 6 or usr == 8:
            listaL.remove(usr)
        # ---------------------------------------------------------------------> Ataque
        if (b2['text'] == b3['text'] == 'O' or b5['text'] == b9['text'] == 'O' or b4['text'] == b7['text'] == 'O') and vbt[0] and dificuldade >= 2:
            b1['text'], b1['fg'], vbt[0] = 'O', 'green', False
            vezes_click += 1
            lista.remove(1)
            listaD.remove(1)
        elif (b1['text'] == b2['text'] == 'O' or b7['text'] == b5['text'] == 'O' or b9['text'] == b6['text'] == 'O') and vbt[2] and dificuldade >= 2:
            b3['text'], b3['fg'], vbt[2] = 'O', 'green', False
            vezes_click += 1
            lista.remove(3)
            listaD.remove(3)
        elif (b1['text'] == b4['text'] == 'O' or b3['text'] == b5['text'] == 'O' or b8['text'] == b9['text'] == 'O') and vbt[6] and dificuldade >= 2:
            b7['text'], b7['fg'], vbt[6] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(7)
            listaD.remove(7) 
        elif (b1['text'] == b5['text'] == 'O' or b3['text'] == b6['text'] == 'O' or b7['text'] == b8['text'] == 'O') and vbt[8] and dificuldade >= 2:
            b9['text'], b9['fg'], vbt[8] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(9)
            listaD.remove(9)
        elif (b2['text'] == b8['text'] == 'O' or b4['text'] == b6['text'] == 'O' or b3['text'] == b7['text'] == 'O' or b1['text'] == b9['text'] == 'O') and vbt[4] and dificuldade >= 2:
            b5['text'], b5['fg'], vbt[4] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(5)
        elif (b1['text'] == b3['text'] == 'O' or b5['text'] == b8['text'] == 'O') and vbt[1] and dificuldade >= 2:
            b2['text'], b2['fg'], vbt[1] = 'O', 'green', False
            vezes_click += 1 
            lista.remove(2)
            listaL.remove(2)
        elif (b5['text'] == b6['text'] == 'O' or b1['text'] == b7['text'] == 'O') and vbt[3] and dificuldade >= 2:
            b4['text'], b4['fg'], vbt[3] = 'O', 'green', False
            vezes_click += 1 
            lista.remove(4)
            listaL.remove(4)
        elif (b3['text'] == b9['text'] == 'O' or b4['text'] == b5['text'] == 'O') and vbt[5] and dificuldade >= 2:
            b6['text'], b6['fg'], vbt[5] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(6)
            listaL.remove(6)
        elif (b7['text'] == b9['text'] == 'O' or b2['text'] == b5['text'] == 'O') and vbt[7] and dificuldade >= 2:
            b8['text'], b8['fg'], vbt[7] = 'O', 'green', False
            vezes_click += 1
            lista.remove(8)
            listaL.remove(8)
        # ---------------------------------------------------------------------> Defesa
        elif (b2['text'] == b3['text'] == 'X' or b5['text'] == b9['text'] == 'X' or b7['text'] == b4['text'] == 'X') and vbt[0] and dificuldade >= 2:
            b1['text'], b1['fg'], vbt[0] = 'O', 'green', False
            vezes_click += 1
            lista.remove(1)
            listaD.remove(1)
        elif (b1['text'] == b2['text'] == 'X' or b7['text'] == b5['text'] == 'X' or b9['text'] == b6['text'] == 'X') and vbt[2] and dificuldade >= 2:
            b3['text'], b3['fg'], vbt[2] = 'O', 'green', False
            vezes_click += 1
            lista.remove(3)
            listaD.remove(3)
        elif (b1['text'] == b4['text'] == 'X' or b3['text'] == b5['text'] == 'X' or b8['text'] == b9['text'] == 'X') and vbt[6] and dificuldade >= 2:
            b7['text'], b7['fg'], vbt[6] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(7) 
            listaD.remove(7)
        elif (b1['text'] == b5['text'] == 'X' or b3['text'] == b6['text'] == 'X' or b7['text'] == b8['text'] == 'X') and vbt[8] and dificuldade >= 2:
            b9['text'], b9['fg'], vbt[8] = 'O', 'green', False
            vezes_click += 1  
            lista.remove(9)
            listaD.remove(9)
        elif (b2['text'] == b8['text'] == 'X' or b4['text'] == b6['text'] == 'X' or b3['text'] == b7['text'] == 'X' or b1['text'] == b9['text'] == 'X') and vbt[4] and dificuldade >= 2:
            b5['text'], b5['fg'], vbt[4] = 'O', 'green', False
            vezes_click += 1
            lista.remove(5)
        elif (b1['text'] == b3['text'] == 'X' or b5['text'] == b8['text'] == 'X') and vbt[1] and dificuldade >= 2:
            b2['text'], b2['fg'], vbt[1] = 'O', 'green', False
            vezes_click += 1
            lista.remove(2)
            listaL.remove(2)
        elif (b5['text'] == b6['text'] == 'X' or b1['text'] == b7['text'] == 'X') and vbt[3] and dificuldade >= 2:
            b4['text'], b4['fg'], vbt[3] = 'O', 'green', False
            vezes_click += 1
            lista.remove(4)
            listaL.remove(4)
        elif (b3['text'] == b9['text'] == 'X' or b4['text'] == b5['text'] == 'X') and vbt[5] and dificuldade >= 2:
            b6['text'], b6['fg'], vbt[5] = 'O', 'green', False
            vezes_click += 1
            lista.remove(6)
            listaL.remove(6)
        elif (b7['text'] == b9['text'] == 'X' or b2['text'] == b5['text'] == 'X') and vbt[7] and dificuldade >= 2:
            b8['text'], b8['fg'], vbt[7] = 'O', 'green', False
            vezes_click += 1
            lista.remove(8)
            listaL.remove(8)
        elif (b1['text'] == 'X' or b3['text'] == 'X' or b7['text'] == 'X' or b9['text'] == 'X') and vezes_click == 1 and dificuldade == 3:
            b5['text'], b5['fg'], vbt[4] = 'O', 'green', False
            vezes_click += 1
            lista.remove(5)
        elif b5['text'] == 'O' and (b1['text'] == 'X' or b3['text'] == 'X' or b7['text'] == 'X' or b9['text'] == 'X') and dificuldade == 3:
            random_bot = choice(listaL)
            if random_bot == 2:
                b2['text'], b2['fg'], vbt[1] = 'O', 'green', False
                vezes_click += 1
                lista.remove(2)
                listaL.remove(2)
            elif random_bot == 4:
                b4['text'], b4['fg'], vbt[3] = 'O', 'green', False
                vezes_click += 1
                lista.remove(4)
                listaL.remove(4)
            elif random_bot == 6:
                b6['text'], b6['fg'], vbt[5] = 'O', 'green', False
                vezes_click += 1
                lista.remove(6)
                listaL.remove(6)
            elif random_bot == 8:
                b8['text'], b8['fg'], vbt[7] = 'O', 'green', False
                vezes_click += 1
                lista.remove(8)
                listaL.remove(8)
        elif b5['text'] == 'X' and (vezes_click == 1 or vezes_click == 3) and dificuldade == 3:
            random_bot = choice(listaD)
            if vezes_click == 1:
                if random_bot == 1:
                    b1['text'], b1['fg'], vbt[0] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(1)
                    listaD.remove(1)
                elif random_bot == 3:
                    b3['text'], b3['fg'], vbt[2] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(3)
                    listaD.remove(3)
                elif random_bot == 7:
                    b7['text'], b7['fg'], vbt[6] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(7)
                    listaD.remove(7)
                elif random_bot == 9:
                    b9['text'], b9['fg'], vbt[8] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(9)
                    listaD.remove(9)
            elif vezes_click == 3:
                if random_bot == 1:
                    b1['text'], b1['fg'], vbt[0] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(1)
                    listaD.remove(1)
                elif random_bot == 3:
                    b3['text'], b3['fg'], vbt[2] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(3)
                    listaD.remove(3)
                elif random_bot == 7:
                    b7['text'], b7['fg'], vbt[6] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(7)
                    listaD.remove(7)
                elif random_bot == 9:
                    b9['text'], b9['fg'], vbt[8] = 'O', 'green', False
                    vezes_click += 1  
                    lista.remove(9)
                    listaD.remove(9)
        # ---------------------------------------------------------------------> Randômico
        else:
            random_bot = choice(lista)
            if random_bot == 1:
                b1['text'], b1['fg'], vbt[0] = 'O', 'green', False
                vezes_click += 1
                lista.remove(1)
                listaD.remove(1)
            elif random_bot == 2:
                b2['text'], b2['fg'], vbt[1] = 'O', 'green', False
                vezes_click += 1
                lista.remove(2)
                listaL.remove(2)
            elif random_bot == 3:
                b3['text'], b3['fg'], vbt[2] = 'O', 'green', False
                vezes_click += 1
                lista.remove(3) 
                listaD.remove(3)
            elif random_bot == 4:
                b4['text'], b4['fg'], vbt[3] = 'O', 'green', False
                vezes_click += 1 
                lista.remove(4) 
                listaL.remove(4)
            elif random_bot == 5:
                b5['text'], b5['fg'], vbt[4] = 'O', 'green', False
                vezes_click += 1
                lista.remove(5)
            elif random_bot == 6:
                b6['text'], b6['fg'], vbt[5] = 'O', 'green', False
                vezes_click += 1
                lista.remove(6)
                listaL.remove(6)
            elif random_bot == 7:
                b7['text'], b7['fg'], vbt[6] = 'O', 'green', False
                vezes_click += 1
                lista.remove(7)
                listaD.remove(7)
            elif random_bot == 8:
                b8['text'], b8['fg'], vbt[7] = 'O', 'green', False
                vezes_click += 1
                lista.remove(8)
                listaL.remove(8)
            elif random_bot == 9:
                b9['text'], b9['fg'], vbt[8] = 'O', 'green', False
                vezes_click += 1
                lista.remove(9)
                listaD.remove(9)
        validar()


def validar():
    global vezes_click
    if vezes_click >= 5:
        global party, derrota, vitoria, rodada
        # ---------------------------------------------------------------------> vitória nas Linhas
        if b1['text'] == b2['text'] == b3['text']:
            lbl_status['text'] = f"{b1['text']} ganhou!"
            lbl_status['fg'] = b1['fg']
            b5['text'] = b6['text'] = b7['text'] = b8['text'] = b9['text'] = b4['text'] = ' '
            b1['bg'] = b2['bg'] = b3['bg'] = '#ffff99'
            party = False
            if b1['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        elif b4['text'] == b5['text'] == b6['text']:
            lbl_status['text'] = f"{b4['text']} ganhou!" 
            lbl_status['fg'] = b4['fg']
            b1['text'] = b2['text'] = b3['text'] = b7['text'] = b8['text'] = b9['text'] = ' '
            b4['bg'] = b5['bg'] = b6['bg'] = '#ffff99'
            party = False
            if b4['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        elif b7['text'] == b8['text'] == b9['text']:
            lbl_status['text'] = f"{b7['text']} ganhou!" 
            lbl_status['fg'] = b7['fg']
            b1['text'] = b2['text'] = b3['text'] = b4['text'] = b5['text'] = b6['text'] = ' '
            b7['bg'] = b8['bg'] = b9['bg'] = '#ffff99'
            party = False  
            if b7['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        # --------------------------------------------------------------------->  vitória nas Colunas
        elif b1['text'] == b4['text'] == b7['text']:
            lbl_status['text'] = f"{b1['text']} ganhou!" 
            lbl_status['fg'] = b1['fg']
            b2['text'] = b3['text'] = b5['text'] = b6['text'] = b8['text'] = b9['text'] = ' '
            b1['bg'] = b4['bg'] = b7['bg'] = '#ffff99'
            party = False
            if b1['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        elif b2['text'] == b5['text'] == b8['text']:
            lbl_status['text'] = f"{b2['text']} ganhou!" 
            lbl_status['fg'] = b2['fg']
            b1['text'] = b3['text'] = b4['text'] = b6['text'] = b7['text'] = b9['text'] = ' '
            b2['bg'] = b5['bg'] = b8['bg'] = '#ffff99'
            party = False
            if b2['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        elif b3['text'] == b6['text'] == b9['text']:
            lbl_status['text'] = f"{b3['text']} ganhou!" 
            lbl_status['fg'] = b3['fg']
            b1['text'] = b2['text'] = b4['text'] = b5['text'] = b7['text'] = b8['text'] = ' '
            b3['bg'] = b6['bg'] = b9['bg'] = '#ffff99'
            party = False
            if b3['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        # ---------------------------------------------------------------------> vitória nas Diagonais
        elif b1['text'] == b5['text'] == b9['text']:
            lbl_status['text'] = f"{b1['text']} ganhou!" 
            lbl_status['fg'] = b1['fg']
            b2['text'] = b3['text'] = b4['text'] = b6['text'] = b7['text'] = b8['text'] = ' '
            b1['bg'] = b5['bg'] = b9['bg'] = '#ffff99'
            party = False
            if b1['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        elif b7['text'] == b5['text'] == b3['text']:
            lbl_status['text'] = f"{b7['text']} ganhou!" 
            lbl_status['fg'] = b7['fg']
            b1['text'] = b2['text'] = b4['text'] = b6['text'] = b8['text'] = b9['text'] = ' '
            b7['bg'] = b5['bg'] = b3['bg'] = '#ffff99'
            party = False
            if b7['text'] == 'O':
                derrota += 1
            else:
                vitoria += 1
        # ---------------------------------------------------------------------> Empate
        elif vezes_click == 9:
            lbl_status['text'] = f'Deu velha!'
            lbl_status['fg'] = '#ffffff'
            party = False
        lbl_placar['text'] = f'{vitoria} x {derrota}'
        rodada = 1 + vitoria + derrota
        if derrota == 5 or vitoria == 5:
            btn_continuar['command'] = lambda: reset('s')


def jogador(ib):
    global vezes_click, vbt, party
    if ib == 1 and vbt[0] and party:
        b1['text'], b1['fg'], vbt[0] = 'X', 'red', False
        vezes_click += 1
        bot(1)
    elif ib == 2 and vbt[1] and party:
        b2['text'], b2['fg'], vbt[1] = 'X', 'red', False
        vezes_click += 1
        bot(2)
    elif ib == 3 and vbt[2] and party:
        b3['text'], b3['fg'], vbt[2] = 'X', 'red', False
        vezes_click += 1
        bot(3)
    elif ib == 4 and vbt[3] and party:
        b4['text'], b4['fg'], vbt[3] = 'X', 'red', False
        vezes_click += 1
        bot(4)
    elif ib == 5 and vbt[4] and party:
        b5['text'], b5['fg'], vbt[4] = 'X', 'red', False
        vezes_click += 1
        bot(5)
    elif ib == 6 and vbt[5] and party:
        b6['text'], b6['fg'], vbt[5] = 'X', 'red', False
        vezes_click += 1
        bot(6)
    elif ib == 7 and vbt[6] and party:
        b7['text'], b7['fg'], vbt[6] = 'X', 'red', False
        vezes_click += 1
        bot(7)
    elif ib == 8 and vbt[7] and party:
        b8['text'], b8['fg'], vbt[7] = 'X', 'red', False
        vezes_click += 1
        bot(8)
    elif ib == 9 and vbt[8] and party:
        b9['text'], b9['fg'], vbt[8] = 'X', 'red', False
        vezes_click += 1
        bot(9)
    print('=' * 25)
    for pos in range(9):
        cor = emojize(':white_check_mark:', language='alias') if vbt[pos] == True else emojize(':x:', language='alias')
        print(f'vbt[{pos}] = {cor}\033[m')


# --------------------------------------------------------------------->  Config da Janela
janela = Tk()
janela.title('Jogo da Velha')
janela['bg'] = '#202020'
janela['bd'] = 5
janela['relief'] = 'solid'
janela.resizable(False, False)
janela.iconbitmap(r'Python\tkinter\icon\geo.ico')
img = ImageTk.PhotoImage(Image.open(r'Python\tkinter\img\star.jpg'))
# ---------------------------------------------------------------------> Centraliza a janela no vídeo
largura = 575
altura = 420
pox = janela.winfo_screenwidth()/2 - largura/2
poy = janela.winfo_screenheight()/2 - altura/2
janela.geometry('%dx%d+%d+%d' % (largura, altura, pox, poy-50))
# ---------------------------------------------------------------------> Frames
frm_status = Frame(janela, bg='#303030', bd=2, relief='solid')
frm_jogo = Frame(janela, bg=janela['bg'])
frm_menu = Frame(janela, bg='#404040', bd=2, relief='solid', pady=5)
frm_placar = Frame(janela, bg=janela['bg'])
frm_status.grid(row=0, column=0, columnspan=2, padx=14, pady=10)
frm_jogo.grid(row=1, column=0, rowspan=2, padx=15)
frm_menu.grid(row=2, column=1, padx=20, sticky=W)
frm_placar.grid(row=1, column=1)
# ---------------------------------------------------------------------> Reset e Resultado
btn_continuar = Button(frm_menu,
                    # text='Continuar',
                    image=img, 
                    font='Ivy 13 bold italic', 
                    width=150, 
                    height=40, 
                    bd=2, 
                    relief='solid', 
                    # pady=5,
                    command=lambda: reset('n'))
btn_reset = Button(frm_placar,
                    text='Restaurar', 
                    font='Ivy 10 bold', 
                    bg=janela['bg'], 
                    fg='#ffff00', 
                    relief='flat', 
                    command=lambda: reset('s'))
lbl_placar = Label(frm_placar,
                    text=f'{vitoria} x {derrota}', 
                    font='Ivy 33 bold', 
                    bg=janela['bg'], 
                    fg='#ffffff')
lbl_status = Label(frm_status,
                    text=f'{rodada}ª rodada',
                    bg=frm_status['bg'],
                    font='Ivy 20 bold italic',
                    fg='#ffbb00',
                    pady=10,
                    width=31)
btn_reset.grid(row=1, column=0, sticky=W, padx=68)
btn_continuar.grid(row=0, column=0, padx=5, pady=1)
lbl_placar.grid(row=0, column=0, sticky=W, padx=50)
lbl_status.pack(anchor=CENTER)
# ---------------------------------------------------------------------> Dificuldade
btn_izi = Button(frm_menu,
            text='Fácil', 
            font='Ivy 15 bold italic', 
            bg='#CEF69E', 
            width=12, 
            height=1, 
            fg='green', 
            bd=4, 
            relief='solid', 
            command=lambda: dif(1))
btn_normal = Button(frm_menu,
            text='Normal', 
            font='Ivy 15 bold italic', 
            bg='#ffffff', 
            width=12, 
            height=1, 
            fg='orange', 
            bd=4, 
            relief='flat', 
            command=lambda: dif(2))
btn_hard = Button(frm_menu,
            text='Difícil', 
            font='Ivy 15 bold italic', 
            bg='#ffffff', 
            width=12, 
            height=1, 
            fg='red', 
            bd=4, 
            relief='flat', 
            command=lambda: dif(3))
btn_izi.grid(row=1, column=0, padx=5, pady=3)
btn_normal.grid(row=2, column=0, padx=5, pady=3)
btn_hard.grid(row=3, column=0, padx=5, pady=3)
# ---------------------------------------------------------------------> Linha I
b1 = Button(frm_jogo,
            text='',
            font='Ivy 37 bold',
            width=3, 
            height=1,
            bg='#B6B6B6',
            bd=0,
            command=lambda: jogador(1))
b2 = Button(frm_jogo,
            text=' ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(2))
b3 = Button(frm_jogo,
            text='  ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(3))
b1.grid(row=0, column=0, padx=5, pady=5)
b2.grid(row=0, column=1, padx=5, pady=5)
b3.grid(row=0, column=2, padx=5, pady=5)
# ---------------------------------------------------------------------> Linha II
b4 = Button(frm_jogo,
            text='   ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(4))
b5 = Button(frm_jogo,
            text='    ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1,
            bg='#B6B6B6',
            bd=0, 
            command=lambda: jogador(5))
b6 = Button(frm_jogo,
            text='     ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(6))
b4.grid(row=1, column=0, padx=5, pady=5)
b5.grid(row=1, column=1, padx=5, pady=5)
b6.grid(row=1, column=2, padx=5, pady=5)
# ---------------------------------------------------------------------> Linha III
b7 = Button(frm_jogo,
            text='      ', 
            font='Ivy 37 bold',
            width=3, 
            height=1, 
            bg='#B6B6B6',
            bd=0, 
            command=lambda: jogador(7))
b8 = Button(frm_jogo,
            text='        ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(8))
b9 = Button(frm_jogo,
            text='         ', 
            font='Ivy 37 bold', 
            width=3, 
            height=1, 
            bg='#B6B6B6', 
            bd=0,
            command=lambda: jogador(9))
b7.grid(row=2, column=0, padx=5, pady=5)
b8.grid(row=2, column=1, padx=5, pady=5)
b9.grid(row=2, column=2, padx=5, pady=5)
# ---------------------------------------------------------------------> Fim
janela.mainloop()
