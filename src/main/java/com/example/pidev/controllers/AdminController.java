package com.example.pidev.controllers;

import com.example.pidev.entities.Admin;
import com.example.pidev.services.IAdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    IAdminService adminService;
    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin a){
        return adminService.addAdmin(a);
    }
    @GetMapping("/get/{id}")
    public Admin getAdminById(@PathVariable("id") Long id){
        return adminService.getAdminById(id);
    }
    @GetMapping("/getall")
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable("id") Long id){
        adminService.deleteAdmin(id);
    }
    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin a){
        return adminService.updateAdmin(a);
    }
}
