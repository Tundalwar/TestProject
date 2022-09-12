package string;

public class AllStringMethods {

	public static void main(String[] args) {
		
		
		String s= new String("ABCD bhjki lkjhg");
		System.out.println(s);
		String s1=s.concat("EFGH");
		System.out.println(s1);
	
		String t="IJKL";
		String t1=t.concat("MNOP");
		System.out.println(t1);
		
		System.out.println(s.charAt(0));//character at index
		System.out.println(s.indexOf("A"));//it will give index value of character
		System.out.println(s.lastIndexOf("D"));
	System.out.println(s.length());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.equals(t));
	
	System.out.println(s.replaceAll("\\s", ""));
	}

}
