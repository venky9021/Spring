package com.telsuko.SimpleWebApp.Controller;

import com.telsuko.SimpleWebApp.Model.Product;
import com.telsuko.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();

    }
    @RequestMapping("/products/{prodId}")
    public Product getProduct( @PathVariable int prodId){

        return service.getProductById(prodId);
    }


}
