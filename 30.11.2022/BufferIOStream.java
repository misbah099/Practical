package fileIOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferIOStream {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("e:\\test1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String s="Welcome to coding world";
		byte b1[]=s.getBytes();
		f.write(b1);
		f.close();
		b.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
