package logical;

import java.util.Arrays;

public class Q1_FasciatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=192;
		String result="";
		int multi=1;
		for(int i=1;i<=3;i++) {
			multi=n*i;
			result=result+multi;
		}
		char ch[]=result.toCharArray();
		String str1="123456789";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		String str2="";
		for(int i=0;i<ch.length;i++) {
			str2=str2+ch[i];
			
		}
		
		if(str1.equals(str2)) {
			System.out.println("fascinate number");
		}else {
			System.out.println("not fascinate number");
		}
		
	}

}
