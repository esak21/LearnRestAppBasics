package com.learn.backend.Applciation.backendApp.Controller;

import com.learn.backend.Applciation.backendApp.Models.Post;
import com.learn.backend.Applciation.backendApp.repository.PostRepository;
import com.learn.backend.Applciation.backendApp.service.PostService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    public PostService postservice;


    @GetMapping("/posts")
    public List<Post> getAllPosts() {

            return postservice.getAllData();
    }


    @GetMapping("/posts/{id}")
    public Post hetSinglePOst(@PathVariable("id") String postid ){
        return postservice.getpostById(postid);

    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post){
        return postservice.createpost(post);
    }

    @GetMapping("/posts/search/{text}")
    public List<Post> search(@PathVariable("text") String searchText) {
        return postservice.searchByText(searchText);
    }
}
