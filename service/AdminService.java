// AdminService.java
package com.example.web.service;

import com.example.web.models.Appointment;
import com.example.web.repository.AdminRepository;
import com.example.web.models.MemberAppointment;
import com.example.web.repository.NonMemberRepository;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private NonMemberRepository nonMemberRepository;

    public List<MemberAppointment> getAllAppointments() {
        return adminRepository.findAll();


    }

    public List<Appointment> getAllNonAppointments() {
        return nonMemberRepository.findAll();
    }




    private JasperPrint createWeeklyReport(List<MemberAppointment> appointments, List<Appointment> nonMemberAppointments) throws JRException {
        // Logic to create the report using JasperReports API
        // Example: Create a JasperPrint object with a JRBeanCollectionDataSource
        Map<String, Object> params = new HashMap<>();
        params.put("appointments", appointments);
        params.put("nonMemberAppointments", nonMemberAppointments);

        InputStream template = getClass().getResourceAsStream("/template.jrxml");

        JasperReport jasperReport = JasperCompileManager.compileReport(template);

        return JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
    }


}
