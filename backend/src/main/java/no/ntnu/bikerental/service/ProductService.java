package no.ntnu.bikerental.service;

import no.ntnu.bikerental.model.Products;
import no.ntnu.bikerental.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.LinkedList;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productsRepository;


    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> iterableToList(Iterable<Products> iterable) {
        List<Products> list = new LinkedList<>();
        iterable.forEach(list::add);
        return list;
    }

    public List<Products> getAllProducts() {
        return iterableToList(productsRepository.findAll());
    }

    public Products findOrderById(Integer id) {
        return productsRepository.findById(id).orElse(null);
    }

    /**
     * Finds order by ID
     *
     * @param ID Int
     * @return The author or null if none found by that ID
     */
    public Products findOrderById(int ID) {
        return productsRepository.findById(ID).orElse(null);
    }

    public List<Products> getAllProductsByCustomer(String customer) {
        return null;
    }

    public List<Products> getAllProductsByOrder(String order) {
        return null;
    }

    public List<Products> getAllProductsByCustomerAndOrder(String customer, String order) {
        return null;
    }

    /**
     * Add a product
     *
     * @param products the product
     * @return true if product is added, false if not added
     */
    public boolean addNewProduct(Products products) {
        boolean added = false;
        if (products != null) {
            productsRepository.save(products);
            added = true;
        }
        return added;
    }

    /**
     *
     * @param products
     * @return
     */
    public boolean deletingProduct(Products products) {
        boolean deleted = false;
        if (products != null) {
            productsRepository.delete(products);
            deleted = true;
        }
        return deleted;

    }

    /**
     *
     * @param ID
     * @param products
     * @return
     */
    public String updateProduct(int ID, Products products) {
        Products existingProduct = findOrderById(ID);
        String errorMessage = null;
        if (existingProduct == null) {
            errorMessage = "No customerOrder with " + ID + "found";
        }
        if (products == null) {
            errorMessage = "Wrong data in request body";
        } else if (products.getProductID() != ID) {
            errorMessage = "Wrong id, does not match";
        }

        if (errorMessage == null) {
            productsRepository.save(products);
        }
        return errorMessage;
    }


}

