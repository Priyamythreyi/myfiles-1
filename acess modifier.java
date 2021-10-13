//private access modifier
	class A{  
	private int data=60;  
	private void msg(){System.out.println("Hello world");}  
	}  
	  
	public class Simple{  
	 public static void main(String args[]){  
	   A obj=new A();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	   }  
	}  
