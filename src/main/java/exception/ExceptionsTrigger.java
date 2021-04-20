package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsTrigger {
    List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    public Integer getElementByIndex(int index) {
        try {                                             //jezeli w try wystąpi wyjątek to przejdź do catch

            if (index == 0) {                                // dla określonego przypadku syntetycznie zgłos nullpointerexception
                throw new CantTouchThis();
            }

            int element = elements.get(index);// identyfikacja miejsca wystąpienia wyjątku
            return element;
        } catch (IndexOutOfBoundsException ex) {// obsluga wyjątku IndexOutOfBoundsException
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }return null;

    }


    public static void main(String[] args) {
        ExceptionsTrigger exceptionsTrigger = new ExceptionsTrigger();

        System.out.println(exceptionsTrigger.getElementByIndex(1));
        System.out.println(exceptionsTrigger.getElementByIndex(0));
        System.out.println(exceptionsTrigger.getElementByIndex(-2));
        System.out.println(exceptionsTrigger.getElementByIndex(1000));


    }


}