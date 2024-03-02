package tn.esprit.molka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.molka.entities.Contact;
import tn.esprit.molka.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact getContactById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact updatedContact) {
        Contact existingContact = contactRepository.findById(id).orElse(null);
        if (existingContact != null) {
            // Update fields as needed
            existingContact.setNom(updatedContact.getNom());
            existingContact.setPrenom(updatedContact.getPrenom());
            existingContact.setCin(updatedContact.getCin());
            existingContact.setEmail(updatedContact.getEmail());
            existingContact.setPassword(updatedContact.getPassword());
            existingContact.setImage(updatedContact.getImage());
            existingContact.setDateNaissance(updatedContact.getDateNaissance());
            existingContact.setTelephone(updatedContact.getTelephone());
            existingContact.setAdresse(updatedContact.getAdresse());
            existingContact.setRole(updatedContact.getRole());
            existingContact.setEtudiant(updatedContact.getEtudiant());

            return contactRepository.save(existingContact);
        } else {
            return null;
        }
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
