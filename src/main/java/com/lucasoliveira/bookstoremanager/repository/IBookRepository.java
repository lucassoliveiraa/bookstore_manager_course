package com.lucasoliveira.bookstoremanager.repository;

import com.lucasoliveira.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
