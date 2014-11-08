
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

@ManagedBean(name="managedViewLibroBeam")
@ViewScoped
public class ManagedViewLibroBeam implements Serializable {

    @ManagedProperty(value = "#{libroService}")
    private LibroService libroService;
    public List<Libro> libros;


    public ManagedViewLibroBeam() {

    }
    @PostConstruct
    public void init(){
        this.libros = libroService.findAll();

    }
    public void setUserService(LibroService libroService) {
        this.libroService = libroService;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setUsers(List<Libro> libros) {
        this.libros = libros;
    }

    public LibroService getLibroService() {
        return libroService;
    }

    public void setLibroService(LibroService libroService) {
        this.libroService = libroService;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}

