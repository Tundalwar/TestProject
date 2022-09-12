package array;

public class DuplicateRemove {

	public static void main(String[] args) {
		int [] sample= new int[] {3,4,7,0,3,0,5,0,1};
		int i,j;
		for(i=0;i<sample.length;i++)
		{
			for(j=i+1;j<sample.length;j++)
			{
				if(sample[i]==sample[j])
				{
				System.out.println(sample[j]);
				}
			}
		}

	//	System.out.println(sample[i]);
		
	}

}
