package com.mehdi5.mehdi5.service;


import com.mehdi5.mehdi5.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product saveProduct(Product Product);

    Product getProductById(Long id);

    Product updateProduct(Product Product);


    void deleteById(Long id);

    /*TEST*/


    List<Product> filterHighPrice();

    List<Product> filterLowPrice();


    List<Product> listViewProducts();


    List<Product> searchProducts(String keyword);


}
