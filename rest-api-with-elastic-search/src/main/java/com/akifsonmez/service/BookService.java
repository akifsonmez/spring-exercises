package com.akifsonmez.service;

import com.akifsonmez.entity.Book;
import com.akifsonmez.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public Book searchBookWithNameAndDescriptionKeywords(String bookName, String description) {
        return bookRepository.findBookByNameContainsAndDescriptionContains(bookName, description);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
