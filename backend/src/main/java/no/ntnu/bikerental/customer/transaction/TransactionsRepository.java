package no.ntnu.bikerental.customer.transaction;

import no.ntnu.bikerental.customer.transaction.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{

}
