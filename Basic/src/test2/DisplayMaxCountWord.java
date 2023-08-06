package test2;

import java.util.HashMap;
import java.util.Map;

public class DisplayMaxCountWord {

	public static void countword(String s1[]) {
		int max=0;
		Map<String,Integer> mp= new HashMap<>();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=="") {
				continue;
			}
			int count=1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					count++;
					s1[j]="";
				}
			}
			mp.put(s1[i], count);
			if(max<=count) {
				max=count;
			}
		}
		for(Map.Entry<String, Integer> hm:mp.entrySet()) {
			if(max==hm.getValue()) {
				System.out.println(hm.getKey());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I like java and I love java";
		String s1[]=str.split(" ");
		System.out.println(str);
		countword(s1);
	}
}
