package string;

public class ReverseString {

	public static void main(String[] args) {

		String name ="Shweta";
		String reverse="";
		
		for(int i=name.length()-2;i>0;i--)
		{
			reverse=reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		String s="My name is shweta";
		String[] word=s.split("\\s");
		
		String reversestring=" ";
		
		for(String w:word) {
			
			String reverseword=" ";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			
			reversestring=reversestring+reverseword+" ";
			
		}
		
		System.out.println(reversestring);
		
	
	
	}

	

}
