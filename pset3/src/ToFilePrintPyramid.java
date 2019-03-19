import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class ToFilePrintPyramid implements PrintPyramid {

	public ToFilePrintPyramid() {}

	public void pyraPrint(Pyramid p) {
		// TODO Auto-generated method stub
	
		String filename = "Pyramids/pyramid" + p.getHeight() + ".txt";
	try (
		Writer writer = new BufferedWriter( 
				new OutputStreamWriter( new FileOutputStream(filename), ("utf-8"))))	{
			
			writer.write(p.toString());
		} catch (FileNotFoundException ex){
			try {	
			System.out.println("Making a new file...");
			new File(filename).createNewFile();
			}	catch (IOException e) {
				e.getMessage();
			}
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		}
}
	
	


