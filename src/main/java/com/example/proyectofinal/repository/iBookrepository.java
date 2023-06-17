package com.example.proyectofinal.repository;

import java.util.List;

import com.example.proyectofinal.model.Book;

public interface iBookrepository {
    public List<Book> getAll();

    public Book get(String bookId);

    public Book save(Book book);

    public Book delete(String bookId);

}
