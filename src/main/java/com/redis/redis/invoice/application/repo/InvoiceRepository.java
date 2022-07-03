package com.redis.redis.invoice.application.repo;

import com.redis.redis.invoice.application.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
