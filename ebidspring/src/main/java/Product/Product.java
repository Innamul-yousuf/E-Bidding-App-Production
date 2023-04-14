package Product;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	private String pname;
	private long pcost;
	private java.util.Date starttime;
	private java.util.Date endtime;
	private String pseller;
	private String pbuyer;
	private short sold;
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
	public long getPcost() {
		return pcost;
	}
	public void setPcost(long pcost) {
		this.pcost = pcost;
	}
	public java.util.Date getStarttime() {
		return starttime;
	}
	public void setStarttime(java.util.Date starttime) {
		this.starttime = starttime;
	}
	public java.util.Date getEndtime() {
		return endtime;
	}
	public void setEndtime(java.util.Date endtime) {
		this.endtime = endtime;
	}
	public String getPseller() {
		return pseller;
	}
	public void setPseller(String pseller) {
		this.pseller = pseller;
	}
	public String getPbuyer() {
		return pbuyer;
	}
	public void setPbuyer(String pbuyer) {
		this.pbuyer = pbuyer;
	}
	public short getSold() {
		return sold;
	}
	public void setSold(short sold) {
		this.sold = sold;
	}
	
}
