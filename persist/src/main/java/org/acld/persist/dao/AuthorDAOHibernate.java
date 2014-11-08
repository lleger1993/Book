
package org.acld.persist.dao;

import org.acld.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("authorDAO")
public class AuthorDAOHibernate implements AuthorDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Author findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
   @Transactional
    public void save(Author t) {
     Session session=  this.sessionFactory.getCurrentSession();
     session.saveOrUpdate(t);
    }

    @Override
    public void delete(Author t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> findAll() {
        Session session=  sessionFactory.getCurrentSession();
        return session.createCriteria(Author.class).list();
    }
}
