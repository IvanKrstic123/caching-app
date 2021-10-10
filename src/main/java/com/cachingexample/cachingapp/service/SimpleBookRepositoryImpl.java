package com.cachingexample.cachingapp.service;

import com.cachingexample.cachingapp.model.Book;
import com.cachingexample.cachingapp.repository.BookRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepositoryImpl implements BookRepository {

    @Override
    @Cacheable("books")
    public Book getByIsbn(String isdn) {
        simulateSlowService();
        return new Book(isdn, "Some book");
    }

    private void simulateSlowService() {
        long time = 3000L;
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
