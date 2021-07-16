package LearningJava;

public class InitialisationBlock {

    int a;
    int b;
    int c;
    String str;
    char qwe;

    static int ca;
    static float f;
    static double g;
    static String stre;

    {
        a = 12;
        b = 13;
        c = 14;
        str = "ass";
        qwe = 'a';
    }

    static {
        ca = 12;
        f = 22.22f;
        g = 22.2;
        stre = "asses";

    }

    public static void main(String[] args) {
        System.out.println(1 + 1 + "1");
        System.out.println("1" + 1 + 1);

    }

}
