package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Products;
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

    public List<Products>  iterableToList(Iterable<Products> iterable){
        List<Products> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Products> getAllProducts(){return iterableToList(productRepository.findAll());}

    public Products findOrderById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
