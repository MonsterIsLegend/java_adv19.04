package streamAPI;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamAPINumbers {

    public static void main(String[] args) {
        int [] numbers = { 1,2,3,2,1,3,4,5,6,76,454,3,-4,2,3};
        //wypisz liczby parzyste i dodatnie
        Arrays.stream(numbers)
                .filter(value -> (value % 2) == 0 && (value > 0)) // działa jak for each gdzie value jest elementem iterujacym po kazdym elemencie
                .forEach(System.out::println);
        //zwróc wartośc maksymalna

                Arrays.stream(numbers).max()
                        .ifPresentOrElse(value -> System.out.println("MAX: " + value),
                        () ->System.out.println("NO MAX VALUE - EMPTY LIST"))   ;

        //zwróc sume wszystkich elementów
        System.out.println(Arrays.stream(numbers).sum());
        //zwróc średnia
        System.out.println(Arrays.stream(numbers).average().getAsDouble());
        //grupowanie
        //System.out.println(Arrays.stream(numbers).collect(Collectors.groupingBy()));
        // wykorzystanie usera, klasy stworzonej przez nas


    }


}
