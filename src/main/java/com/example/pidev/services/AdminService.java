package com.example.pidev.services;

import com.example.pidev.entities.Admin;
import com.example.pidev.repositories.IAdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService{
    IAdminRepository adminRepository;
    @Override
    public Admin addAdmin(Admin a) {
        return adminRepository.save(a);
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin updateAdmin(Admin a) {
        return adminRepository.save(a);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
