package string;

public class SplitMethodUse {

	public static void main(String[] args) {

		String s="www111hh hhttttttt mmmm";
		
		//String[] s1=s.split("t", 0);
		String s1 = null;
		for(String w:s.split("\\s", 0)) {
			s1=w;
		}
		System.out.println(s1);

		
	}

}
