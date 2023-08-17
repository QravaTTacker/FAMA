package vetor.ex001;

public interface InterfaceVector<Type> {

    /**
     ** Adiciona um valor vetor na primeira posição nula. Caso não exista, será
     ** realocado o tamanho do vetor e uma nova posição é criada.
     ** 
     * @param value valor para ser agregado ao vetor.
     * @return retorna verdadeiro caso consiga adicionar um novo elemento.
     */
    boolean append(Type value);

    /**
     ** Remove uma posição do vetor. O valor que estiver ali é perdido e a capacidade
     ** é diminuída em uma unidade.
     * 
     * @param indexRemove índice passado para remover um elemento.
     * @return
     * @throws Exception lanchada quando o vetor possui apenas uma única posição.
     */
    boolean remove(int indexRemove) throws Exception;

    /**
     * 
     * @throws Exception
     */
    void trim() throws Exception;

    /**
     * 
     * @param value
     * @param start
     * @param end
     * @return
     */
    int count(Type value, int start, int end);

    /**
     * 
     * @param value
     * @param index
     */
    void insert(Type value, int index);

    /**
     * 
     * @param index
     */
    void annulled(int index);

    /**
     * 
     * @param value
     * @return
     */
    boolean contains(Type value);

    /**
     * 
     * @return
     */
    boolean isEmpty();

    /**
     * 
     * @return
     */
    boolean isFull();

    /**
     * 
     * @param index
     * @return
     */
    Type get(int index);

    /**
     * 
     * @param value
     * @return
     */
    int indexOf(Type value);

    /**
     * 
     * @param value
     * @return
     */
    int lastIndexOf(Type value);

    /**
     * 
     */
    public boolean sort() throws Exception;

}
