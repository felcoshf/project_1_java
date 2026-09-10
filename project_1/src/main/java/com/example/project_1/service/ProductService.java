package com.example.project_1.service;

import com.example.project_1.model.Product;
import com.example.project_1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public static Scanner scanner;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
