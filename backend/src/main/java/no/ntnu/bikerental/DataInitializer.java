package no.ntnu.bikerental;
import no.ntnu.bikerental.bike.BikesRepository;
import no.ntnu.bikerental.customer.CustomersRepository;
import no.ntnu.bikerental.customer.order.OrdersRepository;
import no.ntnu.bikerental.customer.transaction.TransactionsRepository;
import no.ntnu.bikerental.product.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Initializes data for the database
 */
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    private BikesRepository bikesRepository;
    @Autowired
    private CustomersRepository customersRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private TransactionsRepository transactionsRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

    }
}
