package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Table;
@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long paymentId;
@JsonFormat(pattern="dd-MM-yyyy")
private LocalDate paymentDate;
private double latePaymentCharges;
public long getPaymentId() {
	return paymentId;
}
public void setPaymentId(long paymentId) {
	this.paymentId = paymentId;
}
public LocalDate getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(LocalDate paymentDate) {
	this.paymentDate = paymentDate;
}
public double getLatePaymentCharges() {
	return latePaymentCharges;
}
public void setLatePaymentCharges(double latePaymentCharges) {
	this.latePaymentCharges = latePaymentCharges;
}
public Payment(long paymentId, LocalDate paymentDate, double latePaymentCharges) {
	super();
	this.paymentId = paymentId;
	this.paymentDate = paymentDate;
	this.latePaymentCharges = latePaymentCharges;
}
public Payment() {
	super();
	// TODO Auto-generated constructor stub
}

}
