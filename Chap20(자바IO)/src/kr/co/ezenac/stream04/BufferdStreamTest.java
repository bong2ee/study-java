package kr.co.ezenac.stream04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdStreamTest {
	
	public static void main(String[] args) {
		
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("ojdbc8.jar");
			FileOutputStream fos = new FileOutputStream("copy.jar");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1)
				bos.write(i);
			
			millisecond = System.currentTimeMillis() - millisecond;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는 데 "+ millisecond + "millisecond 소요되었습니다.");
	}
}
