package multiThreading;
//problem without using the Synchronization
class Table{  
//void printTable(int n){//method not synchronized (Execute both thread randomly)
   synchronized	void printTable(int n){//method synchronized (Excecutes 1st thread then another)

   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  }  
   class MyThread1 extends Thread{  
   Table t;  //taking the reference of table class
   MyThread1(Table t){  
   this.t=t;  
}  
   public void run(){  
   t.printTable(5);  
 }  }  
   class MyThread2 extends Thread{  
   Table t;  //again taking the reference of table class
   MyThread2(Table t){  
   this.t=t;  
}  
   public void run(){  
    t.printTable(100);  
 }  }  
  
     class TestSynchronization1{  
     public static void main(String args[]){  
     Table obj = new Table();//only one object  
     MyThread1 t1=new MyThread1(obj);  
     MyThread2 t2=new MyThread2(obj);  
     t1.start();  
     t2.start();  
 }  }  
