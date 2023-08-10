from tkinter import *
# Biblioteca gráfica -> Importa todos os comandos para criação de uma GUI.
from os import system
system('cls')


def click_terminal():
    for i in range(1, 11):
        print(f' {i}', end='')
    print('')


def del_terminal():
    system('cls')


def click_janela():
    for i in range(1, 11):
        lbj['text'] += f' {i}'
    print('\n')
    

def del_janela():
    lbj['text'] = ''


janela = Tk()
# Variável que recebe a instância de Tk.
# Criação da nossa janela principal.
janela.title('Calculadora')
# Título da janela.
janela['bg'] = 'Black'
# Cor do background -> Cor de fundo da nossa janela.
janela.geometry('400x300+680+175')
# Dimensões da nossa janela (Largura x Altura) - em pixels.
# Podemos colocar mais parâmetros para indicar onde a nossa janela vai ficar no vídeo quando é chamada (LxA+x+y) - Devem ficar colados...
Label(janela, text = 'Click no botão:', bg = 'red').place(x = 50, y = 65)
lbj = Label(janela, bg = 'red')
lbj.place(x = 200, y = 65)

'''
Label é o componente gráfico mais básico, ele mostra uma frase. 
Recebe como primeiro parâmetro o container (widget pai) onde ficará contido, em seguida colocamos o texto. Porém...
Devemos usar o método place logo após do seu parâmetro ().
Por usa vez, o método place é responsável por posicionar um widget filho no container (widget pai): sua estrutura é:
(widget de exemplo).place(posição na Cord. X, posição na Cord. Y)
Obs: Podemos atribuir o Label para uma variável.
''' 

Button(janela, command = click_terminal, bg = 'orange', width = 20, height = 2, text = '1 a 10 (terminal)').place(x = 50, y = 90)
Button(janela, command = click_janela, bg = 'orange', width = 20, height = 2, text = '1 a 10 (janela)').place(x = 204, y = 90)
Button(janela, command = del_terminal, bg = 'pink', width = 20, height = 2, text = 'Apagar (terminal)').place(x = 50, y = 135)
Button(janela, command = del_janela, bg = 'pink', width = 20, height = 2, text = 'Apagar (janela)').place(x = 204, y = 135)

'''
Button é uma classe (segundo elemento gráfico - widget) que recebe os mesmos parâmetros que um Label, porém ele tem um comportamento diferente (Pode captar eventos).
Novamente, devemos coloca o parâmetro 'janela' que é a região gráfica onde será inserida o nosso botão, esse é o primeiro parâmetro!
Os demais parâmetros como bg, text, height etc podem ser colocar em qualquer ordem...
Obs: text informa um texto na tela (print), bg indica a cor de fundo do nosso texto, já width e height, indicam a largura e altura do nosso
widget (nesse caso o Button) a maioria desses parâmetros são opcionais.

O que diferencia um Label de um Button é o parâmetro command que recebe, na maioria dos casos, uma função que executa algo.
Devemos ter a ciência de onde expor os comandos da função, se não colocar mais nada além do command, as instruções
serão executadas no terminal da IDE que está contido o código-fonte.

Podemos fazer alterações em cada elemento do Label, como foi mencionado, a classe Label mostra mensagens na janela principal, portanto:
podemos fazer uma função que vai mudar o texto (elemento/parâmetro text do Label) na função quando ela é acionada.
'''

janela.mainloop()
# Mantém a nossa janela principal em execução ENQUANTO (while) está aberta.
