package com.upao.apibook.service;

import com.upao.apibook.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();
}
