package com.werth.web;

import generics.Book;
import generics.Library;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @GetMapping("/")
    public void hello() {
        Library library = new Library();

    }
}
