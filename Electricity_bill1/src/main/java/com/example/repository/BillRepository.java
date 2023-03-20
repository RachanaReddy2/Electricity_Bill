package com.example.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
    public Optional<Bill> viewBillByConsumerNumber(Long consumerNumber);
    public Optional<Bill> viewBillByMobileNumber(String mobileNumber);
	public Optional<Bill> viewBillByEmail(String email);
	List<Bill> findAllByBillDateBetween(Date from, Date to);
}
