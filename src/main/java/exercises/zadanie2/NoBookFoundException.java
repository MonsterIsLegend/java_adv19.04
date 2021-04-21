package exercises.zadanie2;

public class NoBookFoundException extends Exception {

public NoBookFoundException( String title ){
    System.out.println("Nie znaleziono ksiązki o takim tytule");
}
public NoBookFoundException( int index ){
    System.out.println("Nie znaleziono ksiązki o takim ID");
}


}
