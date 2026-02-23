package com.shop.pras.Services;

import com.shop.pras.Models.Product;
import com.shop.pras.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Конструктор с @Autowired (Spring сам внедрит)
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Получить все продукты
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Найти продукт по коду
    public Optional<Product> getProductByCode(String code) {
        return productRepository.findById(code);
    }

    // Сохранить или обновить продукт
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Удалить продукт по коду
    public void deleteProduct(String code) {
        productRepository.deleteById(code);
    }
}
