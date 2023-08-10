package vetor.ex001;

import java.util.Objects;

/**
 * <b> Métodos da classe Vector:
 * <p>
 * <b> {@link #append(Type)}: Adiciona um elemento na primeira posição vazia.
 * <p>
 * <b> {@link #appendLast(Type)}: Adiciona um novo elemento no final do vetor.
 * <p>
 * <b> {@link #remove(int)}: Remove um índice do vetor.
 * <p>
 * <b> {@link #insert(Type, int)}: Insere um valor conforme uma posição.
 * <p>
 * <b> {@link #insertAll(Type)}: Insere um valor para todas as posições.
 * <p>
 * <b> {@link #annulled(int)}: Anula um valor conforme uma posição.
 * <p>
 * <b> {@link #annulledAll()}: Anula todos os valores.
 * <p>
 * <b> {@link #get(int)}: Retorna um elemento conforme uma posição.
 * <p>
 * <b> {@link #indexOf(Type)}: Retorna o índice da primeira ocorrência.
 * <p>
 * <b> {@link #lastIndexOf(Type)}: Retorna o índice da última ocorrência.
 * <p>
 * <b> {@link #capacity()}: Retorna a capacidade máxima do vetor.
 * <p>
 * <b> {@link #elements()}: Retorna a quantidade de elementos do vetor.
 * <p>
 * <b> {@link #contains(Type)}: Verifica se um valor está contido no vetor.
 * <p>
 * <b> {@link #containsAll(Type)}: Verifica se todo o vetor contem um valor.
 * <p>
 * <b> {@link #isEmpty()}: Verifica se o vetor está vazio.
 * <p>
 * <b> {@link #isFull()}: Verifica se o vetor está cheio.
 * <p>
 * <b> {@link #getProperty()}: Mostra todas as propriedades do vetor.
 */
public class Vector<Type> implements InterfaceVector<Type> {

    private Type[] vector;
    private int elements;
    private int capacity;
    public int length;

    /**
     *
     * @param initialCapacity capacidade inicial do vetor.
     * @param array
     * @throws IllegalArgumentException lançada quando o parâmetro é nulo ou
     *                                  negativo.
     */
    @SuppressWarnings("unchecked")
    public Vector(int initialCapacity, Type[] array) {
        if (initialCapacity > 0) {
            this.vector = (Type[]) new Object[initialCapacity];
            if (array != null)
                this.copyArray(initialCapacity, array);
            this.setElements();
            this.capacity = initialCapacity;
            this.length = this.capacity;
        } else {
            throw new IllegalArgumentException("Size é nulo ou negativo :/");
        }
    }

    /**
     * 
     * @param array
     */
    public Vector(Type[] array) {
        this(array.length, array);
    }

    /**
     * 
     * @param initialCapacity
     */
    public Vector(int initialCapacity) {
        this(initialCapacity, null);
    }

    /**
     * 
     */
    public Vector() {
        this(10, null);
    }

    /**
     ** Verifica a quantidade de elementos, seguindo o critério dos
     ** valores não nulos.
     **/
    private void setElements() {
        this.elements = 0;
        for (Type key : this.vector)
            if (key != null)
                this.elements++;
    }

    /**
     ** Altera a capacidade máxima do vetor.
     * 
     * @param increment
     */
    @SuppressWarnings("unchecked")
    private void changeSize(int increment) {
        Type[] newVector = (Type[]) new Object[this.capacity + increment];
        for (int i = 0; i < this.capacity; i++)
            newVector[i] = this.vector[i];
        this.vector = newVector;
        this.capacity = this.vector.length;
        this.length = this.capacity;
    }

    /**
     * 
     * @param size
     * @param values
     */
    private void copyArray(int size, Type[] values) {
        for (int i = 0; i < (size + values.length - Math.abs(size - values.length)) / 2; i++) {
            this.vector[i] = values[i];
        }
    }

