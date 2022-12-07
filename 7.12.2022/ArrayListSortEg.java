package collectionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {

	public static void main(String[] args) {
		List<String>al1=new ArrayList<String>();//generic
		al1.add("Rose");
		al1.add("Sunflower");
		al1.add("Lily");
		al1.add("Daisy");
		al1.add("Marigold");
		al1.add("Tulip");
		al1.add("Jasmine");
		al1.add("Lotus");
		al1.add("Lavender");
		System.out.println("String sorted list;");
		Collections.sort(al1);
		for(String a:al1) {
			System.out.println(a);
		}
		List<Integer>all=new ArrayList<Integer>();
		all.add(20);
		all.add(60);
		all.add(20);
		all.add(10);
		all.add(67);
		all.add(98);
		all.add(5);
		all.add(13);
		all.add(94);
		System.out.println("Integer Sorted");
		Collections.sort(all);
		for(Integer i:all) {
		System.out.println(i);

	}
		Collections.reverse(all);
		System.out.println(all);
	}

}
