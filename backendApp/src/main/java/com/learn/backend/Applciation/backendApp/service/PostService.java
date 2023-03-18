package com.learn.backend.Applciation.backendApp.service;

import com.learn.backend.Applciation.backendApp.Models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    public List<Post> getAllData();

    public Post getpostById(String postid);

    public Post createpost(Post post);

    public List<Post> searchByText(String searchText);
}
