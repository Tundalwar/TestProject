package string;

public class PalidromeString {

	public static void main(String[] args) {

		String num="121";
		String rev ="";
		
		for(int i=num.length()-1;i>=0;i--) {
			
			rev=rev+num.charAt(i);
		}
		
		if(num.equals(rev)) {
			
			System.out.println("palidrome number"+" "+rev);
			
		}
		else {
			System.out.println("not a palidrome number");
		}
		
	}

}
