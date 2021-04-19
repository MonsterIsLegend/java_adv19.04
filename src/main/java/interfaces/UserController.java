package interfaces;

import oop.User;

//wszystkie metody sa publiczne i abstrakcyjne
// pola są statyczne i finalne
//nie mozna utworzyć obiketu typu interfejsu !!!
public interface UserController {
    public static final User[ ] users = new User[10];

    public abstract void registerUser( User user);

    //domyslnie abstrakcyjna i publiczna
    User getUserByEmail ( String email);



}
