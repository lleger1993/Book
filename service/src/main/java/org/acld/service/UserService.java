
package org.acld.service;

import org.acld.model.User;
import org.acld.persist.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

   @Autowired
    private UserDAO userDAO;

    public void save(User user){
        userDAO.save(user);
    }

    public User findById(Long id){
        return  userDAO.findById(id);
    }

    public List<User> findAll(){
        return userDAO.findAll();
    }

  
}
