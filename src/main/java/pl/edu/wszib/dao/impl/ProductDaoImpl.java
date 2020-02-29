package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.ProductDao;
import pl.edu.wszib.domain.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    private Map<Long, Product> productMap;
    private static Long id = 1L;

    public ProductDaoImpl() {
        this.productMap = new HashMap<>();
        prepareProductList();
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
    private void prepareProductList() {
        Product product = new Product();
        product.setName("Produkt 1");
        product.setPrice(10.00);
        product.setQuantity(100);
        product.setAvailable(true);
    }
}
