package com.example.pidev.controllers;

import com.example.pidev.entities.Contact;
import com.example.pidev.services.IContactService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/contact")
public class ContactController {
    IContactService contactService;
    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact c){
        return contactService.addContact(c);
    }
    @GetMapping("/get/{id}")
    public Contact getContactById(@PathVariable("id") Long id){
        return contactService.getContactById(id);
    }
    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact c){
        return contactService.updateContact(c);
    }
}
