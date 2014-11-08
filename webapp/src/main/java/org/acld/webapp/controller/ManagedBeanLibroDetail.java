/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acld.webapp.controller;

import org.acld.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author joseluis
 */
@ManagedBean
@ViewScoped
public class ManagedBeanLibroDetail {

    private String id;
    private User user;

    @ManagedProperty(value="#{managedBeanLibro}")
    private ManagedBeanUser managedBeanUser;
    /**
     * Creates a new instance of ManagedBeanUserDetail
     */
    public ManagedBeanLibroDetail() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ManagedBeanUser getManagedBeanUser() {
        return managedBeanUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
   /* public String init(){
       user = managedBeanUser.findById(id);
        
        return "";
    }*/
    
    
}
