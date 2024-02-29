package com.example.pidev.repositories;

import com.example.pidev.entities.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IForumRepository extends JpaRepository<Forum,Long> {
}
