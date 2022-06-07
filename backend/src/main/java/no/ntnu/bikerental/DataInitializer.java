package no.ntnu.bikerental;
import no.ntnu.bikerental.repository.BikesRepository;
import no.ntnu.bikerental.repository.CustomersRepository;
import no.ntnu.bikerental.repository.OrdersRepository;
import no.ntnu.bikerental.repository.TransactionsRepository;
import no.ntnu.bikerental.repository.ProductsRepository;
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
