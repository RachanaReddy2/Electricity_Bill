package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Table;
@Entity
@Table(name="connection")
public class Connection {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long connectionId;
	   private long consumerNumber;
	   @JsonFormat(pattern="dd-MM-yyyy")
		private LocalDate connectionDate;
	   @JsonFormat(pattern="dd-MM-yyyy")
		private LocalDate applicationDate ;
	  private  boolean connectionStatus;
	public long getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
	}
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public LocalDate getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(LocalDate connectionDate) {
		this.connectionDate = connectionDate;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public boolean isConnectionStatus() {
		return connectionStatus;
	}
	public void setConnectionStatus(boolean connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
	public Connection(long connectionId, long consumerNumber, LocalDate connectionDate, LocalDate applicationDate,
			boolean connectionStatus) {
		super();
		this.connectionId = connectionId;
		this.consumerNumber = consumerNumber;
		this.connectionDate = connectionDate;
		this.applicationDate = applicationDate;
		this.connectionStatus = connectionStatus;
	}
	public Connection() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	}
