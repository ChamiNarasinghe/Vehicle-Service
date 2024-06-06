
package com.example.web.generator;
import com.example.web.document.DocumentGenerator;
import com.example.web.mapper.DataMapper;
import com.example.web.models.MemberAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoDocument {

    @Autowired
    private DocumentGenerator documentGenerator;

    @Autowired
    private DataMapper dataMapper;

    @PostMapping(value = "/generate/document")
    public String generateDocument(@RequestBody List<MemberAppointment> appointments) {
        String finalHtml = dataMapper.generateMonthlyReport(appointments);
        documentGenerator.htmlToPdf(finalHtml);
        return "Success";
    }
}
