package SellerProduct;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SellerProduct")
public class SidPid {

//	@Id
//	private long bid;
//	private long pid;

	@EmbeddedId
	private SellerProduct sidpid;
	private String pname;
	private String sname;
	private long sid_amt;
	private short flag;

	public SellerProduct getSidpid() {
		return sidpid;
	}

	public void setSidpid(SellerProduct bidpid) {
		this.sidpid = bidpid;
	}

//	public long getBid() {
//		return bid;
//	}
//	public void setBid(long bid) {
//		this.bid = bid;
//	}
//	public long getPid() {
//		return pid;
//	}
//	public void setPid(long pid) {
//		this.pid = pid;
//	}
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	public long getSid_amt() {
		return sid_amt;
	}

	public void setSid_amt(long sid_amt) {
		this.sid_amt = sid_amt;
	}

	public short getFlag() {
		return flag;
	}

	public void setFlag(short flag) {
		this.flag = flag;
	}

}
