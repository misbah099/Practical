package collectionJava;
import java.util.ArrayList;
import java.util.List;
public class ArrayListeg {

	public static void main(String[] args) {
		List<String>a1=new ArrayList<String>();
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Rose");
		a1.add(0,"Lily");
		a1.add(2,"Daisy");
		a1.add("Marigold");
		a1.add(6,"Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add(5,"Lavender");
		a1.add("Nisha");
		System.out.println(a1);
		System.err.println("Size of arraylist: "+a1.size());
		System.out.println("Element of index value is: "+a1.get(6));
		a1.remove(6);
		System.out.println(a1);
		System.err.println("Size of array List: "+a1.size());
	}}
