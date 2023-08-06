package serialization;

import java.io.Serializable;

public class UserTransient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String uname;
	transient String upass;
	
	
	public UserTransient(int uid, String uname, String upass) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
	}
	public UserTransient() {
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "UserTransient [uid=" + uid + ", uname=" + uname + "]";
	}
	
	

}
