package fileIOStream;

import java.io.*;

public class BufferInput {
public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("E:\\test1.txt");
		BufferedInputStream b=new BufferedInputStream(f);
	int i=0;
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
