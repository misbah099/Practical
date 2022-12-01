package fileIOStream;

import java.io.FileOutputStream;

public class ByteToStringStream {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("E:\\bytetostring.txt");
		f.write(67);
		f.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
