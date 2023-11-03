package com.lucasoliveira.bookstoremanager.mapper;

import com.lucasoliveira.bookstoremanager.dto.BookDTO;
import com.lucasoliveira.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IBookMapper {

    IBookMapper INSTANCE = Mappers.getMapper(IBookMapper.class);
    Book toModel(BookDTO bookDTO);
    BookDTO toDTO(Book book);

}
