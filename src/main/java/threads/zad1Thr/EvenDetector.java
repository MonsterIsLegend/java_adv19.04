package threads.zad1Thr;


//Napisz program, który równolegle znajdzie liczby parzyste w dwóchprzedziałach: 1000-2000 oraz 14300-17800.
public class EvenDetector {
    public static void main(String[] args) {
        Thread firstProgram =  new Thread(
                () -> {

                    for( int i = 1000; i <= 2000;i++){

                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException s){
                            s.printStackTrace();
                        }
                        if( i % 2 == 0){
                            System.out.println(Thread.currentThread().getName() + ": " + i);
                        }
                    }
                 });
        Thread secondProgram =  new Thread(
                () -> {
                    for( int i = 14300; i <= 17800;i++){
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException s){
                            s.printStackTrace();
                        }
                        if( i % 2 == 0){
                            System.out.println(Thread.currentThread().getName() + ": " + i);
                        }
                    }


                });
        firstProgram.start();
        secondProgram.start();
    }
}
