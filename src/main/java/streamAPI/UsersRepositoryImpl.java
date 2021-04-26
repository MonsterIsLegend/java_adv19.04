package streamAPI;


import interfacePolimorfiaAndLegacies.oop.User;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class UsersRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUsers() {
        return users.stream().collect(Collectors.toList());
    }

    @Override
    public List<User> getAllUsersOrderBy(String filedName, boolean isAsc) {
        if (filedName.toUpperCase().equals("data urodzenia".toUpperCase())) {
            if (isAsc) { // rosnąco
                return users.stream()                                       // Stream<Statics.User>
                        .sorted(Comparator.comparing(User::getBirthDate))   // Stream<Statics.User>
                        .collect(Collectors.toList());                      // List<Statics.User>
            }
            // malejąco
            return users.stream()
                    .sorted(Comparator.comparing(User::getBirthDate).reversed())
                    .collect(Collectors.toList());
            // } else if(){ -> dla innych pól
        } else {
            System.out.println("Jeszcze nie sortujemy po takim polu: " + filedName);
            return new ArrayList<>();
        }
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    @Override
    public Map getUsersGroupingByYears() {
        return users.stream().collect(Collectors.groupingBy(user -> user.getBirthDate().getYear()));
    }


    @Override
    public String getUsersInfo() {
        return String.format("| %10s | %10s | %10s | %10s |\n", "login", "email", "password", "birthdate") +
                users.stream()
                        .map(user -> String.format(
                                "| %10s | %10s | %10s | %10s |",
                                user.getLogin(), user.getEmail(), user.getPassword(), user.getBirthDate()
                                )
                        )
                        .collect(Collectors.joining("\n"));
    }

    @Override
    public List<User> getUsersWithEncodedPassword(String algorithmName) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithmName); // Klasa zawierająca algorytmy szyfrujące
            return users.stream()
                    .map(user -> {
                        byte [] byteHash = md.digest(user.getPassword().getBytes());
                        String hash = "";
                        for(int i = 0; i < byteHash.length; i++){
                            hash += String.format("%02x",byteHash[i]);
                        }
                        user.setPassword(hash);                       // aktualizacja hasła
                        return user;                                     // zarócenie użytkownika z zaktualizowanym hasłem
                    })
                    .collect(Collectors.toList());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static void main(String[] args) {
        UserRepository userRepository = new UsersRepositoryImpl();
        userRepository.getAllUsers().forEach(System.out::println);
        String email = "c@c.pl";
        userRepository.getUserByEmail(email).ifPresentOrElse(
                user -> System.out.println("Znaleziono: " + user.toString()),
                () -> System.out.println("Nie znaleziono użytkownika " + email)
        );
        System.out.println("SORTOWANIE");
        userRepository.getAllUsersOrderBy("data urodzenia", false).forEach(System.out::println);
        System.out.println("UŻYTKOWNICY");
        System.out.println(userRepository.getUsersInfo());
        System.out.println("GRUPOWANIE");
        Map<Integer, List<User>> groupOfUser = userRepository.getUsersGroupingByYears();
        for (Integer o : groupOfUser.keySet()) {
            System.out.printf("%10d : %10d\n", o, groupOfUser.get(o).size());
        }
        System.out.println("SZYFROWANIE");
        userRepository.getUsersWithEncodedPassword("md5").forEach(user -> System.out.println(user.getEmail() + " " + user.getPassword()));

    }

}