package test2;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=420;
		int count=0;
		String s=Integer.toString(num);
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='0') {
				count++;
			}
		}
		if(ch[0]!='0' && count==1) {
			System.out.println("duck number");
		}
		else {
			System.out.println("not duck number");
		}
	//	System.out.println(count);

	}

}
