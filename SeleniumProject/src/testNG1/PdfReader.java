package testNG1;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class PdfReader {

	public static void main(String[] args) throws IOException {
		File src = new File("D:\\ORANGE  HRM  Project  Installation  Process.pdf");
		PDDocument pdf = PDDocument.load(src);
		PDFTextStripper strip = new PDFTextStripper();
		String str = strip.getText(pdf);
		System.out.println(str);

		System.out.println(" Only Prices");
		String strs[] = str.split(" ");
		String dollars[] = new String[strs.length];
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].startsWith("C"))
					
			{
				dollars[i] = strs[i];
			System.out.println(strs[i]);
			}
		}

		System.out.println("Only with Dollar");
		int j = 0;
		while (dollars[0] != null) {
			System.out.println(dollars[j]);
			j++;
		}
	}

}
