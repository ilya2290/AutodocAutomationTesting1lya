package LearningJava;

public class StringReverse {


    public static String stringReverser(String string) {
        String resultString = "";
        char[] array = string.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            resultString = resultString + array[i];
        }
        return string;
    }


    public static void main(String[] args) {
        String str = "orion";
        StringBuffer buffer = new StringBuffer();
        buffer.append(str);
        System.out.println(buffer.reverse());
        System.out.println("________");
        System.out.println(stringReverser(str));


    }


}
