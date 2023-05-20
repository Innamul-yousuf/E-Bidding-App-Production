package ProductDetails;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Bidder.Bidder;
import Bidder.BidderService;

@Repository
@ComponentScan(basePackages = "Product")
public interface ProductDetailsRespository extends JpaRepository<ProductDetails, Long>{
//public int checkValidBidAndUpdate(Long bid_amt, Long pid, Long bid);
	
}
