//Multiple inheritance is not supported through class in java but it is possible by interface, why?
	interface Printable{  
	void print();  
	}  
	interface Showable{  
	void print();  
      }  
	  
	class TestTnterface1nterface1 implements Printable,Showable{  
	public void print(){System.out.println("Hello java");}  
	public static void main(String args[]){  
	TestTnterface1 obj = new TestTnterface1();  
	obj.print();  
	 }  
	}  
