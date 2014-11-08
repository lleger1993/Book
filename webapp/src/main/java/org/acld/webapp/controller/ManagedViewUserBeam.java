
package org.acld.webapp.controller;


import org.acld.model.User;
import org.acld.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name="managedViewUserBeam")
@ViewScoped
public class ManagedViewUserBeam implements Serializable {

    @ManagedProperty(value = "#{userService}")
    private UserService userService;
    public List<User> users;

    public ManagedViewUserBeam() {

    }
    @PostConstruct
    public void init(){
        this.users = userService.findAll();

    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
