package com.example.proyectofinal.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.proyectofinal.model.Book;

@Repository
public class MemoryBookRepository implements iBookrepository {
    private Map<String, Book> booksMap;

    MemoryBookRepository() {
        booksMap = new HashMap<>();
    }

    @Override
    public List<Book> getAll() {
        List<Book> ret = new ArrayList<>();
        ret.addAll(booksMap.values());
        return ret;

    }

    @Override
    public Book get(String bookId) {
        return booksMap.get(bookId);
    }

    @Override
    public Book save(Book book) {
        if (book.getBookId() == null)
            ;
        {
            book.setBookId(String.valueOf(System.currentTimeMillis()));
        }
        return booksMap.put(book.getBookId(), book);
    }

    @Override
    public Book delete(String bookId) {
        return booksMap.remove(bookId);
    }

}
