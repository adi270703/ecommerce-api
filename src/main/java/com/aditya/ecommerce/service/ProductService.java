package com.aditya.ecommerce.service;

import com.aditya.ecommerce.model.Product;
import com.aditya.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService 
{

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) 
    {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() 
    {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) 
    {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) 
    {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) 
    {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setDescription(updatedProduct.getDescription());
                    product.setPrice(updatedProduct.getPrice());
                    product.setStockQuantity(updatedProduct.getStockQuantity());
                    return productRepository.save(product);
                }).orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    public void deleteProduct(Long id) 
    {
        productRepository.deleteById(id);
    }
}