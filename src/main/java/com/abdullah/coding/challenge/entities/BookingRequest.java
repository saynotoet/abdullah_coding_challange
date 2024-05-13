package com.abdullah.coding.challenge.entities;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BookingRequest {
	 
	
	@JsonProperty("bookingCode")
     String bookingCode;
    
	@JsonProperty("vehicle_type")
     String vehicalType;
    
    @JsonProperty("customerId")
     int customerId;
    
    @JsonProperty("requestTime")
    Timestamp requestTime;
    
    public Timestamp getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	@JsonIgnore
     String status;
    
    @JsonIgnore
     int cabId;
    
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	} 

	 

	

	@Override
	public String toString() {
		return "BookingRequest [bookingCode=" + bookingCode + ", vehicalType=" + vehicalType + ", customerId="
				+ customerId + ", requestTime=" + requestTime + ", status=" + status + ", cabId=" + cabId + "]";
	}

	public int getCustomerId() {
		// TODO Auto-generated method stub
		return customerId;
	}    

	}
