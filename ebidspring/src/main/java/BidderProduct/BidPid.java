package BidderProduct;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="BidderProduct")
public class BidPid {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bid;
	private long pid;
	private String pname;
	private String bname;
	private long bid_amt;
	private short flag;
	
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public long getBid_amt() {
		return bid_amt;
	}
	public void setBid_amt(long bid_amt) {
		this.bid_amt = bid_amt;
	}
	public short getFlag() {
		return flag;
	}
	public void setFlag(short flag) {
		this.flag = flag;
	}
	
}
