package org.acld.persist.dao;

import org.acld.model.Libro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 11/1/2014.
 */
@Repository("libroDAO")
public class LibroDAOHibernate implements LibroDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Libro findbyId(Long aLong) {
        Session session=  this.sessionFactory.getCurrentSession();
        return (Libro) session.createCriteria(Libro.class).add(Restrictions.eq("id",aLong));
    }

    @Override
    public void save(Libro libro) {
        Session session=  this.sessionFactory.getCurrentSession();
        session.saveOrUpdate(libro);
    }

    @Override
    public void delete(Libro libro) {
        Session session=  this.sessionFactory.getCurrentSession();
        session.delete(libro);
    }

    @Override
    public List<Libro> findAll() {
        Session session=  this.sessionFactory.getCurrentSession();
        return session.createCriteria(Libro.class).list();
    }
}
