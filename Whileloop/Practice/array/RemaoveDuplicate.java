package array;

import java.util.Arrays;


public class RemaoveDuplicate {

	public static void main(String[] args) {

		int [] sample= {3,4,7,0,3,0,5,0,1};
		int[] newArray = new int[10];
		int count=0;
		
			
			for(int i=0;i<sample.length;i++)
			{
			 if(Arrays.asList(newArray).indexOf(sample[i])<0)
			 {
			 newArray[count++]=sample[i];
			
			}
			 System.out.println(sample[i]);
		}
			
		
		
		

	}

}
