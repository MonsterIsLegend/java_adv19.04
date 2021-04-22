package exercises.zad5IO;
//Z wykorzystaniem powyższego pliku jego odczytanie powinno skutkowaćzwróceniem listy trzyelementowej obiektów typu User
// o polach: imię, nazwisko,wiek.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public String name;
    private String lastname;
    public  int age;
}
