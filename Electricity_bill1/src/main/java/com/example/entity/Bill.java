package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Table;
@Entity
@Table(name="bill")
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long billId;
	 @JsonFormat(pattern="dd-MM-yyyy")
		private LocalDate billDate;
	 @JsonFormat(pattern="dd-MM-yyyy")
		private LocalDate billDueDate;
	 private int unitsConsumer;
	 private int billAmount;
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public LocalDate getBillDueDate() {
		return billDueDate;
	}
	public void setBillDueDate(LocalDate billDueDate) {
		this.billDueDate = billDueDate;
	}
	public int getUnitsConsumer() {
		return unitsConsumer;
	}
	public void setUnitsConsumer(int unitsConsumer) {
		this.unitsConsumer = unitsConsumer;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public Bill(long billId, LocalDate billDate, LocalDate billDueDate, int unitsConsumer, int billAmount) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.billDueDate = billDueDate;
		this.unitsConsumer = unitsConsumer;
		this.billAmount = billAmount;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	}
