package whileloop;

public class FibanociSeries {

	public static void main(String[] args) {

		
	//	0 1 1 2 3 5 8 13
		int num=0;
		int a=0;
		int b=1,c;
		
		while(num<=10) {
			
			c=a+b;//1
		 
			a=b;
			b=c;
		
			num++;
			
			System.out.print(a+" ");

		}

	}

}
