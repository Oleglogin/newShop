package ua.lv.service;

import ua.lv.entity.Product;
import ua.lv.entity.User;

import java.util.List;

/**
 * Created by User on 15.02.2020.
 */
public interface ProductService {
    void save (Product product);
    Product getProductById(int id);
    void delete(int id);
    List<Product> productList();
}
