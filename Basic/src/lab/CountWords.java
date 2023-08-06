package lab;

public class CountWords {
	
	public static void countword(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			count=1;
			if(s.contains(" ")) {
				count++;
			}
			
		}
		int totalWord=count+1;
		System.out.println("total number of word :"+totalWord);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java programming lauguage";
		countword(str);
		
	//	String spiltword[]=str.split(" ");
	//	System.out.println("total number of word :"+spiltword.length);

	}

}
