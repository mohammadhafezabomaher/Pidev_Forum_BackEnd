package com.example.pidev.services;

import com.example.pidev.entities.Contact;

public interface IContactService {
    public Contact addContact(Contact c);
    public Contact getContactById(Long id);
    public Contact updateContact(Contact c);
    public void deleteContact(Long id);
}
