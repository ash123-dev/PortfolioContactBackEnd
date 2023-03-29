package com.example.akash.controller;

import com.example.akash.model.ContactDetails;
import com.example.akash.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/details")
public class ContactDetailsController {
    @Autowired
   ContactService contactService;
    @PostMapping("/add")
    public ResponseEntity<String> create(@RequestBody ContactDetails contactDetails){

        contactService.create(contactDetails);
        return new ResponseEntity<>("SUBMITTED SUCCESSFULLY", HttpStatus.ACCEPTED);




    }
}
