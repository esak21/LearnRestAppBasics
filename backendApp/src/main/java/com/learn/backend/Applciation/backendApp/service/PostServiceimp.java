package com.learn.backend.Applciation.backendApp.service;

import com.learn.backend.Applciation.backendApp.Models.Post;
import com.learn.backend.Applciation.backendApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostServiceimp implements PostService {

    @Autowired
    private PostRepository repo ;

    @Override
    public List<Post> getAllData() {
        return repo.findAll();
    }

    @Override
    public Post getpostById(String postid) {
        return repo.findById(postid).get();
    }

    @Override
    public Post createpost(Post post) {
        return repo.save(post);
    }

    @Override
    public List<Post> searchByText(String searchText) {
        final List<Post> posts = new ArrayList<>();

        return posts;
    }

}
