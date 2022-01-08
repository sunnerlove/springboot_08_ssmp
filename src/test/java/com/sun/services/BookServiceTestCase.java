package com.sun.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;
    @Autowired
    private IBookService ibookService;
    @Test
    void testSave(){
        bookService.getById(2);
    }

    @Test
    void testGetAll(){
        ibookService.list();
    }
}
