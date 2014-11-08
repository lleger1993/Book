
package org.acld.service;

import org.acld.model.Libro;
import org.acld.model.User;
import org.acld.persist.dao.LibroDAO;
import org.acld.persist.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("libroService")
public class LibroService {

   @Autowired
    private LibroDAO libroDAO;

    public void save(Libro user){
        libroDAO.save(user);
    }

    public  Libro findbyId(Long id){
        return  libroDAO.findbyId(id);
    }

    public List<Libro> findAll(){
        return libroDAO.findAll();
    }

  
}
