package com.upao.apibook.repository;

import com.upao.apibook.model.Book;
import com.upao.apibook.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();
    Optional<Book> findById(Long id);

    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title);

    Book save(Book book);
}
