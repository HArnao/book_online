package com.upao.apibook.service;

import com.upao.apibook.model.Book;
import com.upao.apibook.model.FavoriteBook;

import java.util.List;

public interface FavoriteBookService {
    FavoriteBook addFavoriteBook (Long bookId, Long userId);
    List<Book> getFavoriteBookByUserId(Long userId);
    void removeFavoriteBook(Long bookId, Long userId);
}
