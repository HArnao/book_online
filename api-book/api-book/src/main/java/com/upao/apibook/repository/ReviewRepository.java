package com.upao.apibook.repository;

import com.upao.apibook.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBookId(Long bookId);

    List<Review> findByUserId(Long userId);
}
