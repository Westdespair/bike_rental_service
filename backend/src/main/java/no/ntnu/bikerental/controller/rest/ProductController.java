package no.ntnu.bikerental.controller.rest;

import no.ntnu.bikerental.model.Products;
import no.ntnu.bikerental.service.CustomerService;
import no.ntnu.bikerental.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("ProductControllerService")
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;
    private CustomerService customerService;

    public ProductController(ProductService productService, CustomerService customerService){
        this.productService = productService;
        this.customerService = customerService;
    }

    /**
     * Gets all products
     * @return list of all products
     */
    @GetMapping
    public List<Products> getAllProducts(@RequestParam(required = false) String customer,
                                         @RequestParam(required = false) String order) {
        if (order != null && !"".equals(order)) {
            if (customer != null && !"".equals(customer)) {
                return productService.getAllProductsByCustomerAndOrder(customer, order);
            } else {
                return productService.getAllProductsByCustomer(customer);
            }
        } else if(customer != null && !"".equals(customer)) {
            return productService.getAllProductsByOrder(order);
        } else { return productService.getAllProducts();
        }

    }

    /**
     *
     * @param products
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Products products) {
        ResponseEntity<String> response;
        if (productService.deletingProduct(products)) {
            response = new ResponseEntity<>(HttpStatus.OK);
        } else {
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return response;
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Products> getOne(@PathVariable Integer id) {
        ResponseEntity<Products> response;
        Products products = productService.findOrderById(id);
        if (products != null) {
            response = new ResponseEntity<>(products, HttpStatus.OK);
        } else {
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return response;
    }


}
