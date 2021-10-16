//private access modifier
	class A{  
	private int data=30;  
	private void msg(){System.out.println("welcome to java");}  
	}  
	  
	public class Simple{  
	 public static void main(String args[]){  
	   A obj=new A();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	   }  
	}  
