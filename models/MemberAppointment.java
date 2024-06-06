package com.example.web.models;



import javax.persistence.*;
import java.util.Date;

@Entity
public class MemberAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String service;
    private Date serviceDateTime;
    private String specialRequest;



    public MemberAppointment(String name, String email, String service, Date serviceDateTime, String specialRequest) {
        this.name = name;
        this.email = email;
        this.service = service;
        this.serviceDateTime = serviceDateTime;
        this.specialRequest = specialRequest;
    }

    public MemberAppointment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getServiceDateTime() {
        return serviceDateTime;
    }

    public void setServiceDateTime(Date serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public MemberAppointment(Long id, String name, String email, String service, Date serviceDateTime, String specialRequest) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.service = service;
        this.serviceDateTime = serviceDateTime;
        this.specialRequest = specialRequest;
    }
}