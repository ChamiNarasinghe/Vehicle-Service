package com.example.web.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "ServiceRequest")
public class ServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;


    @NotEmpty
    private String mechanicId;

    @NotEmpty
    private String requestDetails;

    @NotEmpty
    private LocalDateTime requestDate;

    // Constructors, getters, and setters

    public ServiceRequest() {
    }

    public ServiceRequest( String mechanicId, String requestDetails, LocalDateTime requestDate) {

        this.mechanicId = mechanicId;
        this.requestDetails = requestDetails;
        this.requestDate = requestDate;
    }

    // Getters and setters
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getMechanicId() {
        return mechanicId;
    }

    public void setMechanicId(String mechanicId) {
        this.mechanicId = mechanicId;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    // Other methods, if needed
}
