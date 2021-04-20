package interfacePolimorfiaAndLegacies.interfaces;

import interfacePolimorfiaAndLegacies.oop.User;

import java.time.LocalDate;

public class UserControllerImpl implements UserController {
    @Override
    public void registerUser(User user) {
        for(int i = 0; i < users.length;i++ ){
           if(UserController.users[i] == null){ //jezeli slot jest pusty to zapisuje nowego usera
               UserController.users[i] = user;
               break;
           }
        }

    }

    @Override
    public User getUserByEmail(String email) {
        User user = null;
        for(int i = 0; i < users.length;i++ ){
            if(UserController.users[i].getEmail().equals(email)){ //jezeli slot jest pusty to zapisuje nowego usera
               user = UserController.users[i];
                return user;
            }
        }

        return user;
    }

    public void getAllRegisteredUsers(){
        for(User u : UserController.users){
            System.out.println(u);
            }
        }




    public static void main(String[] args) {
       UserController userController = new UserControllerImpl();

       userController.registerUser(
               new User("a","d","s", LocalDate.of(1999,10,6))
       );
        userController.registerUser(
                new User("a","d","d", LocalDate.of(2000,10,6))
        );
        userController.registerUser(
                new User("a","d","k", LocalDate.of(1998,10,6))
        );
        userController.registerUser(
                new User("a","d","l", LocalDate.of(1989,10,6))
        );
    }



}
