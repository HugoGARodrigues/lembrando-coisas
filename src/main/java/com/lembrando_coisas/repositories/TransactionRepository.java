package com.lembrando_coisas.repositories;

import com.lembrando_coisas.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    



}
