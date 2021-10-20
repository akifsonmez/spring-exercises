package com.akifsonmez.api;

import com.akifsonmez.entity.Book;
import com.akifsonmez.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookAPI {

    private final BookService bookService;


    @PostConstruct
    private void init() {
        Book crimeAndPunishment = new Book("B001", "Crime and Punishment", "Crime and Punishment " +
                "focuses on the mental anguish and moral dilemmas " +
                "of Rodion Raskolnikov, an impoverished ex-student in Saint Petersburg who formulates a plan to kill an " +
                "unscrupulous pawnbroker for her money. Before the killing, Raskolnikov believes that with the money " +
                "he could liberate himself from poverty and go on to perform great deeds. However, once it is done " +
                "he finds himself racked with confusion, paranoia, and disgust for his actions. His justifications " +
                "disintegrate completely as he struggles with guilt and horror and confronts the real-world consequences" +
                " of his deed.");
        bookService.addBook(crimeAndPunishment);
    }


    @GetMapping("/{bookNameKeyword}/{descriptionKeyword}")
    public Book searchBookWithContentKeyword(@PathVariable("bookNameKeyword") String bookNameKeyword, @PathVariable("descriptionKeyword") String descriptionKeyword) {
        return bookService.searchBookWithNameAndDescriptionKeywords(bookNameKeyword, descriptionKeyword);
    }
}
