package array;

public class CopyArray {

	public static void main(String[] args) {
//declaring a source array
		char copyfrom[]= {'a','b','c','d','e','f','g','m'};
		//declaring the destination array
		char copyto[]=new char[7];
		System.arraycopy(copyfrom,2,copyto,0,5);
		//print the destination array
		System.out.println(String.valueOf(copyto));
	}

}
