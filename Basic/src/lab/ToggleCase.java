package lab;

public class ToggleCase {
	
	public static void togglecase(String s) {
		
		
		for (int i=0;i<s.length();i++) {
			if( s.charAt(i)>=97 && s.charAt(i)<=122) {
				s=s.toUpperCase();	
			}
			else if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				s=s.toLowerCase();
			}
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JavA";
		
		togglecase(str);

	}

}
