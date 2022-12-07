package collectionJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUserDefined {

	public static void main(String[] args) {
Bank b=new Bank(12345,"Misbah",50000.43,22);
Bank b1=new Bank(12346,"Nisha",40000.32,21);
Bank b2=new Bank(12347,"Somyo",44000.48,23);
Bank b3=new Bank(12348,"Abhishiek",55000.73,22);
Bank b4=new Bank(12349,"Shruti",50000.55,22);
Bank b5=new Bank(12350,"Sourav",52000.22,24);

ArrayList<Bank>al=new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b5);
al.add(b3);
al.add(b2);
al.add(b4);
Iterator itr=al.iterator();
while(itr.hasNext()) {
	Bank obj=(Bank) itr.next();
	System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
	
}




	}

}
