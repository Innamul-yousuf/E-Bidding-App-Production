package Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import Bidder.Bidder;
import Bidder.BidderRespository;
import Bidder.BidderService;
import Product.Product;
import Product.ProductRespository;
import Product.ProductService;
//
//@Service
//@ComponentScan(basePackages = "Product")
//public class CheckValidBid {
//	
////	@Autowired
////	Bidder bidder=new Bidder();
//	
//	@Autowired
//	public ProductRespository productRespository=com.example.demo.EbidspringApplication.prso;
////	public CheckValidBid(ProductRespository productRespository) {
////		 this.productRespository = productRespository;
////	}
////	@Autowired
////	private BidderRespository bidderRespository;
////	public CheckValidBid(BidderRespository bidderRespository) {
////		 this.bidderRespository = bidderRespository;
////	}
////	public CheckValidBid() {
////		// TODO Auto-generated constructor stub
////	}
//	
////	@Autowired
////	ProductService productService = new ProductService();
//	//@Autowired
////	Product product =new Product();
//
////	@Autowired
////	BidderService bidderService=new BidderService();
////	@Autowired
////	BidderRespository bidderRespository;
////	
//	public int checkValidBidAndUpdate(Long bid_amt, Long pid, Long bid) {
//
//		ProductService productService = new ProductService();
//		Product product =new Product();
//		BidderService bidderService=new BidderService();
////		CheckValidBid cv=new CheckValidBid(ProductRespository productRespository);
//		product = productRespository.findById(pid).get();
//		Long currentCost = product.getPcost();
//		
//		if (currentCost < bid_amt) {
//			int validBidder=bidderService.checkValidBidder(bid);
//		
//				if(product.getSold()==1) {
//					productService.updatePcostByPid(pid, bid_amt);
//				}
//				else {
//					System.out.println("Bidding Time started or Ended!");
//				}
//			
//			
//		} else {
//			System.out.println("Low Bid Amount!");
//			return 0;
//		}
//		return 0;
//	}
//	
//	
//}
