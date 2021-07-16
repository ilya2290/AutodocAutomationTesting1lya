package LearningJava;

class ClassTest implements Runnable {
    public static void main(String[] args) {
//        ThreadsLearn obj1 = new ThreadsLearn();
//        ThreadsLearn obj2 = new ThreadsLearn();
//         obj1.start();
//         obj2.start();
        ClassTest testThread = new ClassTest();
        Runner objectFromRunnable1 = new Runner(); //Создали новый объект класса, в котором имплементировали интерфейс и реализовали ран.
        Thread object4 = new Thread(objectFromRunnable1);//Создали объект Thread, в конструктор которого поместили объект класса ранабл. Расчехлить почему объект, логику.
        Thread object5 = new Thread(objectFromRunnable1);
        Thread object6 = new Thread(testThread);
        object4.start();
        object5.start();
        object6.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Hello jopa");
        }
    }

    }


class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " iteration from Interface");
        }
    }
}


public class ThreadsLearn extends Thread {
    @Override
    public void run() { // Получается, что ран реалезуем и записываем туда то, что будет выполняться в одном потоке, по этому он пустой. Как сделать, чтобы каждый поток делал шото свое.
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " iteration from realization in class    ");
        }
    }
}