package user;

import java.time.LocalDate;

public class Admin extends User {

    private String [] priviliges;
    private String name;
    private String lastname;

    public Admin(String login, String password, String email, LocalDate birthDate, String[] priviliges, String name, String lastname) {
        super(login, password, email, birthDate);
        this.priviliges = priviliges;
        this.name = name;
        this.lastname = lastname;
        System.out.println("Jestem w konstruktorze admina ");
    }



}
