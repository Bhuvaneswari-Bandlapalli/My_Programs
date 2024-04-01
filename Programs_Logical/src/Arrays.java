
public class Arrays {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=8;
		arr[4]=10;
		int sum=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					sum=arr[i];
				}
						
			}
			
		}
		System.out.println(sum);
				}

}
