package string;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java";
		String s3=new String("java");
		System.out.println("bvbn"+s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s3.intern());
		//System.out.println(s3.hashCode());
		System.out.println(s3=s3.intern());
		//System.out.println(s3.hashCode());
		System.out.println(s1==s3);
		StringBuffer s4= new StringBuffer(s1);
		System.out.println();
	}

}
