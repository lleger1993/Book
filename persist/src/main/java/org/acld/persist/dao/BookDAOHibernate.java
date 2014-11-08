
package org.acld.persist.dao;

import org.acld.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("bookDAO")
public class BookDAOHibernate implements BookDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Book findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
   @Transactional
    public void save(Book t) {
     Session session=  this.sessionFactory.getCurrentSession();
     session.saveOrUpdate(t);
    }

    @Override
    public void delete(Book t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> findAll() {
        Session session=  sessionFactory.getCurrentSession();
        return session.createCriteria(Book.class).list();
    }
}
