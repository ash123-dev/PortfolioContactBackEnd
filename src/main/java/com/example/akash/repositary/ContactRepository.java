package com.example.akash.repositary;

import com.example.akash.model.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<ContactDetails,Integer> {
}
