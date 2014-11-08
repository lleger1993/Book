
package org.acld.service;

import org.acld.model.Author;
import org.acld.persist.dao.AuthorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("authorService")
public class AuthorService {

   @Autowired
    private AuthorDAO authorDAO;

    public void save(Author author){
        authorDAO.save(author);
    }

    public Author findById(Long id){
        return  authorDAO.findById(id);
    }

    public List<Author> findAll(){
        return authorDAO.findAll();
    }

  
}
