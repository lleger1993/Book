
package org.acld.service;

import org.acld.model.Book;
import org.acld.persist.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookService {

   @Autowired
    private BookDAO bookDAO;

    public void save(Book book){
        bookDAO.save(book);
    }

    public Book findById(Long id){
        return  bookDAO.findById(id);
    }

    public List<Book> findAll(){
        return bookDAO.findAll();
    }

  
}
