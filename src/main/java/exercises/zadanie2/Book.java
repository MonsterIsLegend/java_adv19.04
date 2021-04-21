package exercises.zadanie2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book  {

    private String isbn;

    private String title;

    private String author;

    private int publicationYear;



}
