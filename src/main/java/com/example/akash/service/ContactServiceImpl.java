package com.example.akash.service;

import com.example.akash.model.ContactDetails;
import com.example.akash.repositary.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
 ContactRepository contactRepository;
    @Override
    public ContactDetails create(ContactDetails contactDetails) {

       return contactRepository.save(contactDetails);


    }
}
