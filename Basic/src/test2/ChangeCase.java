package test2;

public class ChangeCase {

	public static void changecase(String str) {
		char ch[]= str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
			str=str+(char) (ch[i]-32);
			}else {
				str=str+(char) (ch[i]+32);
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pRogram";
		changecase(str);

	}

}
