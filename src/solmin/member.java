package solmin;

import javax.swing.JLabel;

public class member {
	private String name;
	private String id;
	private String password;
	private int time;
	private int cardnumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int gettime() {
		return cardnumber;
	}
	public void settime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "member [name=" + name + ", id=" + id + ", password=" + password + ", time=" + time + ", cardnumber="
				+ cardnumber + "]";
	}
	
	
	
	
	
	
}
