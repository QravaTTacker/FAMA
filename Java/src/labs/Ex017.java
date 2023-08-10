package labs;

public class Ex017 {

    private static int count(String str, String cont) {
        return str.length() - str.replace(cont, "").length();
    }

    public static void main(String[] args) throws Exception {

        String name = "Cristian Pessotto";
        String newName = name.replace("t", "");

        System.out.println("name: " + name);
        System.out.println("valueOf(\"t\"): " + String.valueOf("t"));
        System.out.println("newName: " + newName);

        System.out.println("-".repeat(20));

        System.out.printf("name.lenght() = %d\n", name.length());
        System.out.printf("newName.lenght() = %d\n", newName.length());

        System.out.println("-".repeat(20));
        System.out.printf("count(\"t\", name) = %d\n", name.length() - newName.length());
        System.out.printf("MyCount(\"t\", name) = %d\n", count(name, "t"));
        System.out.println("-".repeat(20));
    }
}
