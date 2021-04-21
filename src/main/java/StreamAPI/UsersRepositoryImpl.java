package StreamAPI;

import interfacePolimorfiaAndLegacies.oop.User;

import java.util.*;
import java.util.stream.Collectors;

public class UsersRepositoryImpl implements UserRepository {


    @Override
    public List<User> getAllUsers() {

        return users.stream().collect(Collectors.toList());

    }

    @Override
    public List<User> getAllUsersOrderBy(String fielddname, boolean isAsc) {
        if(fielddname.toUpperCase().equals("data urodzenia".toUpperCase())){
            if(isAsc){
                return users.stream()
                        .sorted(Comparator.comparing(User::getBirthDate))
                        .collect(Collectors.toList());  // List<User>
            }
            //malejąco
            return users.stream()
                    .sorted(Comparator.comparing(User::getBirthDate).reversed())
                    .collect(Collectors.toList());
        }else{
            System.out.println("Jeszcze nie sortujemy po takim polu");
        }
        return new ArrayList<>();
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
       return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public Map<Integer, User> getUsersGroupingByYear() {
        return null;
    }

    @Override
    public String getUsersInfo() {
        return null;
    }

    @Override
    public List<User> getUsersWithEncodedPassword() {
        return null;
    }

    public static void main(String[] args) {
        UserRepository userRepository = new UsersRepositoryImpl();
//        userRepository.getAllUsers().forEach(System.out::println);
//        String email =  "a@a.pl";
//        userRepository.getUserByEmail( email ).ifPresentOrElse(
//                user -> System.out.println("Znaleziono: " + user.toString()),
//                () -> System.out.println("Nie znaleziono użytkownika: " + email )
//        );
        userRepository.getAllUsersOrderBy("data urodzenia",true).forEach(System.out::println);
    }

}
