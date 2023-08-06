package arrays;

import java.util.Arrays;

public class CommonElementMerging {

	public static void main(String[] args) {
		String s1[]= {"java","c","python","oracle"};
		String s2[] ={"Angulat","Springboot","java","sql","oracle"};
		mergecommon(s1,s2);	
	}
	public static void mergecommon(String[] s1, String[] s2) {
		String common="";
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					common=common+s1[i]+" ";
				}
			}
		}
		common=common.trim();
		String s3[]=common.split(" ");
		System.out.println(Arrays.toString(s3));
	}
	

}
