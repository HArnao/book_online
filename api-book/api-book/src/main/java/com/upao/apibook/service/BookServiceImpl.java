package com.upao.apibook.service;

import com.upao.apibook.model.Book;
import com.upao.apibook.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Book createBook(String title, String author, String description, MultipartFile image) {
        Book book = new Book(title,author,description,"", LocalDateTime.now(), LocalDateTime.now());
        return bookRepository.save(book);
    }
    /* Probando crear con fecha de modificacion y creacion
    public Book createBook(Book book) {return bookRepository.save(book);
    }
    */

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
