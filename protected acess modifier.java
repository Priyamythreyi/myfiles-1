//protected access modifier
	//save by A.java  
	package pack;  
	public class one{  
	protected void msg(){System.out.println("Hello java");}  
	}  
	//save by B.java  
	package mypack;  
	import pack.*;  
	  
	class two extends one{  
	  public static void main(String args[]){  
	   two obj = new two();  
	   obj.msg();  
	  }  
	}  
