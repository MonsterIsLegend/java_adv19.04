package exercises.zad5IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class CsvParser {

    private List<User> users = new ArrayList<>();
    private final String PATH = Paths.get("").toAbsolutePath().toString() +"\\src\\main\\java\\exercises\\zad5IO\\users.csv";

    private List<User> getUsersFromCsvFile() {
        try {
            Scanner sc = new Scanner(new File(PATH));

            String[] userTable;

            List<User> returnList = new ArrayList<>();

            while (sc.hasNextLine()) {
                userTable = sc.nextLine().split(",");
                returnList.add(new User(userTable[0], userTable[1], Integer.valueOf(userTable[2])));
            }
            sc.close();
            return returnList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    private void addUserToCsvFile(User user){
        try {
            getUsersFromCsvFile().add(user);
            FileWriter fw = new FileWriter(PATH, true);
            fw.append(user.getName() + "," + user.getLastname() + "," + user.getAge() + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {
        CsvParser csvParser = new CsvParser();
        User user = new User("Jan","Solski",22);
        csvParser.addUserToCsvFile(user);
        csvParser.getUsersFromCsvFile().forEach(System.out::println);
    }
}
