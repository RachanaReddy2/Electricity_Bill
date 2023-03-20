package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Connection;

public interface ConnectionRepository extends JpaRepository<Connection, Long> {
	public Optional<Connection> findByConsumerNumber(Long consumerNumber);
	public List<Connection> getActiveConnectionsByVillage(String village);
	public List<Connection> getInActiveConnectionsByVillage(String village);
    public List<Connection> getActiveConnectionsByTaluk(String taluk);
    public List<Connection> getInActiveConnectionsByTaluk(String taluk);
    public List<Connection> getActiveConnectionsByDistrict(String district);
    public List<Connection> getInActiveConnectionsByDistrict(String district);
    public List<Connection> getActiveConnectionsByPincode(String pincode);
    public List<Connection> getInActiveConnectionsByPincode(String pincode);

	
}

