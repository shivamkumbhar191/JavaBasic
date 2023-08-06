package string;

public class FirstLetterChange {

	public static void main(String[] args) {
		String s="shivam kumbhar";
		changecase(s);
		reverseW2W(s);

	}

	public static void reverseW2W(String s) {
		String str[]=s.split(" ");
	//	System.out.println(Arrays.toString(str));
		String rev="";
		for(int i=0;i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		
		}
		System.out.println(rev);
		
	}

	public static void changecase(String s) {
		// TODO Auto-generated method stub
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				if(ch[i+1]>='a' && ch[i+1]<='z') {
					ch[i+1]=(char) (ch[i+1]-32);
				}	
			}
			else if(ch[0]>='a' && ch[0]<='z') {
				ch[0]=(char) (ch[0]-32);		
			}
			System.out.print(ch[i]);
		}
		System.out.println();
		
	}

}
