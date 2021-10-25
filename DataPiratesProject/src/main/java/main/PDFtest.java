package main;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class PDFtest {
	// Method to make printing EZ
	public static <E> void p(E item) {
		System.out.println(item);
	}
    public static void main(String[] args) {
        try {
        	/* Important definitions:
        	 * (If you have used JavaScript before, coding this pdf is EXTREMELY similar)
        	 * PDDocument: gets a document (pdf)
        	 * PDAcroForm: gets a document and converts it to an interactive form
        	 * PDField: gets a field by its name
        	 */
            // PDDocument pDDocument = PDDocument.load(new File("pdf-java.pdf"));
        	PDDocument pDDocument = PDDocument.load(new File("test-pdf.pdf"));
            PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
            
            // Reset total values so they don't += themselves
            PDField bmp7 = pDAcroForm.getField("bmptotalTB");
            bmp7.setValue(Integer.toString(0));
            PDField swca7 = pDAcroForm.getField("swcatotalTB");
            swca7.setValue(Integer.toString(0));
            // Storm Water Contract Administration Table
            PDField swca1 = pDAcroForm.getField("plansTB");
            String swca1string = swca1.getValueAsString();
            int swca1val = Integer.parseInt(swca1string);

            PDField swca2 = pDAcroForm.getField("trainingTB");
            String swca2string = swca2.getValueAsString();
            int swca2val = Integer.parseInt(swca2string);
            
            PDField swca3 = pDAcroForm.getField("smartsTB");
            String swca3string = swca3.getValueAsString();
            int swca3val = Integer.parseInt(swca3string);
            
            PDField swca4 = pDAcroForm.getField("activetreatmentTB");
            String swca4string = swca4.getValueAsString();
            int swca4val = Integer.parseInt(swca4string);
            
            PDField swca5 = pDAcroForm.getField("monitoringTB");
            String swca5string = swca5.getValueAsString();
            int swca5val = Integer.parseInt(swca5string);
            
            PDField swca6 = pDAcroForm.getField("tahoerequirementsTB");
            String swca6string = swca6.getValueAsString();
            int swca6val = Integer.parseInt(swca6string);
            
            String swca7string = swca7.getValueAsString();
            int swca7val = Integer.parseInt(swca7string);
            
            int swcaTotal = swca1val + swca2val + swca3val + swca4val + swca5val + swca6val + swca7val;
            String swcatemp = Integer.toString(swcaTotal);
            swca7.setValue(swcatemp);
            
            // Best Management Practices Table
            PDField bmp1 = pDAcroForm.getField("soilstabilizationTB");
            String bmp1string = bmp1.getValueAsString();
            int bmp1val = Integer.parseInt(bmp1string);
            
            PDField bmp2 = pDAcroForm.getField("sedimentcontrolTB");
            String bmp2string = bmp2.getValueAsString();
            int bmp2val = Integer.parseInt(bmp2string);
            
            PDField bmp3 = pDAcroForm.getField("trackingcontrolTB");
            String bmp3string = bmp3.getValueAsString();
            int bmp3val = Integer.parseInt(bmp3string);
            
            PDField bmp4 = pDAcroForm.getField("winderosionTB");
            String bmp4string = bmp4.getValueAsString();
            int bmp4val = Integer.parseInt(bmp4string);
            
            PDField bmp5 = pDAcroForm.getField("nonstormwaterTB");
            String bmp5string = bmp5.getValueAsString();
            int bmp5val = Integer.parseInt(bmp5string);
            
            PDField bmp6 = pDAcroForm.getField("wastemanagementTB");
            String bmp6string = bmp6.getValueAsString();
            int bmp6val = Integer.parseInt(bmp6string);
            
            String bmp7string = bmp7.getValueAsString();
            int bmp7val = Integer.parseInt(bmp7string);
            
            int bmpTotal = 0;
            bmpTotal = bmp1val + bmp2val + bmp3val + bmp4val + bmp5val + bmp6val + bmp7val;
            String bmptemp = Integer.toString(bmpTotal);
            bmp7.setValue(bmptemp);
            
            p("Completed all operations with no errors. Exit code (0).");
            // Do not remove these two lines!
            //pDDocument.save("pdf-java.pdf");
            pDDocument.save("test-pdf.pdf");
            pDDocument.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
