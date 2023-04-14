package SellerProduct;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class SellerProduct implements Serializable {


	public SellerProduct(long sid, long pid) {
		this.sid = sid;
		this.pid = pid;
	}

	public SellerProduct() {
		// TODO Auto-generated constructor stub
	}

	@Column(name = "sid")
	private Long sid;

	@Column(name = "pid")
	private Long pid;

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

}
