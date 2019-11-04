package com.technicalblogapplication.tecnicalblogapplication.Controller;


import com.technicalblogapplication.tecnicalblogapplication.Model.Post;
import com.technicalblogapplication.tecnicalblogapplication.Model.User;
import com.technicalblogapplication.tecnicalblogapplication.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {

@Autowired
    PostService postservice;
   @RequestMapping("users/login")
    public String login()
    {
     return "users/login";



    }

    @RequestMapping("users/registration")
    public String Registration()
    {

        return "users/registration";
    }

    @RequestMapping(value="users/login",method=RequestMethod.POST)
    public String UserLogin(User user)
    {
        return "redirect:/posts";
    }

    @RequestMapping(value="users/logout",method=RequestMethod.POST)
    public String UserLogout(Model model)
    {
        ArrayList<Post> posts=postservice.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }







}
