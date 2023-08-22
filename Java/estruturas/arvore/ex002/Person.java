package arvore.ex002;

public final class Person implements Comparable<Person> {

    private String name;

    @Override
    public String toString() {
        return this.name.toUpperCase();
    }

    @Override
    public int compareTo(Person o) {
        if (o == null)
            return 1;
        return this.name.compareTo(o.name);
    }

}
