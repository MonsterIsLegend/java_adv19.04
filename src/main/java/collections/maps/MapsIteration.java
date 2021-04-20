package collections.maps;

import interfacePolimorfiaAndLegacies.oop.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapsIteration {

    public static void main(String[] args) {

    Map<Integer, User> usersMap = new HashMap<>() {{
        put(1, new User("a", "a", "A@wp.pl", LocalDate.of(1999,5,16)));
        put(2, new User("b", "b", "b@wp.pl", LocalDate.of(1998,4,6)));
        put(3, new User("c", "c", "c@wp.pl", LocalDate.of(1997,7,24)));
        put(4, new User("d", "d", "d@wp.pl", LocalDate.of(1996,6,1)));
    }} ;


        Map<String, Integer> romanToNumeric = new HashMap<>();
        romanToNumeric.put("0",0);
        romanToNumeric.put("I",1);
        romanToNumeric.put("II",2);
        romanToNumeric.put("III",3);
        romanToNumeric.put("IV",4);
        romanToNumeric.put("V",5);
        romanToNumeric.put("VI",6);
        romanToNumeric.put("VII",7);
        romanToNumeric.put("VIII",8);
        romanToNumeric.put("IX",9);
        romanToNumeric.put("X",10);



        for(String key : romanToNumeric.keySet()){
            System.out.printf(" | %4s  |  %1d  |\n", key , romanToNumeric.get(key));
        }
        for(int id : usersMap.keySet()){
            System.out.printf(" | %-1s  |  %-10s  |   %-10s  |\n ", id , usersMap.get(id).getLogin(),usersMap.get(id).getEmail());
        }

        System.out.println(romanToNumeric.keySet());
        System.out.println(romanToNumeric.values());
        System.out.println(romanToNumeric);

    }

}
