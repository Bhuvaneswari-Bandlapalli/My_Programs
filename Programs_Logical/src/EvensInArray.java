
public class EvensInArray {

	public static void main(String[] args) {
		//storing even numbers from 2 to 10 into array
		int arr1[]=new int[5];
		int even=2;
		for(int i=0;i<=4;i++) {
			arr1[i]=even;
			even=even+2;
		}
		for(int j=0;j<=4;j++) {
			System.out.println(arr1[j]);
		}

	}

}
