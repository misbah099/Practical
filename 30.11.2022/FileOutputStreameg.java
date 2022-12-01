package fileIOStream;
import java.io.*;
//STRING TO BYTE ARRAY
public class FileOutputStreameg {
public static void main(String[] args) {
	try {
		FileOutputStream f= new FileOutputStream("E:\\test.txt");
		String s="Welcome to Anudip Foundation";
		byte b[]=s.getBytes();//changing string to bye array
		f.write(b);//write() is used to write write in file
		f.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
