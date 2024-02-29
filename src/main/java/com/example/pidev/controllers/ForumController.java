package com.example.pidev.controllers;

import com.example.pidev.entities.Forum;
import com.example.pidev.services.IForumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/forum")
public class ForumController {
    IForumService forumService;
    @PostMapping("/add")
    public Forum addForum(@RequestBody Forum f){
        return forumService.addForum(f);
    }
    @GetMapping("/get/{id}")
    public Forum getForumById(@PathVariable("id") Long id){
        return forumService.getForumById(id);
    }
    @GetMapping("/getall")
    public List<Forum> getAllForum(){
        return forumService.getAllForum();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteForum(@PathVariable("id") Long id){
        forumService.deleteForum(id);
    }
    @PutMapping("/update")
    public Forum updateForum(@RequestBody Forum f){
        return forumService.updateForum(f);
    }
}
