package com.example.LibraryServiceApp.service;

import com.example.LibraryServiceApp.entity.Library;

public interface LibraryService {

    public Library getLibraryById(int id);

    public Library insertLibrary(Library library);
}
