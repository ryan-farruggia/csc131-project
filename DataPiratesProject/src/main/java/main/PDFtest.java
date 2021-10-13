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
            PDField field = pDAcroForm.getField("txt_1");
            field.setValue("This is field #1");
            field = pDAcroForm.getField("txt_2");
            field.setValue("This is field #2");
            pDDocument.save("pdf-java.pdf");
            pDDocument.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
