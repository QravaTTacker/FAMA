from tkinter import *
# Importa todas as funcionalidades do módulo de tkinter.
# import tkinter
# Importa algumas funcionalidades do módulo de tkinter com referencial de tkinter.
# import tkinter as tk
# Importa alguns funcionalidades do módulo de tkinter com o referencial de tk.

pp = Tk()
# Atribui, ao objeto pp, a instância de Tk para criar a página principal.

pp.geometry('400x300+800+100')
# Indica as dimensões físicas da página principal (largura/width - uit  x altura/height - rei).
# (LxH)+x+y -> Indicam o surgimento da página principal no nosso vídeo.

pp.resizable(True, False)
# resizable indica se é possível ou não redimensionar a nossa página principal.
# Recebe valores lógicos para o width e height.
pp.minsize(200, 200)
pp.maxsize(500, 400)
# Expansão máxima e mínima da nossa janela. Devemos deixar em True a redimensão de width e height!
# pp.state('zoomed') -> Comando para iniciar a aplicação com tela máxima.
# pp.state('iconic') -> Comando para iniciar a aplicação com tela fechada.

pp.title('Boas-Vindas!')
# Título da nossa página principal.

# pp.iconbitmap('img/Icon2.ico')
# É uma função que determina o ícone da soma página (é recomentado guarda em uma página própria).

pp['bg'] = '#000000'
# Muda a cor de fundo da página principal.

# Primeiro comando (Label) é responsável pela saída de dados ou trechos em geral (print).
lb = Label(pp, text='Seja muito bem-vindo!', bg='#000000', fg='#ff00ff', font='arial 20')
lb1 = Label(pp, text='Seja muito bem-vindo!', bg='#000000', fg='#0000ff', font='times 20')
lb2 = Label(pp, text='Seja muito bem-vindo!', bg='#000000', fg='#ff0000', font='garamond 20')
lb3 = Label(pp, text='Seja muito bem-vindo!', bg='#000000', fg='#00ff00', font='courier 20 italic') 
lb4 = Label(pp, text='Seja muito bem-vindo!', bg='#000000', fg='#00ff00', font='courier 20 bold italic') 
# Criamos os objetos lb, lb1, lb2 e lb3 para facilitar na sua manipulação.

'''
Label é um widget (componente gráfico) que mostra dados, mensagens etc.

pp -> Container onde ficará o nosso widget (Label), podemos colocar na página principal ou em outros Frames.
Container é um widget que comporta outros componentes gráficos.

text = '...' -> Mensagem que nosso widget mostrará.
bg = '...' -> Indica a cor de fundo de nosso widget (Podemos colocar, entre aspas, o nome da cor ou o código em hexadecimal).
fg = '...' -> Indica a cor da fonte de nosso widget (Podemos colocar, entre aspas, o nome da cor ou o código em hexadecimal).
font = '...' -> Recebe mais de um parâmetro ou atributo que personaliza a fonte:

1) Tipo de fonte: arial, times, garamond, courier, panda...
2) Tamanho da fonte: 10, 23, 55 etc...
3) Estilos: bold (negrito), italic (itálico), underline (sublinhado), overstrike (tachado).
Obs: não importa a ordem entre eles.
'''

lb.place(x=0, y=10)
lb1.place(x=0, y=50)
lb2.place(x=0, y=90)
lb3.place(x=0, y=130)
lb4.place(x=0, y=170)

# Segundo comando (Button) é responsável por acionar eventos ou animação na nossa página principal.
btn = Button(pp, text='Executar', font='times 20 bold italic', bg='#a9a9a9', fg='purple')
btn.place(x=130, y=230)

pp.mainloop()
