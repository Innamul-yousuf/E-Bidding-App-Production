package BidderProduct2;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class BidderProduct implements Serializable {
	public BidderProduct(long bid, long pid) {
		this.bid = bid;
		this.pid = pid;
	}

	public BidderProduct() {
		// TODO Auto-generated constructor stub
	}

	@Column(name = "bid")
	private Long bid;

	@Column(name = "pid")
	private Long pid;

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

}
