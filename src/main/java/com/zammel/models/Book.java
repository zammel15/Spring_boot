package com.zammel.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set ;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String title ;
    private String isbn ;
    private String publisher ;

    @ManyToMany(mappedBy = "authors")
    private Set<Author> authors = new HashSet<>() ;

    public Book() {
    }

    public Book(String title, String isbn, String publisher , Long id ) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.id = id ;
    }

    public Book(String title, String isbn, String publisher,Long id  ,Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
        this.id = id ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}



