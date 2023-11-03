package com.lucasoliveira.bookstoremanager.service;

import com.lucasoliveira.bookstoremanager.dto.MessageResponseDTO;
import com.lucasoliveira.bookstoremanager.entity.Book;
import com.lucasoliveira.bookstoremanager.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    @Autowired
    private IBookRepository repository;

    public MessageResponseDTO create(Book book) {
        Book savedBook = repository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }
}
