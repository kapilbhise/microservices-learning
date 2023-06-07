package com.example.BookServiceApp.service;

import com.example.BookServiceApp.entity.Book;
import com.example.BookServiceApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book insertBook(Book book) {
        return bookRepository.save(book);
    }
}
