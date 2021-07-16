package LearningJava;

public class ArrayAwarage {

    public static void main(String[] args) {
        int average =0;
        int remainder=0;

        int[] arrray = new int[]{ 3, 5, 6, 6, 7};
        for (int i =0; i<arrray.length; i++){
            average = arrray[i] + average;
        }
        remainder = average%arrray.length;
        average = average/arrray.length;
        System.out.println("Среднее арифм: "+ average);
        System.out.println("Остаток: " + remainder);
    }
}
