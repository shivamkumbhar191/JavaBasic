package lab;

import java.util.Arrays;
import java.util.Scanner;

class Movie{
	private String mname;
	private float rating;

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return mname+" "+rating;
	}
	
}
class Theater{
	private int id;
	private String name;
	private Movie m;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie getM() {
		return m;
	}
	public void setM(Movie m) {
		this.m = m;
	}
	public String toString() {
		return id+" "+name+" "+m;
	}
	
}
public class MovieArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater t[]= new Theater[2];
		Scanner sc= new Scanner (System.in);
		float rating=0;
		System.out.println("enter the details");
		for (int i=0;i<t.length;i++) {
			System.out.println("enter the theater id");
			int tid=sc.nextInt();
			System.out.println("enter the theater name");
			String tname=sc.next();
			System.out.println("enter the movie name");
			String mname= sc.next();
			System.out.println("enter the movie rating");
			rating=sc.nextFloat();
			
			Theater tr= new Theater();
			tr.setId(tid);
			tr.setName(tname);
			tr.setM(new Movie());
			tr.getM().setMname(mname);
			tr.getM().setRating(rating);
			
			t[i]=tr;
		}
		System.out.println(Arrays.toString(t));
		
		for (int i=0;i<t.length;i++) {
			for (int j=i+1;j<t.length;j++) {
				if(t[i].getM().getRating()<t[j].getM().getRating()) {
					Theater temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(t));
		
		sc.close();
	}
}