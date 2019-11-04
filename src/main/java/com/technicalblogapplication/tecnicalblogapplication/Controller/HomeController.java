package com.technicalblogapplication.tecnicalblogapplication.Controller;

import com.technicalblogapplication.tecnicalblogapplication.Model.Post;
import com.technicalblogapplication.tecnicalblogapplication.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;


@Controller

public class HomeController {

    @Autowired
    PostService postService;






    @RequestMapping("/Home")
    public String getAllPosts(Model model) {

         ArrayList<Post> posts=postService.getAllPosts();

        model.addAttribute("posts", posts);

        return "index";


    }


}
