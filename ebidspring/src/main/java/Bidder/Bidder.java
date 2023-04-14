package Bidder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bidder")
public class Bidder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bid;
	private String bname;
	private String bpass;
	private String bemail;
	private long bphone;
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBpass() {
		return bpass;
	}
	public void setBpass(String bpass) {
		this.bpass = bpass;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	public long getBphone() {
		return bphone;
	}
	public void setBphone(long bphone) {
		this.bphone = bphone;
	}
	
	
}
