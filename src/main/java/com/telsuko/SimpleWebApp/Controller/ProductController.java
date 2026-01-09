package com.telsuko.SimpleWebApp.Controller;

import com.telsuko.SimpleWebApp.Model.Product;
import com.telsuko.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProd(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.updateProd(prod);;
    }
    @DeleteMapping("/products/{prodId}")
    public void DeleProduct(@PathVariable int prodId){
        System.out.println(prodId);
        service.DeleteProd(prodId);
    }
}
