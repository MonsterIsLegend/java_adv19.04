package streamAPI;

import java.util.*;
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

        //zwróc liste imion męskich

        List<String> males = names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) != 'A')    //Stream<String>
                .collect(Collectors.toList()); //List<String>
        males.forEach(s -> System.out.println(s));
        //imiona żenskie ale przed dodaj napis kobieta

        names.stream().filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                .map(name -> "kobieta " + name)// Stream<String> filtrujący
                .forEach(System.out::println); // można dodać do souta "Kobieta: " +
        //w jednym poleceniu ile jest kobiet na liscie
        long femaleCount = names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                .count();
        System.out.println(femaleCount);
        long femaleUniqeCount = names.stream()
                .filter(name -> name.toUpperCase().charAt(name.length() - 1) == 'A')
                .distinct()
                .count();
        System.out.println(femaleUniqeCount);
        // wyszukaj osobe o imieniu ela
        String searchName = "Ela";
        Optional<String> resultOptional = names.stream()
                .filter(name ->name.toUpperCase().equals(searchName.toUpperCase()))
                .findFirst();
//        if(resultOptional.isPresent()){
//            System.out.println("Znaleziono " + resultOptional.get());
//        } else{
//            System.out.println("Nie znaleziono imienia " + searchName);
//        }
        resultOptional.ifPresent(name -> System.out.println("Znaleziono " + name) );
        System.out.println(resultOptional.orElse("Nie znaleziono imienia " + searchName));
    }

}


