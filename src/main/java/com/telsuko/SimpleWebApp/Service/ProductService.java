package com.telsuko.SimpleWebApp.Service;

import com.telsuko.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"IPhone",150000),
            new Product(102,"Samsung",125000)
    );
    public List<Product> getProducts(){
        return products;
    }
}
