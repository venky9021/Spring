package com.telsuko.SimpleWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@ToString
public class Product {
    private int prodId;
    private String prodname;
    private int prodprice;
    public Product(){

    }
    /*
    Important Interview Point ⭐
“Why do frameworks need a no-args constructor?”
Answer:
Frameworks use reflection to create objects first and then set values, so a default constructor is mandatory.
     */
}
