package patterns.behavioral.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Book {
    private String author;
    private String title;
    private LocalDate date;
}
