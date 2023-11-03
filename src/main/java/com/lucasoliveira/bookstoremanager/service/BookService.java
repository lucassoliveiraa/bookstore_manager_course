package com.lucasoliveira.bookstoremanager.service;

;
import com.lucasoliveira.bookstoremanager.dto.BookDTO;
import com.lucasoliveira.bookstoremanager.dto.MessageResponseDTO;
import com.lucasoliveira.bookstoremanager.entity.Book;
import com.lucasoliveira.bookstoremanager.repository.IBookRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
@AllArgsConstructor
public class BookService {
    @Autowired
    private IBookRepository repository;

    public MessageResponseDTO create(BookDTO bookDTO) {
        System.out.println("Aqui");
        Book bookToSave = Book.builder()
                .name(bookDTO.name())
                .pages(bookDTO.pages())
                .chapters(bookDTO.chapters())
                .isbn(bookDTO.isbn())
                .publisherName(bookDTO.publisherName())
                .author(bookDTO.author())
                .build();

        Book savedBook = repository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }
}
