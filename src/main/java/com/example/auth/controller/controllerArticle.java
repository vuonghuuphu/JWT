package com.example.auth.controller;


import com.example.auth.entity.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users/article")
public class controllerArticle {
    List<Article> la = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<Article> getlist() {
        for (int i = 0 ; i< 3; i++){
            la.add(new Article(i,"Article" + i,1));
        }
        return la;
    }


}
