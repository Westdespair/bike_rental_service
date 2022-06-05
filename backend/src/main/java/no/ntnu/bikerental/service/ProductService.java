package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import no.ntnu.bikerental.repository.ProductRepository;

import java.util.List;
import java.util.LinkedList;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product>  iterableToList(Iterable<Product> iterable){
        List<Product> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Product> getAllProducts(){return iterableToList(productRepository.findAll());}

    public Product findOrderById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
