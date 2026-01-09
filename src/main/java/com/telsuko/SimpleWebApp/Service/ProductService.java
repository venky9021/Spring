package com.telsuko.SimpleWebApp.Service;

import com.telsuko.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"IPhone",150000),
            new Product(102,"Samsung",125000)
    ));
    public List<Product> getProducts()
    {
        return products;

    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p ->p.getProdId()==prodId).findFirst().get();
    }
    public void addProd(Product prod){
        products.add(prod);
    }
    public void updateProd(Product prod){
        int index  = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }
        products.set(index,prod);
    }

    public void DeleteProd(int prodId) {
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            products.remove(index);
        }
    }
}
