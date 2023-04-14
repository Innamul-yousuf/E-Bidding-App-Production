package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Bidder.BidderService;

@RestController
public class ServiceController {
	@Autowired
	CheckValidBid checkValidBidob;
	@Autowired
	private CheckValidBid checkValidBid;
	 public ServiceController(CheckValidBid checkValidBid) {
	        this.checkValidBid= checkValidBid;
	    }
		@GetMapping("/service/{bamt}/{pid}")
		public void checkValidBidAndUpdate(@PathVariable Long bamt, @PathVariable Long pid){
			checkValidBidob.checkValidBidAndUpdate(bamt, pid, pid);
		}
	
	
}
