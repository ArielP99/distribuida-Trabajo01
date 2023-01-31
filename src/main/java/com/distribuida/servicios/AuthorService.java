package com.distribuida.servicios;

import com.distribuida.db.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthors();

    Author findById(Long id);

    void createAuthor(Author author);

    void updateAuthor(Long id, Author author) throws Exception;

    void deleteAuthor(Long id);
}
