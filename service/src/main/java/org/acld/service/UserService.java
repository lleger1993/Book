/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acld.service;

import org.acld.model.User;
import org.acld.persist.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *
 * @author joseluis
 */

@Service("userService")
public class UserService {

   @Autowired
    private UserDAO userDAO;

    public void save(User user){
        userDAO.save(user);
    }

    public User findbyId(Long id){
        return  userDAO.findbyId(id);
    }

    public List<User> findAll(){
        return userDAO.findAll();
    }

  
}
