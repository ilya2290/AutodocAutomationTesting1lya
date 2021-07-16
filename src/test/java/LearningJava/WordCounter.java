package LearningJava;

public class WordCounter {

    public static void wordCounter(String string) {
        String string1;
        string1 = string;
        int counter = 0;
        char[] array = string1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        System.out.println(string);
        System.out.println(counter);
    }


    public static void main(String[] args) {

        wordCounter("soundgarden");
    }
}