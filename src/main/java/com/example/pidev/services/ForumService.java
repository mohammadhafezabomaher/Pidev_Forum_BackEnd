package com.example.pidev.services;

import com.example.pidev.entities.Forum;
import com.example.pidev.repositories.IForumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ForumService implements IForumService{
    IForumRepository forumRepository;
    @Override
    public Forum addForum(Forum f) {
        return forumRepository.save(f);
    }
    @Override
    public Forum getForumById(Long id) {
        return forumRepository.findById(id).get();
    }
    @Override
    public List<Forum> getAllForum() {
        return forumRepository.findAll();
    }
    @Override
    public Forum updateForum(Forum f) {
        return forumRepository.save(f);
    }
    @Override
    public void deleteForum(Long id) {
        forumRepository.deleteById(id);
    }
}
