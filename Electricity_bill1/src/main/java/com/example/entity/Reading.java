package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Table;
@Entity
@Table(name="reading")
public class Reading {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long readingId;
	private int unitsConsumed;
	private String readingPhoto;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate readingDate;
	private int pricePerUnits;
	public long getReadingId() {
		return readingId;
	}
	public void setReadingId(long readingId) {
		this.readingId = readingId;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public String getReadingPhoto() {
		return readingPhoto;
	}
	public void setReadingPhoto(String readingPhoto) {
		this.readingPhoto = readingPhoto;
	}
	public LocalDate getReadingDate() {
		return readingDate;
	}
	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}
	public int getPricePerUnits() {
		return pricePerUnits;
	}
	public void setPricePerUnits(int pricePerUnits) {
		this.pricePerUnits = pricePerUnits;
	}
	public Reading(long readingId, int unitsConsumed, String readingPhoto, LocalDate readingDate, int pricePerUnits) {
		super();
		this.readingId = readingId;
		this.unitsConsumed = unitsConsumed;
		this.readingPhoto = readingPhoto;
		this.readingDate = readingDate;
		this.pricePerUnits = pricePerUnits;
	}
	public Reading() {
		super();
		// TODO Auto-generated constructor stub
	}

}
