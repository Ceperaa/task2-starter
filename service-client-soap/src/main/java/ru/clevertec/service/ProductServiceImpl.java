package ru.clevertec.service;

import ru.clevertec.model.Product;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService
public class ProductServiceImpl {

    private Map<Long, Product> productList = new HashMap<>();
    private Long key = 0L;

    public ProductServiceImpl() {
    }

    public Product add(String name, int capacity) {
        Product product = Product.builder().name(name).capacity(capacity).build();
        key++;
        productList.put(key, product);
        return product;
    }

    public Product findById(Long id) {
        return productList.get(id);
    }
}
