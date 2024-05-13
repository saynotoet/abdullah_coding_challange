package com.abdullah.coding.challenge.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cab")
public class Cab {
    public void setId(Integer id) {
		this.id = id;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    
    @Column(name = "rating")
    Double rating;
    
    @Column(name = "vehicle_type")
    String vehicleType;
    
    @Column(name = "status")
    String status;

	@Override
	public String toString() {
		return "Cab [id=" + id + ", rating=" + rating + ", vehicleType=" + vehicleType + ", status=" + status + "]";
	}

	public Integer getId() {
		return id;
	}

	public Double getRating() {
		return rating;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int cabId) {
		id=cabId;
		
	}
}
