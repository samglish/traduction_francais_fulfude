/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traduction_foulbe;
import java.io.IOException;
/**
 *
 * @author samglish
 */
public class PDFToText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

       PDFManager pdfManager = new PDFManager();
           pdfManager.setFilePath("/home/samglish/Documents/CV - BEIDI DINA SAMUEL.pdf");
        try {
            String text=pdfManager.ToText();
       System.out.println(text);  
        } catch (Exception e) {
        e.printStackTrace();
        }
           
    }    
}
