package labs;

public class Ex027 {
        public static void main(String[] args) {

                byte varDecimal = 10;
                // byte varHexadecimal = 0x10;
                // byte varOctal = 010;
                // byte varBin = 0b10;

                System.out.print("\033[2J\033[H");
                System.out.printf("Notação decimal: %d do valor de %d\n",
                                varDecimal,
                                varDecimal);

                System.out.printf("Notação hexadecimal: %H do valor de %d\n",
                                varDecimal,
                                varDecimal);

                System.out.printf("Notação octal: %o do valor de %d\n",
                                varDecimal,
                                varDecimal);

                // System.out.printf("varHexadecimal: %h\n", varHexadecimal);
                // System.out.printf("varOctal: %o\n", varOctal);
                // System.out.printf("varBin: %d\n", varBin);
        }
}
