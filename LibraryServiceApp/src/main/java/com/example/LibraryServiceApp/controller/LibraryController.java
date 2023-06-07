package com.example.LibraryServiceApp.controller;

import com.example.LibraryServiceApp.entity.Book;
import com.example.LibraryServiceApp.entity.Library;
import com.example.LibraryServiceApp.service.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/library")
@RestController
public class LibraryController {
    @Autowired
    private LibraryServiceImpl libraryService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Library getLibraryById(@PathVariable int id){

        Book book=restTemplate.getForObject("http://localhost:8083/book/"+id , Book.class);
        Library library= libraryService.getLibraryById(id);
        library.setBook(book);
        return  library;
    }

    @PostMapping("/")
    public Library insertLibrary(@RequestBody Library library){


        return libraryService.insertLibrary(library);
    }


}
