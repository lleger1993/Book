package org.acld.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Author {
    private long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;
    private Date birthDate;
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void addBook(Book book){
        book.setAuthor(this);
        books.add(book);
    }

    public void addBooks(Collection<Book> books){
        for(Book book: books){
            addBook(book);
        }
    }
}
