//default access modifier
	//save by A.java  
	package pack;  
	class one{  
	  void msg(){System.out.println("welcome to java");}  
	}  
	//save by B.java  
	package mypack;  
	import pack.*;  
	class two{  
	  public static void main(String args[]){  
	   A obj = new A();//Compile Time Error  
	   obj.msg();//Compile Time Error  
	  }  
	}  
