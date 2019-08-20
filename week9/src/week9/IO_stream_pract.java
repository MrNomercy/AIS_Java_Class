package week9;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IO_stream_pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter myfile = new FileWriter("input.txt");
			BufferedWriter bfile = new BufferedWriter(myfile);
			bfile.write("cool.\r\n");
			bfile.write("not cool.");
			bfile.close();
			
			FileReader FR = new FileReader("input.txt");
			int i ;
			while((i=FR.read()) != -1) 
			{
				System.out.print((char)i);
			}
//			myfile.write("This is my first java io program.");
//			myfile.write("\r\n");
//			myfile.write("see you next time.\r\t");
//			myfile.append("see you again.");
//			//myfile.flush();
//			myfile.write("this is cool.");
//			myfile.write("\r\tnot cool.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sorry the file does not exist.");
		}
		

	}

}
