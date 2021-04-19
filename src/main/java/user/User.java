package user;


import java.time.LocalDate;
import java.time.LocalDateTime;

//klasa modelu - klasat determinuąca strukture danych
// klasa modelu  -> model JavaBeans:
// -> prywatne pola klasowe
// -> konstruktor/y
// -> public metody do pól klasowych  ( gettery i settery)
//

public class User {
    // pola klasowe
    private String login;
    private String password;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime registrationDateTime;
    private boolean status;

    public User(String login, String password, String email, LocalDate birthDate) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
        this.registrationDateTime = LocalDateTime.now();
        this.status = true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                //", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", registrationDateTime=" + registrationDateTime +
                ", status=" + status +
                '}';
    }


    //metody



}
