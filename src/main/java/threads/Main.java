package threads;

import java.util.Random;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        System.out.println("MAIN : " + Thread.currentThread().getName());
        MyFirstThread myFirstThread1 = new MyFirstThread();                     //NEW
        MyFirstThread myFirstThread2 = new MyFirstThread("AlPHA");
        System.out.println("MAIN : " + Thread.currentThread().getName());
        //uruchomienie odbywa się  za pomocą wywyołania metody
        myFirstThread1.start(); // alokacja zasobów sprzętowych dla wątku "mft1"        //RUNNABLE
        myFirstThread2.start(); // alokacja zasobów sprzętowych dla wątku "mft2"
        // implementacja klasy wątku w klasie anonimowej
        Thread threadBasedOnRunable = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] names = {"TASK A", "TASK B", "TASK C", "TASK D"};
                Random random = new Random();

                try {
                    for (String name : names) {
                        int randomTime = random.nextInt(5) + 1;
                        Thread.sleep(randomTime * 1000);                        // TIME_WAITING / WAITING
                        System.out.println(name + " : " + Thread.currentThread().getName() + " time to solve: "
                                + randomTime);

                    }
                } catch (InterruptedException s) {
                    s.printStackTrace();

                }
            }
        });
        threadBasedOnRunable.start();
        //thread with Lambda
        Thread threadBaseOnLambda = new Thread(
                //implementacja metody run
                () -> {
                    try {
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Hello");
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException s) {
                        s.printStackTrace();
                    }
                });
        threadBaseOnLambda.start();

    }
}
