package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // inicjalizacja i deklaracja pustej listy
        List<String> names2 = new ArrayList<>(Arrays.asList("ALA", "JAN", "EWA"));
        names.add("ALA");
        names.add("OLA");
        names.add("ELA");
        names.add("ALA");
        names.add("ALAN");
        names.add("ANA");
        names.add(1, "MICHAL");
        //dodawanie kolekcji :))
        names.addAll(names2);
        System.out.println(names);
        //pobieranie
        System.out.printf("index: %d wartość %s\n", 5, names.get(3));
        System.out.printf("index: %d wartość %s\n", names.size() - 2, names.get(names.size() - 2));
        //edycja
        names.set(5, "TOMASZ"); // musi być na dlugosci listy



//        for( String s : names){
//            System.out.println(s);
//        }
        //usuawnie
        names.remove("ALA");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.removeAll(new ArrayList<>(Arrays.asList("ALA"))); // usuwanie z logiką odejmowania zbiorów
        System.out.println(names);
        //contain - spr. czy zawiera
        System.out.println(names.contains("ELA"));
        System.out.println(names.contains("ALA"));

    }


}
