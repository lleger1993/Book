/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acld.persist.dao;

import org.acld.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author joseluis
 */
@Repository("countryDAO")
public class CountryDAOHibernate implements CountryDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(readOnly=true)
    public Country findbyId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
   @Transactional
    public void save(Country t) {
     Session session=  this.sessionFactory.getCurrentSession();
     session.saveOrUpdate(t);
    }

    @Override
    public void delete(Country t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly=true)
    public List<Country> findAll() {
    Session session=  sessionFactory.getCurrentSession();
    return session.createCriteria(Country.class).list();
    }
    
}
