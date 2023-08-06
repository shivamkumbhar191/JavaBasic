package arrayassignment;

public class Q10HW {

	public static void main(String[] args) {
		char ch[] = {'a', 'D',  'e', 'x', 'z', 'B'};
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch[0]);
		

	}

}
