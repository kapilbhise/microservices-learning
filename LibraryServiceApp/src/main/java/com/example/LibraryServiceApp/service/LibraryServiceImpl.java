package com.example.LibraryServiceApp.service;

import com.example.LibraryServiceApp.entity.Library;
import com.example.LibraryServiceApp.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements  LibraryService{

    @Autowired
    private LibraryRepository libraryRepository;
    @Override
    public Library getLibraryById(int id) {
        return libraryRepository.findById(id).get();
    }

    @Override
    public Library insertLibrary(Library library) {
        return libraryRepository.save(library);
    }
}
