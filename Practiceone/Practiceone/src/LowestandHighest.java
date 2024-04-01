

public class LowestandHighest {

	public static void main(String[] args) {
		
		int [] arr= {2,5,8,9,17,1,26};
//		
//		int value=arr[0];
//		for(int i=1; i<arr.length; i++)
//		{
//			if(arr[i] < value) {
//				
//				value=arr[i];
//			}
//		}
//		System.out.println("lowest value--"+value);
//	}
//		int value=arr[0];
//		for(int i=1; i<arr.length; i++)
//		{
//			if(arr[i] > value) {
//				
//				value=arr[i];
//			}
//		}
//		System.out.println("Highest value--"+value);
//	}
		
//		int sum=0;
//		for(int i=1; i<arr.length; i++)
//		{
//			sum = sum +arr[i];
//		}
//		System.out.println("sum value--"+sum);
//	}
		
		int sum=0;
		int avg=5;
		for(int i=1; i<arr.length; i++)
		{
			sum = sum +arr[i];
			//avg = avg+arr[i];
		}
		System.out.println("sum value--"+sum/avg);
	}
}
