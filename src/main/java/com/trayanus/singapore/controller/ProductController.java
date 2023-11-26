package com.trayanus.singapore.controller;

import com.trayanus.singapore.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping("/add")
    public String addProducts(@RequestBody ProductDto productDto) {
        LinkedHashMap temp = productDto.getRecords().get(0);
        ArrayList array = new ArrayList(temp.keySet());
        String query = "CREATE TABLE IF NOT EXISTS " + productDto.getTable() + " (`id` bigint NOT NULL AUTO_INCREMENT,";
        for(Object key : array){
            query += "`" + key.toString() + "` varchar(255),";
        }
        query += "PRIMARY KEY (`id`) USING BTREE);";

        return "Records added successfully!";
    }

}

