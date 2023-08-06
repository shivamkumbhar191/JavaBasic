package test2;

public class Anagram {
	public static void anagram(String a, String b) {
		boolean isanagram=true;
		if(a.length()==b.length()) {
			char a1[]=a.toCharArray();
			char b1[]=b.toCharArray();
			for(int i=0;i<a1.length;i++) {
				for(int j=0;j<b1.length;j++) {
					if(a1[i]==b1[j]) {
						a1[i]='0';
						b1[j]='0';
						break;
					}
				}	
			}
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!='0') {
					isanagram=false;
				}
			}
//			System.out.println(Arrays.toString(a1));
//			System.out.println(Arrays.toString(b1));
		}else {
			isanagram=false;
		}
		if(isanagram==false) {
			System.out.println("not anagram");
		}else {
			System.out.println("anagram");
		}
	}

	public static void main(String[] args) {
		String a="ship";
		String b="phis";
		anagram(a,b);

	}

}
