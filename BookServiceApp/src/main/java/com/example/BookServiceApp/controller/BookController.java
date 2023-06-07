package com.example.BookServiceApp.controller;

import com.example.BookServiceApp.entity.Book;
import com.example.BookServiceApp.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);

    }

    @PostMapping("/")
    public Book insertBook(@RequestBody Book book){
        return bookService.insertBook(book);

    }
}


