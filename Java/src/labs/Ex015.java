package labs;

import java.util.Scanner;

public class Ex015 {

    public static void main(String[] args) throws Exception {
        String red = "\033[31;1m", green = "\033[32;1m", sem = "\033[m";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe uma endereço IP: ");
            String ip = scanner.nextLine().replace(" ", "");
            scanner.close();

            String[] ipSplit = ip.split("\\.");

            if (ipSplit.length != 4) {
                System.out.format("O IP %sNÃO%s possui 3 octetos\n", red, sem);
            } else {
                System.out.format("O IP %sPOSSUI%s 3 octetos\n", green, sem);
            }

            int[] ipInt = new int[ipSplit.length];
            int[] ipBin = new int[ipSplit.length];

            for (int i = 0; i < ipSplit.length; i++) {
                ipInt[i] = Integer.parseInt(ipSplit[i]);

                if (0 <= ipInt[i] && ipInt[i] <= 255) {
                    ipBin[i] = Integer.parseInt(Integer.toBinaryString(ipInt[i]));
                } else {
                    System.out.format("O %dº octeto está fora do intervalo (0 a 255)\n", i + 1);
                    break;
                }
            }

            for (int i = 0; i < ipInt.length; i++) {
                System.out.format("ipSplit + 1 = %s\n", (ipSplit[i] + 1));
                System.out.format("ipInt + 1 = %s\n\n", (ipInt[i] + 1));
            }

            System.out.format("ip: %s%s%s\n", red, ip, sem);

            ip = "";
            for (int i = 0; i < ipInt.length; i++) {
                ip += i != ipInt.length - 1 ? (Integer.toString(ipInt[i]) + ".") : Integer.toString(ipInt[i]);
            }
            System.out.format("ipInt: %s%s%s\n", green, ip, sem);

            ip = "";
            for (int i = 0; i < ipBin.length; i++) {
                ip += i != ipBin.length - 1 ? (ipBin[i] + ".") : ipBin[i];
            }
            System.out.format("ipBin: %s%s%s", green, ip, sem);
        } catch (NumberFormatException erro) {
            System.out.printf("Informe valores %sVálidos%s deparados por pontos!", red, sem);
        }
    }
}
