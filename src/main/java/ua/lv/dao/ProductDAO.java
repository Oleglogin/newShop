package ua.lv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lv.entity.Product;

/**
 * Created by User on 15.02.2020.
 */
public interface ProductDAO extends JpaRepository<Product,Integer> {

}
