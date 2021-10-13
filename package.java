//Example of package that import the packagename.*
	//save by A.java  
	package pack;  
	public class one{  
	  public void msg(){System.out.println("welcome to java");}  
	}  
	//save by B.java  
	  

	  
	class two{  
	  public static void main(String args[]){  
	   one obj = new one();  
       obj.msg();  
	  }  
	}  
