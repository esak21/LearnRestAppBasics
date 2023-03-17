package com.learn.backend.Applciation.backendApp.repository;

import com.learn.backend.Applciation.backendApp.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
