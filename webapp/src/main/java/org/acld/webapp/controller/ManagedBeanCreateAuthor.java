
package org.acld.webapp.controller;

import org.acld.model.Author;
import org.acld.service.AuthorService;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name="managedBeanCreateAuthor")
@ViewScoped
public class ManagedBeanCreateAuthor implements Serializable {
    
    private Author author;

    @ManagedProperty(value = "#{authorService}")
    private AuthorService authorService; 

    public ManagedBeanCreateAuthor() {
    }

    @PostConstruct
    public void init(){
        author = new Author();
    }

    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String onSave(){
        authorService.save(author);
        return "viewAuthor.xhtml";
    }
}
