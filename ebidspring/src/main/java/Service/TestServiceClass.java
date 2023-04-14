package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Bidder.BidderRespository;
import Bidder.BidderService;
import Product.ProductService;

public class TestServiceClass {
	
	public static void main(String[] args) {
		
		Long bid=8881L;
//		checkValidBid.checkValidBidder(bid);
	BidderService bidderService=new BidderService();
	bidderService.checkValidBidder(bid);
	}
}
