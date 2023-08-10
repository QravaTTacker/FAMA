package labs;

import java.util.Random;

public class Ex014 {
    public static void main(String[] args) throws Exception {

        Random rand = new Random();
        String green = "\033[32;1m", sem = "\033[m";
        String[] colors = { "\033[31;1m", "\033[32;1m", "\033[33;1m", "\033[34;1m", "\033[35;1m" };
        float arr[] = new float[5];
        float arrInvert[] = new float[5];
        float soma = 0.0f;

        System.out.println("-".repeat(40));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextFloat(1, 101);
            soma += (float) arr[i];
        }

        for (int i = 0; i < arrInvert.length; i++) {
            arrInvert[i] = arr[arr.length - 1 - i];
            System.out.format("arr[%d] = %s%5.2f%s || arrInvert[%d] = %s%5.2f%s\n", i, colors[i], arr[i], sem, i,
                    colors[arr.length - 1 - i], arrInvert[i], sem);
        }

        float media = (float) soma / arr.length;
        System.out.format("\nMédia = %.2f\n\n", media);

        for (int i = 0; i < arr.length; i++) {
            String result = arr[i] > media
                    ? String.format("arr[%d] = %.2f é %smaior%s que a média!\n", i, arr[i], green, sem)
                    : "";
            System.out.print(result);
        }
        System.out.println("-".repeat(40));
    }
}
