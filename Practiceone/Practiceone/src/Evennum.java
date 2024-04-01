
public class Evennum {
	
	public static void main(String[] args) {
		
		int arry[]= {3,55,6,4,333,66,8,44,88};
		int count=0;
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]%2==0) {
				
				count++;
				System.out.println("even number---"+arry[i]);
			}else
			{
				System.out.println("0dd number-----"+arry[i]);
			}
			
		}
		System.out.println("total count--"+count);
		}

}
     


