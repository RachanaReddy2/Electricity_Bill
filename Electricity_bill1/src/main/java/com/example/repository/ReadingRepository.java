package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Reading;

public interface ReadingRepository extends JpaRepository<Reading, Long> {
   public Optional<Reading> findMeterReadingByConsumerNumber(Long consumerNumber);

}
