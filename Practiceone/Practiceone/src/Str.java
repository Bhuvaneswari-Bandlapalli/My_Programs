

public class Str {
	
	public static void main(String[] args) {
	
//		String [] k = {"siva","ramu","hindu","lahari","sadvi","advi","nandu"};
//		for(int i=0; i<=k.length-1; i++)
//		{
//			System.out.println(k[i]);
//		}
//		
		String s = "repatisomeshkumar";
		for(int i=0; i<=s.length()-1; i++)
		{
			System.out.println(s.charAt(i));
		}
	
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
    
}
