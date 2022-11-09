package String;

import java.util.StringTokenizer;

//Simple way to break a String ;(java.util.StringTokenizer)
public class StringTokenizerEg {
public static void show() {
	StringTokenizer st=new StringTokenizer("anudip Foundation Skill and Development Centre");
	while(st.hasMoreTokens()) {//boolean method ,it check if there is more tokens
		System.out.print(st.nextToken(" "));
		StringTokenizer st1=new StringTokenizer("Shillong is called, the scotland of india");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken(","));
	}}}
public static void main(String[] args) {
	show();
}
}
