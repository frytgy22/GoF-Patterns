package patterns.behavioral.iterator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("some author", "some title", LocalDate.of(2001, 2, 25));
        Book secondBook = new Book("new author", "new title", LocalDate.of(1985, 12, 3));
        Book thirdBook = new Book("author", "one title", LocalDate.of(2020, 5, 5));

        List<Book> books = Arrays.asList(firstBook, secondBook, thirdBook);

        Library library = new Library(books);
        library.getAuthorIterator().forEachRemaining(System.out::println);
        library.getTitleIterator().forEachRemaining(System.out::println);
        library.getDateIterator().forEachRemaining(System.out::println);
    }
}
