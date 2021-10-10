package com.cachingexample.cachingapp.repository;

import com.cachingexample.cachingapp.model.Book;

public interface BookRepository {

    Book getByIsbn(String isdn);
}
