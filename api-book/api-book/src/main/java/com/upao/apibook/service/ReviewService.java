package com.upao.apibook.service;

import com.upao.apibook.model.Review;

import java.util.List;

public interface ReviewService {
    Review createReview (Review review, Long bookId, Long userId);

    List<Review> getReviewByBookId(Long bookId);

    List<Review> getReviewByBookIdAndUserId(Long bookId, Long userId);

    Review updateReview(Long id, Review review);

    void deleteReview(Long id);
}
