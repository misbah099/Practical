package fileIOStream;
import java.io.*;
public class FileIOSingleChar {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("E:\\test1.txt");
	
	int i=0;
	while((i=f.read())!=-1) {
		System.out.println((char)i);
	}
	f.close();
	}catch(Exception e) {
	System.out.println(e);	
	}
}
}
