package labs;

public class Ex020 {
    public static void main(String[] args) throws Exception {
        System.out.println("Começa com / " + cidrToBin("/2"));
    }

    private static boolean cidrToBin(String cidr) {

        boolean isCidr = cidr.substring(0, 1).equals("/");
        int intCidr = Integer.parseInt(cidr.substring(1, cidr.length()));
        String binCidr;
        if (isCidr && (intCidr <= 31 && intCidr >= 1)) {
            binCidr = String.format("%s", "1".repeat(intCidr)) + "0".repeat(32 - intCidr);
            System.out.println(binCidr);
            System.out.println(binCidr.length());
            return true;
        }
        return false;
    }
}
