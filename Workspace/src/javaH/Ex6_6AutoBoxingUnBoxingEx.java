package javaH;

class p{
	
}

public class Ex6_6AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n = 10;
		Integer intObject = n;
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10;
	    System.out.println("m = " + m);*/
	    
	    String a = "Hello";
	    String b = "Java";
	    String c = "Hello";
	    String d = new String("Hello");
	    String e = new String("Java");
	    String f = new String("Java");
	    
	    System.out.println(a.toString().equals(c.toString()));
	    System.out.println(a.toString().equals(d.toString()));
	    
	    System.out.println(a.hashCode());

	}

}
