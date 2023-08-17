package labs;

public class Ex016 {
    public static void main(String[] args) throws Exception {

        String name = " Cristian Pessotto  ";
        System.out.format("'%s'\n", name);

        // <STRING>.replace(<O QUE SERÁ SUBSTITUíDO>, <O QUE SUBSTITUI>)
        name = name.replace(" ", "");
        System.out.format("'%s'\n", name);
    }
}
