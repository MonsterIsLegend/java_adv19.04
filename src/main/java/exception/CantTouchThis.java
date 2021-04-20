package exception;


// każdy klasa wyjątków musi rozszerzać nadklase exceptions
public class CantTouchThis extends Exception {


    @Override
    public void printStackTrace(){
        super.printStackTrace();
        System.out.println("To jest mój wyjątek - nie można indeksować 0");
    }
}
