package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {
   
   public static void main(String[] args) {

	   byte[] bs = new byte[26];
	   byte data = 65;
	   for(int i=0; i<bs.length; i++) {
		   bs[i] = data;
		   data++;
	   } 
	   
	   try(FileOutputStream fos = new FileOutputStream("output3.txt",true);
			   FileInputStream fis = new FileInputStream("output2.txt")){
		   
		   fos.write(bs);
		   int ch;
		   while((ch = fis.read()) != -1)
			   System.out.print((char)ch);
		   
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
            
   }
}
