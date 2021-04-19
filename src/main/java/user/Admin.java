package user;

import lombok.*;

import java.time.LocalDate;
import java.util.Arrays;

//@Data //dodaje getetry, settery i to string
@Getter // dodaje gettery
@Setter // dodaje setery
@ToString // dodaje automatycznie toString()
//@NoArgsConstructor // dodaje domyslny konstruktor w kodzie klasy
//@AllArgsConstructor automatycznie dodaje konstruktor ze wszystkimi polami klasowumi jako parametry

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

    @Override
    public String toString() {
        return "Admin{" +
                "priviliges=" + Arrays.toString(priviliges) +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                "} " + super.toString(); // wywołanie metody z klasy nadrzednej
    }
}
