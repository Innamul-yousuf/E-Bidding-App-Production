package BidderProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidderProductController {
	
	@Autowired
	private BidderProductService bidderproductService;
	
	@GetMapping("/bidderproduct")
	public List<BidPid> getAllProduct(){
		return bidderproductService.getAllBidPids();
	}
	
	@GetMapping("/bidderproduct/")
	public BidPid getProductById(@PathVariable("bid") Long bid, @PathVariable("pid") Long pid) {
		BidderProduct bidderProduct=new BidderProduct(bid, pid);
		return bidderproductService.getBidPidById(bidderProduct);
	}
	
	@PostMapping("/bidderproduct")
	public BidPid createProduct(@RequestBody BidPid product) {
		return bidderproductService.createBidPid(product);
	}
	
	@PutMapping("/bidderproduct/{id}")
	public BidPid updateProduct(BidPid product) {
		return bidderproductService.updateBidPid(product);
	}
	
	@DeleteMapping("/bidderproduct/{bp}")
	public void deleteProduct(@PathVariable BidderProduct bp) {
		bidderproductService.deleteBidPid(null);
	}
	
	
}
