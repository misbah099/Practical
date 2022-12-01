package fileIOStream;

import java.io.*;

public class BufferInput {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("e:\\test1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
	int i;
	while((i=b.read())!=-1){
		System.out.println((char)i);
	}
	f.close();
	b.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
