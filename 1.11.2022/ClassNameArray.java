package array;

public class ClassNameArray {
//to get the class name of array object in java
	public static void main(String[] args) {
//declaration & initialization of an array
		int arr[]= {};
		//getting the class name
		Class a=arr.getClass();
		String name=a.getName();
		System.out.println(a);
		System.out.println(name);

	}

}
