package com.lucasoliveira.bookstoremanager.controller;

import com.lucasoliveira.bookstoremanager.dto.BookDTO;
import com.lucasoliveira.bookstoremanager.dto.MessageResponseDTO;
import com.lucasoliveira.bookstoremanager.entity.Book;
import com.lucasoliveira.bookstoremanager.repository.IBookRepository;
import com.lucasoliveira.bookstoremanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping()
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
