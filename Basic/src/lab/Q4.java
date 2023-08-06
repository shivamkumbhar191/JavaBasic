package lab;

class Person{
	int id;
	String name;
	Job jb;
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
	public Job getJb() {
		return jb;
	}
	public void setJb(Job jb) {
		this.jb = jb;
	}
	
}
class Job{
	int jobId;
	String profile;
	JoiningDate jd;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public JoiningDate getJd() {
		return jd;
	}
	public void setJd(JoiningDate jd) {
		this.jd = jd;
	}
	
	
}
class JoiningDate{
	int day;
	int month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person();
		p.setId(101);
		p.setName("uday");
		p.setJb(new Job());
		
		Job j=p.getJb();
		j.setJobId(45102);
		j.setProfile("worker");
		j.setJd(new JoiningDate());
		
		JoiningDate dt=j.getJd();
		dt.setDay(1);
		dt.setMonth(9);
		dt.setYear(2022);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(j.getJobId());
		System.out.println(j.getProfile());
		System.out.println(dt.getDay()+"/"+dt.getMonth()+"/"+dt.getYear());
		
		

	}

}
