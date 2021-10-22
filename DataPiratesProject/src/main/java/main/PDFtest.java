package main;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class PDFtest {
    public static void main(String[] args) {
        try {
            PDDocument pDDocument = PDDocument.load(new File("pdf-java.pdf"));
            PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
            PDField testfield = pDAcroForm.getField("projectdescriptiontextbox");
            testfield.setValue("This project does stuff and I think that's really cool.");
            testfield = pDAcroForm.getField("contractnumbertextbox");
            testfield.setValue("Contract #420");
            pDDocument.save("pdf-java.pdf");
            pDDocument.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
