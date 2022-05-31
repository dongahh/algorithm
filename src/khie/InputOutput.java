package khie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputOutput {

	public static void main(String[] args) {
		InputStream is;
		
		//스트림 방식
		try {
			is = new FileInputStream("C:/test/test.txt");
			
			int readByte;
			
			while(true) {
				readByte = is.read();
				if(readByte == -1) {
					break;
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
