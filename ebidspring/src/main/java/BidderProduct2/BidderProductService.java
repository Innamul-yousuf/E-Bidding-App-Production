package BidderProduct2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Product.ProductRespository;

@Service
public class BidderProductService {
	
	@Autowired
	private BidderProductRespository bidderProductRespository;
	
	@Autowired
	public BidderProductDao bidderProductDao;
	public BidPid createBidPid(BidPid product) {
		return bidderProductRespository.save(product);
	}
//	public BidPid updateBidPid(BidderProduct bidderProductId,BidderProduct bidderProduct) {
//		BidPid bp=bidderProductRespository.findById(bidderProduct).orElse(null);
//		bp.setBid_amt(bidderProductId.getBid_amt());
//		bp.setBname(bidderProductId.getBname());
//		bp.setFlag(bidderProductId.getFlag());
//		bp.setPname(bidderProductId.getPname());
//		return bidderProductRespository.save(bidderProduct);
//	}
	 public BidPid updateBidderProduct(BidderProduct bidderProductId, BidPid bidderProductDetails) {
	        BidPid bidderProduct = bidderProductRespository.findById(bidderProductId).orElse(null);
	        
	        bidderProduct.setBid_amt(bidderProduct.getBid_amt());
	        bidderProduct.setPname(bidderProductDetails.getPname());
	        bidderProduct.setBname(bidderProductDetails.getBname());
	        bidderProduct.setFlag(bidderProductDetails.getFlag());
	        
	        return bidderProductRespository.save(bidderProduct);
	    }
	public void deleteBidPid(BidderProduct bidderProduct) {
		bidderProductRespository.deleteById(bidderProduct);
	}
	public List<BidPid> getAllBidPids(){
		return bidderProductRespository.findAll();
	}
	public BidPid getBidPidById(BidderProduct bp){
		return bidderProductRespository.findById(bp).orElse(null);
	}
	
	public void updateBidderProductPrice(Long bidderId, Long productId, Long price) {
	 bidderProductDao.updateBidderProductPrice(bidderId, productId, price);
    }
	
	
	
}
