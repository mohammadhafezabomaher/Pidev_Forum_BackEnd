package com.example.pidev.controllers;

import com.example.pidev.entities.Pack;
import com.example.pidev.services.IPackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pack")
public class PackController {
    IPackService packService;
    @PostMapping("/add")
    public Pack addPack(@RequestBody Pack a){
        return packService.addPack(a);
    }
    @GetMapping("/get/{id}")
    public Pack getPackById(@PathVariable("id") Integer id){
        return packService.getPackById(id);
    }
    @GetMapping("/getall")
    public List<Pack> getAllPack(){
        return packService.getAllPack();
    }
    @DeleteMapping("/delete/{id}")
    public void deletePack(@PathVariable("id") Integer id){
        packService.deletePack(id);
    }
    @PutMapping("/update")
    public Pack updatePack(@RequestBody Pack a){
        return packService.updatePack(a);
    }
}