    /**
     ** Adiciona um valor vetor na primeira posição nula. Caso não exista, será
     ** realocado o tamanho do vetor e uma nova posição é criada.
     ** 
     * @param value valor para ser agregado ao vetor.
     * @return retorna verdadeiro caso consiga adicionar um novo elemento.
     */
    @Override
    public boolean append(Type value) {
        // * Verifica se o valor é nulo. Caso seja, não é adicionado um novo elemento.
        if (value == null)
            return false;
        // * Verifica qual posição se encontra o primeiro valor nulo para substituí-lo.
        int index = this.indexOf(null);
        // * Verifica se índice não existe. Caso verdadeiro, o vetor será realocado.
        if (index < 0) {
            // * Aumenta o tamanho so vetor em uma unidade.
            this.changeSize(1);
            // * Adiciona o elemento na última posição.
            this.vector[this.capacity - 1] = value;
        } else {
            // * Adiciona o elemento na primeira ocorrência de nulo.
            this.vector[index] = value;
        }
        // * Incrementa um novo valor.
        this.elements++;
        // * Retorna verdadeiro indicando que o valor foi adicionado.
        return true;
    }

    /**
     ** Adiciona um valor vetor na última posição nula, caso não exista, será
     ** realocado o tamanho do vetor e uma nova posição é criada.
     ** 
     * @param value valor para ser agregado ao vetor.
     * @return retorna verdadeiro caso consiga adicionar um novo elemento.
     */
    public boolean appendLast(Type value) {
        // * Verifica se o valor é nulo. Caso seja, não é adicionado um novo elemento.
        if (value == null)
            return false;
        // * Verifica qual posição se encontra o último valor nulo para substituí-lo.
        int index = this.lastIndexOf(null);
        // * Verifica se índice não existe. Caso verdadeiro, o vetor será realocado.
        if (index < 0) {
            // * Aumenta o tamanho so vetor em uma unidade.
            changeSize(1);
            // * Adiciona o elemento na última posição.
            this.vector[this.capacity - 1] = value;
        } else {
            // * Adiciona o elemento na última ocorrência de nulo.
            this.vector[index] = value;
        }
        // * Incrementa um novo valor.
        this.elements++;
        // * Retorna verdadeiro indicando que o valor foi adicionado.
        return true;
    }

