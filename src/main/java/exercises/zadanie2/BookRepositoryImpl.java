package exercises.zadanie2;

import static exercises.zadanie2.BookRepository.books;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public void addBook(String isbn, String title, String author, int publicationYear) {
        books.add(new Book(isbn, title, author, publicationYear));
    }

    @Override
    public void removeBook(int index) {
        Book foundBook = null;
        try {

            for (Book book : books) {
                if (books.indexOf(book) == index) {
                    books.remove(book);
                    foundBook = book;
                    break;
                }
            }
            if ( foundBook == null) {
                throw new NoBookFoundException(index);
            }
        } catch (NoBookFoundException ex) {
            ex.printStackTrace();
        }


    }

    @Override
    public Book getBookByTitle(String title) {
        Book foundBook = null;
        try {

            for (Book b : books) {
                if (b.getTitle().equals(title)) {
                    foundBook = b;
                }
            }
            if (foundBook == null) {
                throw new NoBookFoundException( title);
            }

        }catch (NoBookFoundException ex){
            ex.printStackTrace();
        }
        return foundBook;
    }

    @Override
    public Book getBookById(int index) {
        Book foundBook = null;
        try {
            for (Book book : books) {
                if (books.indexOf(book) == index) {
                    foundBook = book;
                    break;
                }
            }
            if ( index < 0 || index > books.size()) {
                throw new NoBookFoundException(index);
            }


        }catch(NoBookFoundException exception){
            exception.printStackTrace();

        }
        return foundBook;
    }


}
