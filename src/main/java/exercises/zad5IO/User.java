package exercises.zad5IO;
//Z wykorzystaniem powyższego pliku jego odczytanie powinno skutkowaćzwróceniem listy trzyelementowej obiektów typu User
// o polach: imię, nazwisko,wiek.

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String lastname;
    private int age;
}
