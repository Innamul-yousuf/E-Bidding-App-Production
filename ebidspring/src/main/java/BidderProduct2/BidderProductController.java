package BidderProduct2;

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
	
	@GetMapping("/bidderproduct/{bid}/{pid}")
	public BidPid getProductById(@PathVariable("bid") Long bid, @PathVariable("pid") Long pid) {
		BidderProduct bidderProduct=new BidderProduct(bid, pid);
		return bidderproductService.getBidPidById(bidderProduct);
	}
	
	@PostMapping("/bidderproduct")
	public BidPid createProduct(@RequestBody BidPid product) {
		return bidderproductService.createBidPid(product);
	}
	
//	@PutMapping("/bidderproduct/{bid}/{pid}")
//	public BidPid updateProduct(@PathVariable(value="bid") Long bid, @PathVariable(value="pid") Long pid,@RequestBody BidPid product) {
//		BidderProduct bidderProduct=new BidderProduct(bid, pid);
//		return bidderproductService.updateBidPid(product, bidderProduct);
//	}
	
	 @PutMapping("bidderproduct/{bid}/{pid}")
	    public BidPid updateBidderProduct(@PathVariable(value = "bid") Long bid,
	                                             @PathVariable(value = "pid") Long pid,
	                                             @RequestBody BidPid bidderProductDetails) {
	        BidderProduct bidderProductId = new BidderProduct(bid, pid);
	        return bidderproductService.updateBidderProduct(bidderProductId, bidderProductDetails);
	    }
	
	@DeleteMapping("/bidderproduct/{bid}/{pid}")
	public void deleteProduct(@PathVariable("bid") Long bid, @PathVariable("pid") Long pid) {
		BidderProduct bidderProduct=new BidderProduct(bid, pid);
		bidderproductService.deleteBidPid(bidderProduct);

	}
	
//	@PostMapping("/bidderproducts")
//    public ResponseEntity<BidPid> createBidderProduct(@RequestBody BidderProduct request) {
//        BidPid bidderProduct = new BidPid();
//        bidderProduct.setBid(request.getBid());
//        bidderProduct.setPid(request.getPid());
//        
//        BidderProductService bidderProductService=new BidderProductService();
//        BidPid savedBidderProduct = bidderProductService.createBidPid(bidderProduct);
//        return ResponseEntity.ok(savedBidderProduct);
//    }
	
	@PostMapping("/bidderproduct/{bid}/{pid}/{bid_amt}")
	public void updateBidAmout(@PathVariable("bid") Long bid, @PathVariable("pid") Long pid, @PathVariable Long bid_amt) {
		bidderproductService.updateBidderProductPrice(bid, pid, bid_amt);
	}
}
