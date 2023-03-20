package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    public List<Payment> readHistoricalPaymentByConsumerNumber(Long consumerNumber);
	
}
