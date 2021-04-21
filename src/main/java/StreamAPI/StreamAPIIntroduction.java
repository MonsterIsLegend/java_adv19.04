package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamAPIIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("ALA", "OLA", "ELA", "ALA", "JAN", "ADAM", "JAN"));

//        //STREAM API  --> tylko z operaccja kończącą for each
//        names               //kolekcja list
//              .stream()         //uruchomienie strumienia, nie musi byc jesli znamy funkcje kończącą
//                        .forEach(name -> System.out.println(name.toUpperCase())); // dla każdego elementu strumienia wykonaj przekształcenie
//        // void strumień zamkniety
//        names.forEach(System.out::println); // prostsza i szybsza wersja z lambdą
//        //wypisz imiona żeńskie
//        System.out.println("\n");
//        for(String name : names){
//            if(name.toUpperCase().charAt(name.length() - 1) == 'A')
//                System.out.println(name);
//        }
        //CTRL + Space
        names.stream().filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')// Stream<String> filtrujący
                       .forEach(name -> System.out.println(name));
        //imiona żenskie ale przed dodaj napis kobieta

        names.stream().filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                       .map(name -> "kobieta" + name )// Stream<String> filtrujący
                .forEach(System.out::println); // można dodać do souta "Kobieta: " +

        //zwróc liste imion męskich
        List<String> males = names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) != 'A')    //Stream<String>
                .collect(Collectors.toList()); //List<String>
                males.forEach(s -> System.out.println(s));

        }

}
