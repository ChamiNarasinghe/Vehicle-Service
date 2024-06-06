package com.example.web.document;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class DocumentGenerator {

    public void htmlToPdf(String processedHtml) {

        try (FileOutputStream fout = new FileOutputStream("C:/Users/Dell/Downloads/MonthlyPdf.pdf");
             PdfWriter pdfWriter = new PdfWriter(fout);
             PdfDocument pdfDocument = new PdfDocument(pdfWriter)) {

            DefaultFontProvider defaultFont = new DefaultFontProvider(false, true, false);
            ConverterProperties converterProperties = new ConverterProperties().setFontProvider(defaultFont);

            HtmlConverter.convertToPdf(processedHtml, pdfDocument, converterProperties);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
