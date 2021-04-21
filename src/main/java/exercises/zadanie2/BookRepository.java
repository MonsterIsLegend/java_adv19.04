package exercises.zadanie2;

import java.util.ArrayList;
import java.util.List;
//Klasa BookRepository Zaimplementuj klasęBookRepository, która będzie odpowiedzialna za:
// dodawanie obiektów typu Booku
// wyszukiwanie obiektów typu Book o wskazanej nazwie
// wyszukiwanie obiektu typu Book o wskazanym id
// usuwanie obiektów typu Book na podstawie przekazanego id
public interface BookRepository {

    List<Book> books = new ArrayList<>();

    void addBook( String isbn, String title, String Author, int publicationYear);

    void removeBook( int index );

    Book getBookByTitle( String title);

    Book getBookById ( int index );







}
