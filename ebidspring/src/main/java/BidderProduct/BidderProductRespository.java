package BidderProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface BidderProductRespository extends JpaRepository<BidPid, BidderProduct>{

	BidPid save(BidderProduct product);

//	 @Modifying
//	    @Query("UPDATE BidderProduct e SET e.bid_amt = :bid_amt WHERE e.id = :id")
//	    void updateFieldById(Long id, Long bid_amt);

	
}
