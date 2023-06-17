package com.example.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Book;
import com.example.proyectofinal.repository.iBookrepository;

@Service
public class BookService {
    private final iBookrepository bookRepository;

    public BookService(iBookrepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public Book get(String bookId) {
        return bookRepository.get(bookId);
    }

    public Book addBook(Book book) {
        book.setBookId(null);
        return bookRepository.save(book);
    }

    public Book updateBook(String bookId, Book book) {
        Book bookR = bookRepository.get(bookId);
        if (bookR == null) {
            return null;
        }
        book.setBookId(bookId);
        return bookRepository.save(book);
    }

    public Book deleteBook(String bookId) {
        return bookRepository.delete(bookId);

    }

}
