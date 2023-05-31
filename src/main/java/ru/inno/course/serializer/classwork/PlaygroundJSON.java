package ru.inno.course.serializer.classwork;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlaygroundJSON {

    public static void main(String[] args) throws IOException {
        List<Author> authors = new ArrayList<>();
        Author a1 = new Author();
        Author a2 = new Author();
        a1.setName("Илья");
        a1.setLastName("Ильф");
        a2.setName("Евгений");
        a2.setLastName("Петров");
        authors.add(a1);
        authors.add(a2);

        Book book = new Book();
        book.setIsbn("234035-235236-15246");
        book.setTitle("12 стульев");
        book.setAuthor(authors);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(
                Path.of("/Users/eremin/Documents/java-projects/myFirstApp/src/main/resources/json/book.json").toFile(),
                book
        );

        Book bookFromFile = mapper.readValue(
                Path.of("/Users/eremin/Documents/java-projects/myFirstApp/src/main/resources/json/book1.json").toFile(),
                Book.class
        );

        bookFromFile.getAuthor().get(0).getLastName();

        System.out.println(bookFromFile);

    }
}
