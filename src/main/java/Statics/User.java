package Statics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    public static int global_id;   //nie są związane z obiektem a klasą
                                    //pole statyczne nie jest reinicjalizowane przy tworzeniu obiektu

    private int id; //0
    private String name;        // null
    private String lastname;    // null

    public User(String name, String lastname) {
        global_id++;    // inkrementacja aktualnej składowej statycznek
        this.id = global_id; // inkrementuje z 0 na 1 zawsze
        this.name = name;
        this.lastname = lastname;
    }
    public static void getInfo(){
        System.out.println(global_id); // moge odwołać się do składowytch statycznych, nie mogę do niestatycznej
        User user = new User("X","x"); // może implementować dowolne rozwiązania
        user.setId(5);
    }
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Adam", "X"));
        users.add(new User("Anna", "Y"));
        users.add(new User("Adam", "X"));
        users.forEach(System.out::println);

        System.out.println(User.global_id); // odwołanie bez udziału instancji
        User.getInfo(); // wywołanie metody bez udziału instancji
    }
}


