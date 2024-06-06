package com.example.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.example.web.models.MemberAppointment;
import org.thymeleaf.context.Context;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DataMapper {

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    public String generateMonthlyReport(List<MemberAppointment> appointments) {
        Context context = new Context();

        // Calculate monthly income
        double monthlyIncome = calculateMonthlyIncome(appointments);

        // Get the name of the month
        String monthName = getMonthName(appointments);

        context.setVariable("appointments", appointments);
        context.setVariable("monthName", monthName);
        context.setVariable("monthlyIncome", monthlyIncome);

        return springTemplateEngine.process("template", context);
    }

    private double calculateMonthlyIncome(List<MemberAppointment> appointments) {

        return 5000.00;
    }

    private String getMonthName(List<MemberAppointment> appointments) {
        // Assuming appointments have a date field to determine the month
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        Date date = appointments.get(0).getServiceDateTime(); // Assuming the first appointment's date represents the month
        return monthFormat.format(date);
    }
}
