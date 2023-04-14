package SellerProduct;

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
public class SellerProductController {
	
	@Autowired
	private SellerProductService sellerproductService;
	
	@GetMapping("/sellerproduct")
	public List<SidPid> getAllProduct(){
		return sellerproductService.getAllSidPids();
	}
	
	@GetMapping("/sellerproduct/{sid}/{pid}")
	public SidPid getProductById(@PathVariable("sid") Long sid, @PathVariable("pid") Long pid) {
		SellerProduct bidderProduct=new SellerProduct(sid, pid);
		return sellerproductService.getSidPidById(bidderProduct);
	}
	
	@PostMapping("/sellerproduct")
	public SidPid createProduct(@RequestBody SidPid product) {
		return sellerproductService.createSidPid(product);
	}
	
//	@PutMapping("/bidderproduct/{bid}/{pid}")
//	public BidPid updateProduct(@PathVariable(value="bid") Long bid, @PathVariable(value="pid") Long pid,@RequestBody BidPid product) {
//		BidderProduct bidderProduct=new BidderProduct(bid, pid);
//		return bidderproductService.updateBidPid(product, bidderProduct);
//	}
	
	 @PutMapping("sellerproduct/{sid}/{pid}")
	    public SidPid updateBidderProduct(@PathVariable(value = "sid") Long sid,
	                                             @PathVariable(value = "pid") Long pid,
	                                             @RequestBody SidPid bidderProductDetails) {
	        SellerProduct bidderProductId = new SellerProduct(sid, pid);
	        return sellerproductService.updateSellerProduct(bidderProductId, bidderProductDetails);
	    }
	
	@DeleteMapping("/sellerproduct/{sid}/{pid}")
	public void deleteProduct(@PathVariable("sid") Long sid, @PathVariable("pid") Long pid) {
		SellerProduct bidderProduct=new SellerProduct(sid, pid);
		sellerproductService.deleteSidPid(bidderProduct);

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
	
	@PostMapping("/sellerproduct/{sid}/{pid}/{sid_amt}")
	public void updateBidAmout(@PathVariable("sid") Long sid, @PathVariable("pid") Long pid, @PathVariable Long sid_amt) {
		sellerproductService.updateSellerProductPrice(sid, pid, sid_amt);
	}
}
