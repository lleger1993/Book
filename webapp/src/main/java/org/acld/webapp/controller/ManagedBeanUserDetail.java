package org.acld.webapp.controller;

import org.acld.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ManagedBeanUserDetail {

    private String id;
    private User user;
    
    @ManagedProperty(value="#{managedBeanUser}")
    private ManagedBeanUser managedBeanUser;

    public ManagedBeanUserDetail() {
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
}
