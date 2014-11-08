/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acld.webapp.controller;


import org.acld.model.Country;
import org.acld.model.User;
import org.acld.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author joseluis
 */
@ManagedBean(name="managedBeanUser")
@ViewScoped
public class ManagedBeanUser implements Serializable {
    
    private List<Country> countries;

    public String getSelectedcountryId() {
        return selectedcountryId;
    }

    public void setSelectedcountryId(String selectedcountryId) {
        this.selectedcountryId = selectedcountryId;
    }

    private String selectedcountryId;
    private User user;

    @ManagedProperty(value = "#{userService}")
    private UserService userService; 
   
    
    @ManagedProperty(value = "#{configuration}")
    private Configuration configuration;
   
    /**
     * Creates a new instance of ManagedBeanUser
     */
    public ManagedBeanUser() {
    }



    @PostConstruct
    public void init(){
        user = new User();
        countries = configuration.getCountries();
    }

    public User getUser() {
        return user;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public String onSave(){
        user.setCountry(new Country(Long.valueOf(selectedcountryId)));
        userService.save(user);
        return "viewUser.xhtml";
    }
}
