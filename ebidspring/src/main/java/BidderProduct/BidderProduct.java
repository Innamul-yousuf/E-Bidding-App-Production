package BidderProduct;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BidderProduct implements Serializable{
	public BidderProduct(long bid,long pid) {
		this.bid=bid;
		this.pid=pid;
	}
	public BidderProduct() {
		// TODO Auto-generated constructor stub
	}
	@Column(name="bid")
	private Long bid;
	
	@Column(name="pid")
	private Long pid;
	
	
}
