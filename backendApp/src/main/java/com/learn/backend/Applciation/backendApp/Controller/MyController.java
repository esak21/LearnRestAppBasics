package com.learn.backend.Applciation.backendApp.Controller;

import com.learn.backend.Applciation.backendApp.Models.Post;
import com.learn.backend.Applciation.backendApp.repository.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    public PostRepository repo;


    @GetMapping("/posts")
    public List<Post> getAllPosts() {

            return repo.findAll();
    }


}
