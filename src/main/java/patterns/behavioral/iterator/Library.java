package patterns.behavioral.iterator;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Library {
    private final Collection<Book> books;

    public Iterator<String> getAuthorIterator() {
        return new AuthorIterator();
    }

    public Iterator<LocalDate> getDateIterator() {
        return new DateIterator();
    }

    public Iterator<String> getTitleIterator() {
        return new TitleIterator();
    }

    private class AuthorIterator implements Iterator<String> {
        private int index;
        private final List<String> authors = getAuthors();

        @Override
        public boolean hasNext() {
            return index < authors.size();
        }

        @Override
        public String next() {
            return authors.get(index++);
        }
    }

    private class DateIterator implements Iterator<LocalDate> {
        private int index;
        private final List<LocalDate> dates = getDates();

        @Override
        public boolean hasNext() {
            return index < dates.size();
        }

        @Override
        public LocalDate next() {
            return dates.get(index++);
        }
    }

    private class TitleIterator implements Iterator<String> {
        private int index;
        private final List<String> titles = getTitles();

        @Override
        public boolean hasNext() {
            return index < titles.size();
        }

        @Override
        public String next() {
            return titles.get(index++);
        }
    }

    private List<String> getAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .sorted()
                .collect(Collectors.toList());
    }

    private List<String> getTitles() {
        return books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    private List<LocalDate> getDates() {
        return books.stream()
                .map(Book::getDate)
                .sorted()
                .collect(Collectors.toList());
    }
}
