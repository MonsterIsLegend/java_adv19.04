package abstractClasses;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DataBaseConnector {

    private String databaseUrl;

    private String userName;

    private String password;

    private boolean isConnected;

    public static Object[] records = new Object[10];

// 1. Wyswietlajaca dane dotyczace polaczenia z baza danych i zwracajaca obiekt polaczenie
    //nazwa connect
    // argumenty database, user i password
    // jezeli arg sa rozne od null to is Connceted jest prawdziwe
    //  przeciwnym przpadlu false

    public boolean connect(  String database, String userName, String password){
        if( database != null  && userName != null && password != null){
            isConnected = true;
        }
        return isConnected;

    }
    //2 metoda close do zamkykania polaczzenia
    public abstract void close();
    // 3. metoda do wprowadzania nowego rekordu
    public abstract void insert(Object o);
    //4. metoda abstrakcyjna do zwracania wszsytkich rekordów z tabeli
    public abstract Object [] select();

    public static void main(String[] args) {
        DataBaseConnector db = new MySQLConnector();
        db.connect("xd","monsterislegend", "xd");
        db.insert("abc");
        db.insert(10);
        for( Object xd : db.select()){
            System.out.println(xd);
        }
        db.close();

    }



}
