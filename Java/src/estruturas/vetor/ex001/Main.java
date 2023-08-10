package vetor.ex001;

public class Main {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // String[] languages = {
        // null, null, "Ruby", null,
        // "C++", "C", null, "Java",
        // "C#", "Kotlin", null, "COBOL",
        // null, "Assembly", "Python",
        // "TypeScript", "Ruby", "Rust",
        // "R", null, "PHP", null,
        // "Lisp", "Ada", null, null };

        Character[] chars = { 'S', 'A', 'Z', 'C', 'B' };
        String[] strings = { "Java", "C", "Ada", "PHP", "C++" };
        Byte[] bytes = { 6, 2, 3, 1, 5 };
        Short[] shorts = { 5, 6, 3, 1, 2 };
        Integer[] integers = { 3, 1, 6, 5, 2 };
        Long[] longers = { 6l, 5l, 3l, 2l, 1l };
        Float[] floats = { 6.0f, 2.5f, 3.3f, 2.51f, 5.2f };
        Double[] doubles = { 6.0, 2.5, 3.3, 2.51, 5.2 };

        Vector<Character> vetChars = new Vector<>(10, chars);
        Vector<String> vetStrings = new Vector<>(strings);
        Vector<Byte> vetBytes = new Vector<>(bytes);
        Vector<Short> vetShorts = new Vector<>(shorts);
        Vector<Integer> vetIntegers = new Vector<>(integers);
        Vector<Long> vetLongers = new Vector<>(longers);
        Vector<Float> vetFloats = new Vector<>(floats);
        Vector<Double> vetDoubles = new Vector<>(doubles);

        System.out.println(vetChars + "\n" +
                vetStrings + "\n" +
                vetBytes + "\n" +
                vetShorts + "\n" +
                vetIntegers + "\n" +
                vetLongers + "\n" +
                vetFloats + "\n" +
                vetDoubles);

        System.out.println("=".repeat(30));

        vetChars.sort();
        vetStrings.sort();
        vetBytes.sort();
        vetShorts.sort();
        vetIntegers.sort();
        vetLongers.sort();
        vetFloats.sort();
        vetDoubles.sort();

        System.out.println(vetChars);
        System.out.println(vetStrings);
        System.out.println(vetBytes);
        System.out.println(vetShorts);
        System.out.println(vetIntegers);
        System.out.println(vetLongers);
        System.out.println(vetFloats);
        System.out.println(vetDoubles);
    }
}
