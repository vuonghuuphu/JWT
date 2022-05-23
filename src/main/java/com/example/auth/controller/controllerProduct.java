package com.example.auth.controller;

import com.example.auth.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/admin/product")
public class controllerProduct {
    List<Product> lp = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getlist() {
        for (int i = 0 ; i< 3; i++){
            lp.add(new Product(i,"Article" + i,1));
        }
        return lp;
    }


}
