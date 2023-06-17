package com.example.proyectofinal.util;

import org.springframework.stereotype.Component;

import com.example.proyectofinal.model.Book;
import com.example.proyectofinal.service.BookService;

import jakarta.annotation.PostConstruct;

@Component
public class BookFiller {
    private final BookService bookService;

    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {
        Book book1 = new Book("Harry Potter y la piedra filosofal",
                "El primer libro de la famosa serie de Harry Potter, donde un niño huérfano descubre que es un mago y es admitido en la Escuela de Magia y Hechicería de Hogwarts",
                "J.K. Rowling");
        bookService.addBook(book1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Book book2 = new Book("Cien años de soledad",
                " Una obra maestra del realismo mágico que narra la historia de la familia Buendía a lo largo de varias generaciones, en un pueblo ficticio llamado Macondo",
                "Gabriel García Márquez");
        bookService.addBook(book2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Book book3 = new Book("El Gran Gatsby",
                "Ambientada en la próspera década de 1920, esta novela retrata la vida de Jay Gatsby, un enigmático millonario obsesionado con recuperar un amor perdido",
                "F. Scott Fitzgerald");
        bookService.addBook(book3);
    }
}
