package main;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class contractNumber {
	public static <E> void p(E item) {
		System.out.println(item);
	}
	/* this class makes the contract number at the top of each page the same
	// as the one entered on Page 1 by the user
	public void setContractValues() {
		try {
			// PDDocument pDDocument = PDDocument.load(new File("pdf-java.pdf"));
			PDField OGcontract = pDAcroForm.getField("contractnumbertextbox");
			String OGcontractstring = OGcontract.getValueAsString();
			p(OGcontractstring);
			PDField contractnumcopies = pDAcroForm.getField("testbox");
			String contractnumcopiesstring = contractnumcopies.getValueAsString();
			contractnumcopies.setValue(OGcontractstring);
			pDDocument.save("test-pdf.pdf");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}*/
}
