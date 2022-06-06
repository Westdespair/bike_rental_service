package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import no.ntnu.bikerental.repository.ProductsRepository;

import java.util.List;
import java.util.LinkedList;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productsRepository;


    public ProductService(ProductsRepository productsRepository){
        this.productsRepository = productsRepository;
    }

    public List<Products>  iterableToList(Iterable<Products> iterable){
        List<Products> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Products> getAllProducts(){return iterableToList(productsRepository.findAll());}

    public Products findOrderById(Integer id) {
        return productsRepository.findById(id).orElse(null);
    }
}
