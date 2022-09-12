package string;

public class BreakString {

	public static void main(String[] args) {

		String s="aaavvvvvvvvrrrrhhhhh";
		String s1="";
		String s2="";
		
		for(int i=0;i<(s.length()/2)-1;i++) {
			
			s1=s1+s.charAt(i);
		}
		
		for(int i=s.length()/2;i<s.length()-1;i++) {
			
			s2=s2+s.charAt(i);
		}
		
		System.out.println(s2);
		
	
	
	
	}

}
