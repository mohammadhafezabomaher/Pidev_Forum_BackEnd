package com.example.pidev.services;

import com.example.pidev.entities.Contact;
import com.example.pidev.repositories.IContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements IContactService{
    IContactRepository contactRepository;
    @Override
    public Contact addContact(Contact c) {
        return contactRepository.save(c);
    }

    @Override
    public Contact getContactById(Long id) {
        return contactRepository.findById(id).get();
    }

    @Override
    public Contact updateContact(Contact c) {
        return contactRepository.save(c);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
