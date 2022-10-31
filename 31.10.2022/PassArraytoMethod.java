package array;

public class PassArraytoMethod {
//creating a method which pass an array as a parameter
	static void MaximumNo(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) 
			if(max<array[i]) 
				max=array[i];
				System.out.println(max);
			
	}
		public static void main(String args[]) {
			int a[]= {5,7,9,2,3};
			MaximumNo(a);
		}
	}
	

