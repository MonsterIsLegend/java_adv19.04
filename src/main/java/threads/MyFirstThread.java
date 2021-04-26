package threads;

// każda klasa wątku rozszerza klasę thread
public class MyFirstThread extends Thread {
    public MyFirstThread() { // domyślny
    }

    public MyFirstThread(String name) { //edytujący nazwę wątku
        super(name);
    }

    @Override
    public void run() {
        // gdy wątek jest uruchomiony wykonywana jest metoda run()
        for (int i = 1; i < 60; i++) {
            //Thread.currentThread().getName()) zwraca nazwe wątku
            System.out.println(i + "s " +": " + " Watek: "  + Thread.currentThread().getName());

            //Thread.sleep(1000); uśpienie na sekundę
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //gdy metoda run sie wykona to wątek przechodzi do terminated

    }
}
