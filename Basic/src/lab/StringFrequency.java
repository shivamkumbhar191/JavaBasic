package lab;

public class StringFrequency {
	
	public static void charFrequency(char ch[]) {
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>1) {
			System.out.println(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Programming";
		String str1=str.toLowerCase();
		char ch[]= str1.toCharArray();
		
		charFrequency(ch);

	}

}
