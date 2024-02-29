package com.example.pidev.services;

import com.example.pidev.entities.Admin;

import java.util.List;


public interface IAdminService {
    public Admin addAdmin(Admin a);
    public Admin getAdminById(Long id);
    public List<Admin> getAllAdmin();
    public Admin updateAdmin(Admin a);
    public void deleteAdmin(Long id);
}
