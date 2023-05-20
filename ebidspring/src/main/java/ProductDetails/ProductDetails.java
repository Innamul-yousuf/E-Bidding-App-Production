package ProductDetails;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productDetails")
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	private String pname;
	private long pcost;
	private String pseller;
	private String pbuyer;
	private short sold;
	private String color;
	private String model;
	private String img_link;
	private String Prodesc;
	private int flag;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getImg_link() {
		return img_link;
	}
	public void setImg_link(String img_link) {
		this.img_link = img_link;
	}
	
	public String getProdesc() {
		return Prodesc;
	}
	public void setProdesc(String prodesc) {
		Prodesc = prodesc;
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
	public long getPcost() {
		return pcost;
	}
	public void setPcost(long pcost) {
		this.pcost = pcost;
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

	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
}
