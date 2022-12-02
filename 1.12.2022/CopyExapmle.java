package fileIOStream;

import java.io.*;

public class CopyExapmle {
public static void main(String[] args) {
	try {
	FileInputStream fin=new FileInputStream("E:\\copy");
	FileOutputStream fout=new FileOutputStream("E:\\copy1");
	byte[] arr=new byte [1024];
	int l;
	while((l=fin.read(arr))>0) {
		fout.write(arr);
	}
	fin.close();
	fout.close();
	System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
