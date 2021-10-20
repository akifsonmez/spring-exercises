package com.akifsonmez.repository;

import com.akifsonmez.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    Book findBookByNameContainsAndDescriptionContains(String bookName, String contentKeyword);
}
