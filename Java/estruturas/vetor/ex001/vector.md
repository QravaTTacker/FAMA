## Construtores (4)

- Vector(int initialCapacity, Type[] array): Origin
- Vector(int initialCapacity)
- Vector(Type[] array)
- Vector()

## Atributos (4)

- Type[] vector
- int elements
- int capacity
- int length

## Privados (4)

- setElements()
- changeSize(increment): Aumenta a capacidade do vetor.
- copyArray(int size, Type[] array): Copia de um vetor para outro.
- index(Type value, int start, int end): Retorna o índice de um elemento.

## Públicos (20)

- append(Type value): Adiciona um valor na primeira posição nula.
- appendLast(Type value): Adiciona um valor na última posição nula.
- remove(int indexRemove): Remove uma posição.
- trim(Type value): Remove todas as ocorrências de um valor.
- trim(): Remove todos os valores nulos.
- insert(Type value, int index): Atribui um valor para um índice existente.
- insertAll(Type value): Atribui um valor para todos os índices do vetor.
- annulled(int index): Anula o valor de um índice.
- annulledAll(): Aluno todos os índices do vetor.
- get(int index): Retorna o valor no índice passado.
- contains(Type value): Verifica se um valor está contido no vetor.
- containsAll(Type value): Verifica se um valor preenche todo o vetor.
- indexOf(Type value): Retorna o primeiro índice do valor passado.
- lastIndexOf(Type value): Retorna o último índice do valor passado.
- isEmpty(): Verifica se o vetor está vazio.
- isFull(): Verifica se o vetor está cheio.
- capacity(): Retorna a capacidade do vetor.
- elements(): Retorna a quantidade de elementos.
- getProperty(): Mostra propriedades gerais do vetor.
- toString(): Mostra a estrutura completa do vetor.
- count(Type value, int star, int end): Retorna a contagem de um elemento no vetor.
