
package org.acld.webapp.controller;

import org.acld.model.Libro;
import org.acld.model.User;
import org.acld.service.LibroService;
import org.acld.service.UserService;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="managedBeanLibro")
@ViewScoped
public class ManagedBeanLibro implements Serializable {

    private List<User> autores;
    private String autorSelected;
    private Libro libro;
    private  List<Libro> libros;
    @ManagedProperty(value = "#{libroService}")
    private LibroService libroService;
    @ManagedProperty(value = "#{userService}")
    private UserService userService;
    @ManagedProperty(value = "#{configuration}")
    private Configuration configuration;

    public ManagedBeanLibro() {
    }



    @PostConstruct
    public void init(){
    libro = new Libro();
        autores = userService.findAll();
    }


    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }



    public String onSave(){
        libro.setAutor(new User(Long.valueOf(autorSelected)));
        libroService.save(libro);
        return "viewLibro.xhtml";
    }

    public List<User> getAutores() {
        return autores;
    }

    public void setAutores(List<User> autores) {
        this.autores = autores;
    }

    public String getAutorSelected() {
        return autorSelected;
    }

    public void setAutorSelected(String autorSelected) {
        this.autorSelected = autorSelected;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public LibroService getLibroService() {
        return libroService;
    }

    public void setLibroService(LibroService libroService) {
        this.libroService = libroService;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

