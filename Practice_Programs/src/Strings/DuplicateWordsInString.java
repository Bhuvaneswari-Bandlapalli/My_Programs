package Strings;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String s="show see the show see in the theater";
		String words[]=s.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++) {
			for(int j=i;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count=count+1;
				}
			}
			if(count>1) {
				System.out.println(words[i]);
			}
			}
		

	}

}
