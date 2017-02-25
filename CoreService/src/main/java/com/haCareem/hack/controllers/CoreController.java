package com.haCareem.hack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.haCareem.hack.dto.Quotation;
import com.haCareem.service.ICoreService;
import com.hacareem.utils.Package;

/**
 * Created by aman on 25/2/17.
 */
@RestController
public class CoreController {

    @Autowired
    ICoreService coreService;

    @RequestMapping("/quot")
    @ResponseBody
    public List<Quotation> getQuot(@RequestParam String source, @RequestParam String destination, @RequestParam String size, @RequestParam String type, @RequestParam float wight, @RequestParam String srcZipCode ,@RequestParam String destZipCode) {
    	List<Quotation> quotations=null;
    	coreService.getQuotation(source, destination, size, type, wight);
    	return quotations;
    }
    @RequestMapping("/quot")
    @ResponseBody
    public List<Quotation> create(@RequestParam Package shipment) {
    	List<Quotation> quotations=null;
//    	coreService.getQuotation(test);
    	return quotations;
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
