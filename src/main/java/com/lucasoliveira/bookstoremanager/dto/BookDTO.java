package com.lucasoliveira.bookstoremanager.dto;

import com.lucasoliveira.bookstoremanager.entity.Author;

public record BookDTO(String name, Integer pages, Integer chapters, String isbn, String publisherName, Author author) {
}