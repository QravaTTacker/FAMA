package projects.ip;

import java.util.Scanner;

public class Main {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("IP: ");
        String valor = scanner.nextLine().trim();
        Ip myIp = new Ip(valor);

        System.out.print("IP de comparação: ");
        String ipComp = scanner.nextLine().trim();

        System.out.print("Máscara: ");
        String mask = scanner.nextLine().trim();

        System.out.println("=".repeat(55));
        System.out.println(myIp.compararRede(mask, ipComp)
                ? String.format("\n%sEstão na mesma rede!%s", myIp.colors[2], myIp.colors[3])
                : String.format("\n%sNão estão na mesma rede :/%s", myIp.colors[0], myIp.colors[3]));
        System.out.println("=".repeat(55));
        scanner.close();
    }
}
