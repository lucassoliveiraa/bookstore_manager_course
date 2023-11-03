package com.lucasoliveira.bookstoremanager.service;

;
import com.lucasoliveira.bookstoremanager.dto.BookDTO;
import com.lucasoliveira.bookstoremanager.dto.MessageResponseDTO;
import com.lucasoliveira.bookstoremanager.entity.Book;
import com.lucasoliveira.bookstoremanager.mapper.IBookMapper;
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

    private final IBookMapper bookMapper = IBookMapper.INSTANCE;
    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = bookMapper.toModel(bookDTO);
        Book savedBook = repository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }
}
