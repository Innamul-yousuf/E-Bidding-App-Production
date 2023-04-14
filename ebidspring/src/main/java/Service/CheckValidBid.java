package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import Bidder.Bidder;
import Bidder.BidderRespository;
import Bidder.BidderService;
import Product.EbidspringApplication;
import Product.Product;
import Product.ProductDAO;
import Product.ProductRespository;
import Product.ProductService;

@Service
public class CheckValidBid {
	
//	@Autowired
//	Bidder bidder=new Bidder();
	@Autowired
	public ProductRespository productRespository=EbidspringApplication.prso;
	
	public ProductDAO productDAO=EbidspringApplication.pDAO;
	
	ProductService productService=EbidspringApplication.pso;
//	ProductService productService = new ProductService();
	//@Autowired
//	Product product =new Product();

//	@Autowired
//	BidderService bidderService=new BidderService();
//	@Autowired
//	BidderRespository bidderRespository;
//	
	public int checkValidBidAndUpdate(Long bid_amt, Long pid, Long bid) {
		
	

	//ProductService productService = new ProductService();
	Product product =new Product();
	
	BidderService bidderService=new BidderService();
//	Bidder bidder=new Bidder();
	product = productRespository.findById(pid).get();
	Long currentCost = product.getPcost();
	
	if (currentCost < bid_amt) {
		int validBidder=bidderService.checkValidBidder(bid);
		if(validBidder==1) {
			if(product.getSold()==1) {
				productService.updatePcostByPid(pid, bid_amt);
			}
			else {
				System.out.println("Bidding Time started or Ended!");
			}
		}else {
			System.out.println("Invalid Bidder");
		}
		return 1;
	} else {
		System.out.println("Low Bid Amount!");
		return 0;
	}
}
	
}
