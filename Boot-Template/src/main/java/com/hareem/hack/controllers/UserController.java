package com.hareem.hack.controllers;

import com.hareem.hack.models.User;
import com.hareem.hack.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aman on 25/2/17.
 */
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String mobileNo, String email) {
        User user = null;
        try {
            user = new User(mobileNo, email);
            userDao.save(user);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + user.getId() + ")";
    }


    /*@RequestMapping("/getById")
    @ResponseBody
    public String getById(Long id) {
        String userId;
        try {
            User user = userDao.getUserById(id);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> users;
        try{
            users = userDao.findAll();
        }
        catch (Exception ex){
            return null;
        }

        return users;
    }


    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String email, String name) {
        try {
            User user = userDao.findOne(id);
            user.setEmail(email);
            userDao.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }
*/


}
