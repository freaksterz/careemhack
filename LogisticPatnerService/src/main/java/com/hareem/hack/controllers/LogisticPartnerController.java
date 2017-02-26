package com.hareem.hack.controllers;

import com.hareem.hack.models.LogisticPartner;
import com.hareem.hack.models.LogisticPartnerDao;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aman on 25/2/17.
 */
@RestController
//@RequestMapping(value = "/partner")
public class LogisticPartnerController {

    @Autowired
    LogisticPartnerDao logisticPartnerDao;

    @RequestMapping(value="/partner", method= RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody LogisticPartner logisticPartner){


        try {
           LogisticPartner logisticPartnerTemp = logisticPartner;

           logisticPartnerDao.save(logisticPartner);
            return new ResponseEntity<>(logisticPartner, HttpStatus.CREATED);

        }
        catch (Exception ex) {
            String errorMessage;
            errorMessage = ex + " <== error";
            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
        }
    }


}
