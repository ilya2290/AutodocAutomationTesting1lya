package LearningJava;

public class SwitchLearning {

    public static void main(String[] args) {

        int a = 1 + 3;
        String month;

        switch (a) {
            case 1:
                month = ("January");
                System.out.println(month);
                break;
            case 2:
                month = ("February");
                System.out.println(month);
                break;
            case 3:
                month = ("March");
                System.out.println(month);
                break;
            case 4:
                month = ("April");
                System.out.println(month);
                break;
            default:
                month = ("Try one more time");
                System.out.println(month);

                break;

        }
    }
}
