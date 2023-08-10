package revision;

import java.util.ArrayList;
import java.util.Arrays;

public final class Main {

    // private static final int MAX_VALUE = 0xA;
    // private static final int MIN_VALUE = 0x1;

    public static void main(String... args) throws Exception {

        System.out.print("\033[2J\033[H");

        Developer<String> mySelf = new Developer<>();

        mySelf.languages = new ArrayList<>(
                Arrays.asList(
                        "Javascript",
                        "PHP",
                        "Java"));

        mySelf.frameworksAndLibs = new ArrayList<>(
                Arrays.asList(
                        "React",
                        "Laravel",
                        "Spring",
                        "Bootstrap"));

        System.out.println(mySelf);

        // System.out.println("=".repeat(40));
        // tabuadaMatriz();
    }

    // private static void tabuadaMatriz() {
    // for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
    // for (int j = MIN_VALUE; j <= i; j++) {
    // System.out.printf("%4d", (i * j));
    // }
    // System.out.println();
    // }
    // }

}

class Developer<T> extends Object {

    public ArrayList<T> languages = null;
    public ArrayList<T> frameworksAndLibs = null;
    public ArrayList<T> valores = null;

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        ArrayList<ArrayList<T>> arrays = new ArrayList<>(Arrays.asList(
                this.languages,
                this.frameworksAndLibs));

        arrays.stream().forEach(array -> {
            array.stream().forEach(element -> {
                sb.append(String.format("%s ", element));
            });
            sb.append("\n");
        });

        return sb.toString();
    }

}
