package ru.inno.course.serializer.classwork;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlaygroundXML {

    public static void main(String[] args) throws JAXBException {
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

        JAXBContext context = JAXBContext.newInstance(Book.class, Author.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(book, Path.of("/Users/eremin/Documents/java-projects/myFirstApp/src/main/resources/xml/book1.xml").toFile());

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object o = unmarshaller.unmarshal(Path.of("/Users/eremin/Documents/java-projects/myFirstApp/src/main/resources/xml/book1.xml").toFile());
        Book b = (Book) o;
        System.out.println(b);

    }
}
