package fileIOStream;

import java.io.FileOutputStream;

public class ReadSingleChar {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("E:\\test1.txt");
int i=f.read();
{System.out.println((char)i);}
f.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