    /**
     ** Remove uma posição do vetor. O valor que estiver ali é perdido e a capacidade
     ** é diminuída em uma unidade.
     * 
     * @param indexRemove índice passado para remover um elemento.
     * @return
     * @throws Exception lanchada quando o vetor possui apenas uma única posição.
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean remove(int indexRemove) throws Exception {
        // * Não é permitido remover se o vetor possui apenas uma posição.
        if (this.capacity == 1)
            return false;
        // throw new Exception("O veto possui apenas uma posição");
        // * Verifica se o posição passada está na faixa de valores indexáveis.
        if (0 > indexRemove || indexRemove >= this.capacity)
            return false;
        // throw new IllegalArgumentException("Índice inválido");
        // * Decrementa a quantidade de elementos se a posição é diferente de nulo.
        this.elements -= this.vector[indexRemove] != null ? 1 : 0;
        // * Declara um novo vetor com capacidade menor.
        Type[] newVector = (Type[]) new Object[this.capacity - 1];
        // * Variável auxiliar para indexar os valores do antigo vetor para o novo.
        int indexAux = 0;
        /*
         * Se o índice de remoção for a última posição o loop irá até a antepenultima
         * penúltima posição, ou seja, subtrai uma unidade da condição de parada. Caso
         * contrário, ele irá até a penúltima posição (não subtrai nenhum valor).
         */
        int fator = (indexRemove == this.capacity - 1) ? 1 : 0;
        // * Loop que itera em todos as posições do vetor antigo.
        for (int i = 0; i < this.capacity - fator; i++)
            /*
             * Atribui os elementos do vetor antigo para o novo. Se o índice de remoção
             * é encontrado, será atribuído o elemento da próxima posição (++i).
             * index == this.capacity - 1
             */
            newVector[indexAux++] = this.vector[(i == indexRemove) ? ++i : i];
        // * Atribui o novo vetor ao vetor da class.
        this.vector = newVector;
        // * Decrementa a capacidade do vetor.
        this.capacity--;
        this.length = this.capacity;
        return true;
    }

    /**
     * 
     * @param value
     * @throws Exception
     */
    public void trim(Type value) throws Exception {
        if (this.capacity == 1)
            throw new Exception("Impossível reajustar a vetor com " + this.capacity + " de capacidade");
        int indexRemove = 0;
        while ((indexRemove = this.indexOf(value)) >= 0 && this.capacity > 1)
            this.remove(indexRemove);
    }

    /**
     * 
     * @throws Exception
     */
    @Override
    public void trim() throws Exception {
        this.trim(null);
    }

    /**
     * 
     * @param value
     * @param start
     * @param end
     * @return
     */
    @Override
    public int count(Type value, int start, int end) {
        int cont = 0;
        if (value == null) {
            for (int i = start; i < end; i++)
                if (value == this.vector[i])
                    cont++;
        } else {
            for (int i = start; i < end; i++)
                if (value.equals(this.vector[i]))
                    cont++;
        }
        return cont;
    }

    /**
     * 
     * @param value
     * @param start
     * @return
     */
    public int count(Type value, int start) {
        return count(value, start, this.capacity);
    }

    /**
     * 
     * @param value
     * @return
     */
    public int count(Type value) {
        return count(value, 0, this.capacity);
    }

    /**
     * 
     * @param value
     * @param index
     */
    @Override
    public void insert(Type value, int index) {
        if (-1 < index && index < this.capacity) {
            this.elements += (value != null && this.vector[index] == null)
                    ? 1
                    : (value == null && this.vector[index] != null)
                            ? -1
                            : 0;
            this.vector[index] = value;
        } else {
            throw new IllegalArgumentException("Índice inválido");
        }
    }

    /**
     * 
     * @param value
     */
    public void insertAll(Type value) {
        this.elements = (value == null) ? 0 : this.capacity;
        for (int i = 0; i < this.capacity; i++)
            this.vector[i] = value;
    }

    /**
     * 
     * @param index
     */
    @Override
    public void annulled(int index) {
        this.insert(null, index);
    }

    /**
     * 
     */
    public void annulledAll() {
        if (this.elements > 0)
            this.insertAll(null);
    }

    /**
     * 
     * @param value
     * @return
     */
    @Override
    public boolean contains(Type value) {
        return indexOf(value) >= 0;
    }

    /**
     * 
     * @param value
     * @return
     */
    public boolean containsAll(Type value) {
        if (value == null && (this.elements == 0))
            return true;
        for (int i = 0; i < this.capacity; i++)
            if (value != this.vector[i])
                return false;
        return true;
    }

    /**
     * 
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.elements == 0;
    }

    /**
     * 
     * @return
     */
    @Override
    public boolean isFull() {
        return this.elements == this.capacity;
    }

    /**
     * 
     * @return
     */
    public int capacity() {
        return this.capacity;
    }

    /**
     * 
     * @return
     */
    public int elements() {
        return this.elements;
    }

    /**
     * 
     * @param index
     * @return
     */
    @Override
    public Type get(int index) {
        if (index >= 0 && index < this.capacity)
            return this.vector[index];
        return null;
    }

    /**
     * 
     * @param value
     * @param start
     * @param end
     * @return
     */
    private int index(Type value, int start, int end) {
        /*
         * 0, 1, 2
         * start: 3
         * end: 0
         * fatorIncremento: -1
         * fator: -1
         * i = 3 - 1 = 2
         * enquanto (i != 0 - 1) {
         * i = 2 -> -1
         * i = 1 -> -1
         * i = 0 -> -1
         * i = -1 -> break
         * }
         * -------------------------
         * 0, 1, 2
         * start: 0
         * end: 3
         * fator: 1
         * fatorStart: 0
         * i = 0 + 0 = 0
         * enquanto (i != 3 - 0) {
         * i = 0 -> +1
         * i = 1 -> +1
         * i = 2 -> +1
         * i = 3 -> break
         * }
         * 
         */
        int fatorIncremento = (start < end) ? 1 : -1;
        int fator = (start < end) ? 0 : 1;
        if (value == null) {
            for (int i = start - fator; i != end - fator; i += fatorIncremento)
                if (value == this.vector[i])
                    return i;
        } else {
            for (int i = start - fator; i != end - fator; i += fatorIncremento)
                if (value.equals(this.vector[i]))
                    return i;
        }
        return -1;
    }

    /**
     * 
     * @param value
     * @return
     */
    @Override
    public int indexOf(Type value) {
        return index(value, 0, this.capacity);
    }

    /**
     * 
     * @param value
     * @return
     */
    @Override
    public int lastIndexOf(Type value) {
        return index(value, this.capacity, 0);
    }

    /**
     * @throws Exception
     * 
     */
    @Override
    public boolean sort() throws Exception {
        this.trim(null);
        String classe = this.vector[0].getClass().getSimpleName();
        if (classe.equalsIgnoreCase("String") || classe.equalsIgnoreCase("Character"))
            this.shortLiterais();
        else if (classe.equalsIgnoreCase("Byte"))
            this.shortByte();
        else if (classe.equalsIgnoreCase("Short"))
            this.shortShort();
        else if (classe.equalsIgnoreCase("Integer"))
            this.shortInteger();
        else if (classe.equalsIgnoreCase("Long"))
            this.shortLong();
        else if (classe.equalsIgnoreCase("Float"))
            this.shortFloat();
        else if (classe.equalsIgnoreCase("Double"))
            this.shortDouble();
        else
            return false;
        return true;
    }

    /*
     * A.compareTo(B) = 0 -> Quando os dois são igual.
     * A.compareTo(B) < 0 -> Quando B é maior.
     * A.compareTo(B) > 0 -> Quando A é maior.
     * Objects.toString(A).compareTo(Objects.toString(B));
     * 
     * if(A.compareTo(B) < 0)
     * aux = B
     * B = A
     * A = aux
     */
    private void shortLiterais() throws Exception {
        this.trim();
        Type value = null;
        // System.out.println(this.vector[0].getClass().getSimpleName());
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Objects.toString(this.vector[j]).compareTo(Objects.toString(value)) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortByte() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Byte.compare((byte) this.vector[j], (byte) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortShort() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Short.compare((short) this.vector[j], (short) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortInteger() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Integer.compare((int) this.vector[j], (int) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortLong() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Long.compare((long) this.vector[j], (long) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortFloat() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Float.compare((float) this.vector[j], (float) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    private void shortDouble() throws Exception {
        this.trim();
        // System.out.println(this.vector[0].getClass().getSimpleName());
        Type value = null;
        for (int i = 1; i < this.capacity; i++) {
            value = this.vector[i];
            int j = i - 1;
            while (j >= 0 && Double.compare((double) this.vector[j], (double) value) > 0) {
                this.vector[j + 1] = this.vector[j];
                j--;
            }
            this.vector[j + 1] = value;
        }
    }

    // public void bubble() {
    // Type A, B, aux = null;
    // int retorno;
    // for (int i = 0; i < this.capacity - 1; i++)
    // for (int j = 1; j < this.capacity - i - 1; j++) {
    // A = this.vector[i];
    // B = this.vector[j];
    // retorno = Objects.toString(A).compareTo(Objects.toString(B));
    // if (retorno > 0) {
    // aux = A;
    // this.vector[i] = B;
    // this.vector[j] = aux;
    // }
    // System.out.println(this);
    // }
    // }

    /**
     * 
     */
    public void getProperty() {
        System.out.print(this + "\n"
                + String.format("Capacity: %d\n", this.capacity)
                + String.format("Elements: %d\n", this.elements)
                + String.format("isEmpty: %b\n", this.isEmpty())
                + String.format("isFull: %b\n", this.isFull()));
    }

    /**
     * 
     */
    @Override
    public String toString() {
        StringBuilder body = new StringBuilder("[");
        for (int i = 0; i < this.capacity - 1; i++) {
            body.append((this.vector[i] == null
                    ? "-"
                    : this.vector[i])
                    + ", ");
        }
        body.append((this.vector[this.capacity - 1] == null
                ? "-"
                : this.vector[this.capacity - 1])
                + "]");
        return body.toString();
    }
}
