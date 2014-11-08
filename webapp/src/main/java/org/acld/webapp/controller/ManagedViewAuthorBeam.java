
package org.acld.webapp.controller;


import org.acld.model.Author;
import org.acld.service.AuthorService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="managedViewAuthorBeam")
@ViewScoped
public class ManagedViewAuthorBeam implements Serializable {

    @ManagedProperty(value = "#{authorService}")
    private AuthorService authorService;
    public List<Author> authors;

    public ManagedViewAuthorBeam() {

    }
    @PostConstruct
    public void init(){
        this.authors = authorService.findAll();

    }
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
