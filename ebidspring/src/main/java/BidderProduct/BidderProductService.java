package BidderProduct;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidderProductService {
	
	@Autowired
	private BidderProductRespository bidderProductRespository;
	
	public BidPid createBidPid(BidPid product) {
		return bidderProductRespository.save(product);
	}
	public BidPid updateBidPid(BidPid product) {
		return bidderProductRespository.save(product);
	}
	public void deleteBidPid(BidPid bp) {
		bidderProductRespository.delete(bp);
	}
	public List<BidPid> getAllBidPids(){
		return bidderProductRespository.findAll();
	}
	public BidPid getBidPidById(BidderProduct bp){
		return bidderProductRespository.findById(bp).orElse(null);
	}
	
}
