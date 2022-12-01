package fileIOStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputeg {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("e:\\sample.txt");
		FileOutputStream f1=new FileOutputStream("e:\\sample1.txt");
 ByteArrayOutputStream bout=new  ByteArrayOutputStream();
 bout.write(65);
 bout.writeTo(f);
 bout.writeTo(f1);
 bout.flush();
 bout.close();
 System.out.println("done");
	}

}
