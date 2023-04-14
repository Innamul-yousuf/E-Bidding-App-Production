package Bidder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bidderC")

public class BidderController {
	
	@Autowired
	private BidderService bidderService;
	
	 public BidderController(BidderService bidderService) {
	        this.bidderService = bidderService;
	    }
	
	@GetMapping("/bidder")
	public List<Bidder> getAllBidders(){
		return bidderService.getAllBidders();
	}
	
	@GetMapping("/bidder/{id}")
	public Bidder getBidderById(@PathVariable Long id) {
		return bidderService.getBidderById(id);
	}
	
	@PostMapping("/bidder")
	public Bidder createBidder(@RequestBody Bidder bidder) {
		return bidderService.createBidder(bidder);
	}
	
	@PutMapping("/bidder/{id}")
	public Bidder updateBidder(Bidder bidder) {
		return bidderService.updateBidder(bidder);
	}
	
	@DeleteMapping("/bidder/{id}")
	public void deleteBidder(@PathVariable Long id) {
		bidderService.deleteBidder(id);
	}
	@GetMapping("/bidder/check/{id}")
	public void checkBidder(@PathVariable Long id) {
		bidderService.checkValidBidder(id);
	}
	@GetMapping("/service/getname/{bid}")
	public void getBidderName(@PathVariable Long bid) {
		bidderService.getBidderName(bid);
	}
	@PostMapping("/bidderLogin/{bid}/{bpass}")
	public int checkBidderLogin(@PathVariable Long bid,@PathVariable String bpass) {
		int i=bidderService.checkBidderLogin(bid, bpass);
		if(i==1) {
			System.out.println("C pass");
			return 1;
		}else {
			return 0;
		}
	}
}
