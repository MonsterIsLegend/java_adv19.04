package user;

import java.time.LocalDate;

public class Main {



    public static void main(String[] args) {
        User user = new User(
                "js","js", "jaaanek9(@gmail.com",
                LocalDate.of(1999,5,16)
        );
        System.out.println(user);

        Admin admin = new Admin("aa", "bb", "ja@wp.pl", LocalDate.of(1999 , 5 , 16),
        new String[]{"R","W","a"},"Jan", "Solski"
        );

        admin.setName("XD");
        admin.setStatus(false);
        System.out.println(admin);


    }


}
