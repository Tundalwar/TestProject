package string;

public class AddNum {
	
	public static void main(String [] args) {
		
		String name="MyName@125678#welcome";
		int num=0;
		
		
		for(int i=0;i<name.length();i++) {
			
		

		char ch=name.charAt(i);

		if((ch>='A')&&(ch<='z')) {
			
			//System.out.print(ch);
		}
		else {
			String a=	name.valueOf(i);
			System.out.print(" "+a);
		}
		}

	}

	
}
