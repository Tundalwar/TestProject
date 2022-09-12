package hierchical;

public class SubClass3 extends Super {
	
	public void m4() {
		System.out.println("Im in method4");
	}

	
	
	public static void main(String [] args) {
		
		SubClass3 obj=new SubClass3();
		obj.m1();
		obj.m4();
		
		SubClass2 obj1=new SubClass2();
		obj1.m3();
		
	}
	
}
