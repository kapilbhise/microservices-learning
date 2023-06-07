package com.example.BookServiceApp.service;

import com.example.BookServiceApp.entity.Book;

public interface BookService {

    public Book getBookById(int id);

    public Book insertBook(Book book);
}
